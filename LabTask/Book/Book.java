public class Book{
    String isbn;
    String bookTitle;
    String authorName;
    double price;
    int availableQuantity;

    Book(){}

    Book(String isbn, String bookTitle, String authorName, double price, int availableQuantity){
       
        this.isbn = isbn;
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.price = price;
        this.availableQuantity = availableQuantity;
    }

    public void setIsbn(String isbn){
            this.isbn = isbn;
        }
    public String gtetIsbn(){
            return isbn;
        }

    public void setBookTitle(String bookTitle){
            this.bookTitle = bookTitle;
        }
    public String getBookTitle(){
            return isbn;
        }

    public void setAuthorName(String authorName){
            this.authorName = authorName;
        }
    public String getAuthorName(){
            return authorName;
        }

    public void setPrice(double price){
            this.price = price;
        }
    public double getPrice(){
            return price;
        }

    public void setAvailableQuantity(int availableQuantity){
            this.availableQuantity = availableQuantity;
        }
    public int getAvailableQuantity(){
            return availableQuantity;
        }

        void showDetails(){

        }
}