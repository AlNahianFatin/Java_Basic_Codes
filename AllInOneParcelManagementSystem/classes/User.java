package classes;

import java.lang.*;
import java.util.*;

import interfaces.*;

public class User implements IUserOperations{

	private String uname;
	private int id;
	private String upass;
	private String ufullname;
	private String uaddress;
	private String uphn;
	private User users[] = new User [25];

  public User(){}
  public User(String uname, int id, String upass, String ufullname, String uaddress, String uphn){
    this.uname = uname;
    this.id = id;
    this.upass = upass;
    this.ufullname = ufullname;
    this.uaddress = uaddress;
    this.uphn = uphn;
  }

  public void setUsersPassword(String upass){
		this.upass = upass;
	}

	public String getUsersPassword(){
		return upass;
	}
/*
	public void setUsersUsername(String uname){
		this.uname = uname;
	}

	public void setUsersID(int id){
		this.id = id;
	}

	public void setUsersPassword(String upass){
		this.upass = upass;
	}

	public void setUsersName(String ufullname){
		this.ufullname = ufullname;
	}

	public void setUsersAddress(String uaddress){
		this.uaddress = uaddress;
	}

	public void setUsersPhoneNumber(String uphn){
		this.uphn = uphn;
	}

	public String getUsersUsername(){
		return uname;
	}

	public int getUsersID(){
		return id;
	}

	public String getUsersPassword(){
		return upass;
	}

	public String getUsersName(){
		return ufullname;
	}

	public String getUsersAddress(){
		return uaddress;
	}

	public String getUsersPhoneNumber(){
		return uphn;
	}
*/
	public void addUsers(User u){
		int flag = 0;
		for(int i=0; i < users.length; i++){
			if(users[i] == null){
				users[i] = u;
				flag = 1;
				break;
			}
		}
		if(flag == 1){
			System.out.println("User has been added to the system!");
		}
		else{
			System.out.println("Sorry! User can not be added to the system!");
		}
	}
	
	public void removeUsers(User u){
		int flag = 0;
		for(int i=0; i < users.length; i++){
			if(users[i] == u){
				users[i] = null;
				flag = 1;
				break;
			}
		}
		if(flag == 1){
			System.out.println("User has been removed from the system!");
		}
		else{
			System.out.println("Sorry! User can not be removed from the system!");
		}
	}

	public User getUsers(int id){
		User u = null;

		for(int i = 0; i < users.length; i++){
			if(users[i] != null){
				if(users[i].id == id){
					u = users[i];
					break;
				}
			}
		}

		if(u != null){
			System.out.println("User has been found!");
		}

		else{
			System.out.println("User could not be found!");
		}
		return u;
	}

	public void showAllUsers(){
		System.out.println("Here are all the User information in the system:\n");
		for (User u : users){
			if(u != null){
				System.out.println("***************************************");
				System.out.println("User's ID: " + u.id);
				System.out.println("User's Username: " + u.uname);
				System.out.println("User's Name: " + u.ufullname);
				System.out.println("User's Address: " + u.uaddress);
				System.out.println("User's Phone Number: " + u.uphn);
			}
		}
		System.out.println("***************************************");
	}

}