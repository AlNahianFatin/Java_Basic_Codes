package interfaces;

import java.lang.*;
import classes.*;

public interface IParcelOperations{
	void addParcel(Parcel p);
	void removeParcel(Parcel p);
	Parcel getParcel(int pid);
	void showAllParcels();
}