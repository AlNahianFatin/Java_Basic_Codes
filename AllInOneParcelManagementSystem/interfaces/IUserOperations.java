package interfaces;

import java.lang.*;
import classes.*;

public interface IUserOperations{
	void addUsers(User u);
	void removeUsers(User u);
	User getUsers(int id);
	void showAllUsers();
}