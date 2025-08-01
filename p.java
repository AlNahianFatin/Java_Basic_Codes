import com.scott.pornhub.entities.Status;
import com.scott.pornhub.exceptions.PornhubAuthenticationFailedException;
import com.scott.pornhub.exceptions.PornhubDuplicateEntryException;
import com.scott.pornhub.exceptions.PornhubException;
import com.scott.pornhub.exceptions.PornhubInvalidParametersException;
import com.scott.pornhub.exceptions.PornhubNotFoundException;
import com.scott.pornhub.exceptions.PornhubServiceErrorException;
import com.scott.pornhub.services.AccountService;
import com.scott.pornhub.services.AuthenticationService;
import com.scott.pornhub.services.CertificationsService;
import com.scott.pornhub.services.ChangesService;
import com.scott.pornhub.services.CollectionsService;
import com.scott.pornhub.services.CompaniesService;
import com.scott.pornhub.services.ConfigurationService;
import com.scott.pornhub.services.CreditsService;
import com.scott.pornhub.services.DiscoverService;
import com.scott.pornhub.services.FindService;
import com.scott.pornhub.services.GenresService;
import com.scott.pornhub.services.GuestSessionService;
import com.scott.pornhub.services.KeywordsService;
import com.scott.pornhub.services.ListsService;
import com.scott.pornhub.services.MoviesService;
import com.scott.pornhub.services.NetworksService;
import com.scott.pornhub.services.PeopleService;
import com.scott.pornhub.services.ReviewsService;
import com.scott.pornhub.services.SearchService;
import com.scott.pornhub.services.TimezonesService;
import com.scott.pornhub.services.TvEpisodesService;
import com.scott.pornhub.services.TvSeasonsService;
import com.scott.pornhub.services.TvService;
import java.io.IOException;
import javax.annotation.Nullable;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

/**
 * Helper class for easy usage of the TMDB v3 API using retrofit.
 * <p>
 * <p>Create an instance of this class and then call any of the service methods.
 * <p>
 * <p>The service methods take care of constructing the required {@link Retrofit} instance and creating the service. It
 * is recommended you use your existing OkHttp client instance by overriding {@link #okHttpClient()}.
 * <p>
 * <p>Only one {@link Retrofit} instance is created upon the first and re-used for any consequent service method call.
 */
@SuppressWarnings("unused")
public class Pornhub {

    /**
     * API Related Information
     */
    public static final String API_HOST = "www.pornhub.com";
    public static final String API_URL = "https://" + API_HOST + "/";

    /**
     * API key, Session and Guest Session query parameter names.
     */
    public static final String PARAM_API_KEY = "api_key";
    public static final String PARAM_SESSION_ID = "session_id";
    public static final String PARAM_GUEST_SESSION_ID = "guest_session_id";

    /**
     * Authentication and Guest Session end point paths.
     */
    public static final String PATH_AUTHENTICATION = "authentication";

    @Nullable private OkHttpClient okHttpClient;
    @Nullable private Retrofit retrofit;

    private boolean useGuestSession = false;
    private boolean useAccountSession = false;

    @Nullable private String username;
    @Nullable private String password;
    @Nullable private String sessionId;
    @Nullable private String guestSessionId;

    public void accountSession(String username, String password) {
        this.username = username;
        this.password = password;
        useAccountSession = true;
    }

    public void guestSession() {
        useGuestSession = true;
    }

    public void clearSessions() {
        this.username = null;
        this.password = null;
        useAccountSession = false;
        useGuestSession = false;
        setSessionId(null);
        setGuestSessionId(null);
    }

    public boolean useAccountSession() {
        return useAccountSession;
    }

    public boolean useGuestSession() {
        return useGuestSession;
    }

    @Nullable
    public String getUsername() {
        return username;
    }

    @Nullable
    public String getPassword() {
        return password;
    }

    @Nullable
    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(@Nullable String sessionId) {
        this.sessionId = sessionId;
    }

    @Nullable
    public String getGuestSessionId() {
        return guestSessionId;
    }

    public void setGuestSessionId(@Nullable String guestSessionId) {
        this.guestSessionId = guestSessionId;
    }

    public boolean isLoggedIn() {
        return getSessionId() != null || getGuestSessionId() != null;
    }

    /**
     * Creates a {@link Retrofit.Builder} that sets the base URL, adds a Gson converter and sets {@link #okHttpClient()}
     * as its client.
     *
     * @see #okHttpClient()
     */
    protected Retrofit.Builder retrofitBuilder() {
        return new Retrofit.Builder()
            .baseUrl(API_URL)
//            .addConverterFactory(GsonConverterFactory.create(PornhubHelper.getGsonBuilder().create()))
//            .addConverterFactory(ScalarsConverterFactory.create()).addConverterFactory(GsonConverterFactory.create())
            .addConverterFactory(HtmlConverterFactory.create(API_URL))
            .client(okHttpClient());
    }

    /**
     * Returns the default OkHttp client instance. It is strongly recommended to override this and use your app
     * instance.
     *
     * @see #setOkHttpClientDefaults(OkHttpClient.Builder)
     */
    protected synchronized OkHttpClient okHttpClient() {
        if (okHttpClient == null) {
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            setOkHttpClientDefaults(builder);
            okHttpClient = builder.build();
        }
        return okHttpClient;
    }

    /**
     * Adds an interceptor to add the api key query parameter and to log requests.
     */
    protected void setOkHttpClientDefaults(OkHttpClient.Builder builder) {
        builder.addInterceptor(new PornhubInterceptor(this)).authenticator(new PornhubAuthenticator(this));
    }

    /**
     * Return the current {@link Retrofit} instance. If none exists (first call, auth changed), builds a new one.
     * <p>When building, sets the base url and a custom client with an {@link Interceptor} which supplies
     * authentication data.
     */
    protected Retrofit getRetrofit() {
        if (retrofit == null) {
            retrofit = retrofitBuilder().build();
        }
        return retrofit;
    }

    /**
     * Throws a {@link PornhubException} if the given unsuccessful response contains a known TMDB status code.
     *
     * @see <a href="https://www.themoviedb.org/documentation/api/status-codes">Status Codes</a>
     */
    public void throwOnKnownError(Response response) throws IOException {
        if (response.isSuccessful()) {
            return;
        }

        ResponseBody responseBody = response.errorBody();
        if (responseBody == null) {
            return;
        }

        Status status = (Status)getRetrofit()
            .responseBodyConverter(Status.class, Status.class.getAnnotations())
            .convert(responseBody);
        if (status == null) {
            return;
        }

        Integer code = status.status_code;
        String message = status.status_message;
        switch (code) {
            case 2:
            case 4:
            case 9:
            case 11:
            case 15:
            case 16:
            case 19:
            case 24:
                throw new PornhubServiceErrorException(code, message);
            case 3:
            case 14:
            case 33:
            case 7:
            case 10:
            case 17:
            case 18:
            case 26:
            case 30:
            case 31:
            case 32:
                throw new PornhubAuthenticationFailedException(code, message);
            case 5:
            case 20:
            case 22:
            case 23:
            case 27:
            case 28:
                throw new PornhubInvalidParametersException(code, message);
            case 6:
            case 34:
                throw new PornhubNotFoundException(code, message);
            case 8:
                throw new PornhubDuplicateEntryException(code, message);
        }
    }

    public AccountService accountService() {
        return getRetrofit().create(AccountService.class);
    }

    public AuthenticationService authenticationService() {
        return getRetrofit().create(AuthenticationService.class);
    }

    public CertificationsService certificationsService() {
        return getRetrofit().create(CertificationsService.class);
    }

    public ChangesService changesService() {
        return getRetrofit().create(ChangesService.class);
    }

    public CollectionsService collectionService() {
        return getRetrofit().create(CollectionsService.class);
    }

    public CompaniesService companiesService() {
        return getRetrofit().create(CompaniesService.class);
    }

    public ConfigurationService configurationService() {
        return getRetrofit().create(ConfigurationService.class);
    }

    public CreditsService creditsService() {
        return getRetrofit().create(CreditsService.class);
    }

    public DiscoverService discoverService() {
        return getRetrofit().create(DiscoverService.class);
    }

    public FindService findService() {
        return getRetrofit().create(FindService.class);
    }

    public GenresService genreService() {
        return getRetrofit().create(GenresService.class);
    }

    public GuestSessionService guestSessionService() {
        return getRetrofit().create(GuestSessionService.class);
    }

    public KeywordsService keywordsService() {
        return getRetrofit().create(KeywordsService.class);
    }

    public ListsService listsService() {
        return getRetrofit().create(ListsService.class);
    }

    public MoviesService moviesService() {
        return getRetrofit().create(MoviesService.class);
    }

    public NetworksService networksService() {
        return getRetrofit().create(NetworksService.class);
    }

    public PeopleService personService() {
        return getRetrofit().create(PeopleService.class);
    }

    public ReviewsService reviewsService() {
        return getRetrofit().create(ReviewsService.class);
    }

    public SearchService searchService() {
        return getRetrofit().create(SearchService.class);
    }

    public TimezonesService timezonesService() {
        return getRetrofit().create(TimezonesService.class);
    }

    public TvService tvService() {
        return getRetrofit().create(TvService.class);
    }

    public TvSeasonsService tvSeasonsService() {
        return getRetrofit().create(TvSeasonsService.class);
    }

    public TvEpisodesService tvEpisodesService() {
        return getRetrofit().create(TvEpisodesService.class);
    }

    public DiscoverMovieBuilder discoverMovie() {
        return new DiscoverMovieBuilder(discoverService());
    }

    public DiscoverTvBuilder discoverTv() {
        return new DiscoverTvBuilder(discoverService());
    }

}
