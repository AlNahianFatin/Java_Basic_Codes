import java.lang.*;
import java.util.*;
import classes.*;
import interfaces.*;
import fileio.*;

public class Start{
	public static void main(String[] args){

		System.out.println("*********************************************************");
		System.out.println("| Welcome to the 'All-In-One Parcel Management System'! |");
		System.out.println("*********************************************************");
		System.out.println("                      | Ver 1.5 |                        ");
		System.out.println("                      ***********                        ");


		boolean chsmm = true;
		Scanner scmm = new Scanner(System.in);
		User u = new User();
		Parcel p = new Parcel();
		//addParcel ap = new addParcel();
		FileReader f = new FileReader();

		while(chsmm){
			System.out.println("\n		>>> Main Menu <<<\n");
			System.out.println("	1. Login");
			System.out.println("	2. About this System\n");
			System.out.println("	0. Exit the System?\n");
			
			System.out.print("Enter your choice: ");
			int menuChoice = scmm.nextInt();

			switch(menuChoice){

				case 1 :
					System.out.println("\n		>>> Login Menu <<<\n");
					System.out.println("	1. Admin Login");
					System.out.println("	2. User Login\n");
					System.out.println("	0. Go back to previous menu\n");

					System.out.print("Enter your choice: ");
					int loginMenuChoice	= scmm.nextInt();

					switch(loginMenuChoice){

						case 1 :
							System.out.println("\n		>>> Admin Login <<<\n");
							boolean apassChoice = true;
							while(apassChoice){
								System.out.print("Enter your Admin username: ");
								String adminUsername = scmm.next();
								System.out.print("Enter your Admin password: ");
								String adminPass = scmm.next();

								if (adminUsername.equals("Admin") && adminPass.equals("Admin")){
									System.out.println("***********************");
									System.out.println("Logged in successfully!");
									System.out.println("***********************");

									System.out.println("Welcome to Admin Panel!");

									boolean apChoice = true;
									while(apChoice){
										System.out.println("\n		>>> Admin Panel <<<\n");

										System.out.println("	1. Parcel Management");
										System.out.println("	2. User Management\n");
										System.out.println("	0. Logout?\n");

										System.out.print("Enter your choice: ");
										int adminPanelChoice = scmm.nextInt();

										switch(adminPanelChoice){

											case 1 :
										
												boolean pmChoice = true;
												while(pmChoice){

													System.out.println("\n		>>> Parcel Management Panel <<<\n");
										
													System.out.println("	1. Add Delivery Request");
													System.out.println("	2. Cancel Delievry");
													System.out.println("	3. Show all delivery");
													//System.out.println("	4. Track a parcel\n");
													System.out.println("	0. Go back to previous menu\n");

													System.out.print("Enter your choice: ");
													int pmMenuChoice = scmm.nextInt();

													switch(pmMenuChoice){

														case 1 :
											
															System.out.print("\nParcel's ID: ADB");
															int pid = scmm.nextInt();
															//scmm.nextLine();
															System.out.print("Sender's Name: ");
															String sname = scmm.nextLine();
															//scmm.nextLine();
															System.out.print("Sender Address: ");
															String saddress = scmm.nextLine();
															System.out.print("Sender's Phone Number: ");
															String sphn = scmm.nextLine();
															System.out.print("Receiver's Name: ");
															String rname = scmm.nextLine();
															//scmm.nextLine();
															System.out.print("Receiver's Address: ");
															String raddress = scmm.nextLine();
															System.out.print("Receiver's Phone: ");
															String rphn = scmm.nextLine();
															System.out.print("Delivery Charge: ");
															int deliverychrg = scmm.nextInt();
												
															

															p.addParcel(new Parcel(pid, sname, saddress, sphn, rname, raddress, rphn, deliverychrg));
															//pmChoice = false;
															break;

														case 2 :
											
															System.out.println("\nProvide information to remove an existing delivery");
															System.out.print("Enter Parcel's Id: ADB");

															p.removeParcel(p.getParcel(scmm.nextInt()));
															//pmChoice = false;
															break;

														case 3 :
											
															System.out.println("\nShowing you all parcel data:");

															p.showAllParcels();
															//pmChoice = false;
															break;

														/*
														case 4 :

															System.out.println("\nProvide information to track a delivery");
															System.out.print("Enter Parcel's Id: ADB");

															p.getParcel(scmm.nextInt()).showParcel();

															break;
															
														*/	

														case 0 :

															System.out.println("\n>>> You have choosen to go back! <<<\n");
															pmChoice = false;
															break;

														default :

															System.out.println("\nYou have provided an invalid input! Try again...\n");
															//pmChoice = false;
															break;

													}
												}

												break;

											case 2 :
										
												boolean umChoice = true;
												while(umChoice){

													System.out.println("\n		>>> User Management Panel <<<\n");
													System.out.println("	1. Add User");
													System.out.println("	2. Remove User");
													System.out.println("	3. Show All Users");
													//System.out.println("	4. Show Specific User\n");
													System.out.println("	0. Go back to previous menu\n");

													System.out.print("Enter your choice: ");
													int umMenuChoice = scmm.nextInt();

													switch(umMenuChoice){

														case 1 :
															//Password confirmation issue.
															//Program gets terminated after completation
															//User u = new User();

															System.out.println("\nProvide information to create a new user:");
												
															System.out.print("Enter the ID for User: ");
															int id = scmm.nextInt();

															scmm.nextLine();
															System.out.print("Enter Full Name of User: ");
															String ufullname = scmm.nextLine();
															//scmm.nextLine();

															System.out.print("Enter Address of User: ");
															String uaddress = scmm.nextLine();
															//scmm.nextLine();
												
															System.out.print("Enter Phone Number of User: ");
															String uphn = scmm.next();
												
															System.out.print("Enter the Username for User: ");
															String uname = scmm.next();
	
															System.out.print("Enter the password of user: ");
															String upass = scmm.next();
															System.out.print("Re-enter the password for confirmation: ");
															String upasscheck = scmm.next();

															if(upass.equals(upasscheck)){
																u.setUsersPassword(upass);
																u.addUsers(new User(uname, id, upass, ufullname, uaddress, uphn));
															}

															else{
																System.out.println("Password didn't match. Try again by Starting again!");
															}
                              
															//u.addUsers(new User(uname, id, upass, ufullname, uaddress, uphn));

															break;

														case 2 :
														//Works but shows a removed account removed again
															System.out.println("\nProvide information to remove an existing user");
															System.out.print("Enter User Id: ");

															u.removeUsers(u.getUsers(scmm.nextInt()));

															break;

														case 3 :
														//Show all users
															System.out.println("\nShowing you all users data excluding password:");

															u.showAllUsers();

															break;

														//case 4 :
														//Show specific user

														case 0 :

															System.out.println("\n>>> You have choosen to go back! <<<\n");
															umChoice = false;
															break;

														default :

															System.out.println("\nYou have provided an invalid input! Try again...\n");
															break;
													}
												}
												break;

											case 0 :
										
												System.out.println("\n>>> You have been logged out from Admin Panel! <<<\n");
												apChoice = false;
												break;

											default :
										
												System.out.println("\nYou have provided an invalid input! Try again...\n");
												break;

										}
									}
									apassChoice = false;
									//break;
								}

								else{
									System.out.println("\n(!) Your Admin Password & Password is Wrong! Try again... (!)\n");
									//break;
								}
							}
							break;	

						case 2 :
							System.out.println("\n		>>> User Login <<<\n");
							boolean upassChoice = true;
							while(upassChoice){
								System.out.print("Enter your your username: ");
								String userUsername = scmm.next();
								System.out.print("Enter your your password: ");
								String userPass = scmm.next();

								if (userUsername.equals("User") && userPass.equals("User2021")){
									System.out.println("***********************");
									System.out.println("Logged in successfully!");
									System.out.println("***********************");

									System.out.println("\nWelcome to User Panel!");

									boolean upChoice = true;
									while(upChoice){

										System.out.println("\n		>>> User Panel <<<\n");

										System.out.println("	1. Add Delivery Request");
										System.out.println("	2. Cancel Delivery");
										//System.out.println("	3. Track Parcel\n");
										System.out.println("	0. Logout?\n");

										System.out.print("Enter your choice: ");
										int userPanelChoice = scmm.nextInt();

										switch(userPanelChoice){

											case 1 :
										
												System.out.print("\nParcel's ID: ADB");
												int pid = scmm.nextInt();
												scmm.nextLine();
												System.out.print("Sender's Name: ");
												String sname = scmm.nextLine();
												//scmm.nextLine();
												System.out.print("Sender Address: ");
												String saddress = scmm.nextLine();
												System.out.print("Sender's Phone Number: ");
												String sphn = scmm.nextLine();
												System.out.print("Receiver's Name: ");
												String rname = scmm.nextLine();
												//scmm.nextLine();
												System.out.print("Receiver's Address: ");
												String raddress = scmm.nextLine();
												System.out.print("Receiver's Phone: ");
												String rphn = scmm.nextLine();
												System.out.print("Delivery Charge: ");
												int deliverychrg = scmm.nextInt();
												
												p.addParcel(new Parcel(pid, sname, saddress, sphn, rname, raddress, rphn, deliverychrg));
												break;

											case 2 :
										
												System.out.println("\nProvide information to remove an existing delivery");
												System.out.print("Enter Parcel's Id: ADB");

												p.removeParcel(p.getParcel(scmm.nextInt()));

												break;

											//case 3 :
												
												//System.out.println("\nProvide information to track a delivery");
												//System.out.print("Enter Parcel's Id: ADB");

												//p.getParcel(scmm.nextInt()).showAllParcels();

												//break;

											case 0 :
										
												System.out.println("\n>>> You have been logged out from User Panel! <<<\n");
												upChoice = false;
												break;

											default :
										
												System.out.println("\nYou have provided an invalid input! Try again...\n");
												break;

										}
									}
									upassChoice = false;
									//break;
								
								}

								else{
									
									System.out.println("\n(!) Your Username & Password is Wrong! Try again... (!)\n");
									//break;

								}

							}
							break;

						case 0 :
							
							System.out.println("\n>>> You have choosen to go back! <<<\n");
							break;

						default :
							
							System.out.println("\nYou have provided an invalid input! Try again...\n");
							break;
					}
					break;

				case 2 :
					
					boolean aboutChoice = true;
					while(aboutChoice){
						System.out.println("\n		>>> About Menu <<<\n");
						System.out.println("What do you want to know about this system?\n");
						System.out.println("	1. About this system");
						System.out.println("	2. About the team (with contribution)");
						System.out.println("	3. Upcoming features for this system\n");
						System.out.println("	0. Go back to previous menu\n");

						System.out.print("Enter your choice: ");
						int aboutMenuChoice = scmm.nextInt();

						switch(aboutMenuChoice){

							case 1 :
							
								f.readFile("C:\\Users\\K3T0N3\\Desktop\\TestProject - Copy\\fileio\\AboutSystem.txt");
								break;

							case 2 :
							
								f.readFile("C:\\Users\\K3T0N3\\Desktop\\TestProject - Copy\\fileio\\AboutTeam.txt");
								break;

							case 3 :
							
								f.readFile("C:\\Users\\K3T0N3\\Desktop\\TestProject - Copy\\fileio\\AboutFutureUpdates.txt");
								break;

							case 0 :

								System.out.println("\n>>> You have choosen to go back! <<<\n");
								aboutChoice = false;
								break;

							default :
							
								System.out.println("\nYou have provided an invalid input! Try again...\n");
								break;
						}
					}
				
				break;

				case 0 :
					
					System.out.println("\n(!) You have choosen to exit the application! (!)");
					System.out.println("Thank you for using this system.");
					chsmm = false;
					break;

				default :

					System.out.println("\nYou have provided an invalid input! Try again...\n");
					break;

			}
		}
	}
}