package classes;
import java.lang.*;
import java.util.*;
import interfaces.*;

public class Parcel implements IParcelOperations{

	private Parcel parcels[] = new Parcel [1000];
	private int pid;
	private String sname;
	private String saddress;
	private String sphn;
	private String rname;
	private String raddress;
	private String rphn;
	private double deliverychrg;
  public Parcel(){}
  public Parcel(int pid, String sname, String saddress, String sphn, String rname, String raddress, String rphn, double deliverychrg){
    this.pid = pid;
    this.sname = sname;
    this.saddress = saddress;
    this.sphn = sphn;
    this.rname = rname;
    this.raddress = raddress;
    this.rphn = rphn;
    this.deliverychrg = deliverychrg;
  }
/*
  public void setParcelID(int pid){
		this.pid = pid;
  	}
  
  public int getParcelID(){
		return pid;
	}

  public void setSenderName(String sname){
		this.sname = sname;
  	}
  
  public String getSenderName(){
		return sname;
	}
  
  public void setSenderAddress(String saddress ){
		this.saddress = saddress;
  	}

  public String getSenderAddress(){
		return saddress;
	}

  public void setSenderPhoneNumber(String sphn){
		this.sphn = sphn;
  }

  public String getSenderPhoneNumber(){
		return sphn;
	}

	public void setReceiverName(String rname){
		this.rname = rname;
	}

	public String getReceiverName(){
		return rname;
	}

	public void setReceiverAddress(String raddress){
		this.raddress = raddress;
	}

	public String getReceiverAddress(){
		return raddress;
	}

	public void setReceiverPhoneNumber(String rphn){
		this.rphn = rphn;
	}

	public String getReceiverPhoneNumber(){
		return rphn;
	}

  public void setDeliveryCharge(double deliverychrg){
    this.deliverychrg = deliverychrg;
  }

  public double getDeliveryCharge(){
    return deliverychrg;
  }
*/
	public void addParcel(Parcel p){
		int flag = 0;
		for(int i = 0; i < parcels.length; i++){
			if(parcels[i] == null){
				parcels[i] = p;
				flag = 1;
				break;
			}
		}

		if(flag == 1){
			System.out.println("Your parcel has been added!");
		}
		else{
			System.out.println("Sorry! Parcel can not be added.");
		}
	}

	public void removeParcel(Parcel p){
		int flag = 0;
		for(int i = 0; i < parcels.length; i++){
			if(parcels[i] == p){
				parcels[i] = null;
				flag = 1;
				break;
			}
		}

		if(flag == 1){
			System.out.println("Your parcel has been removed!");
		}
		else{
			System.out.println("Sorry! Parcel can not be removed.");
		}
	}

	public Parcel getParcel(int pid){
		Parcel p = null;

		for(int i = 0; i < parcels.length; i++){
			if(parcels[i] != null){
				if(parcels[i].pid == pid){
					p = parcels[i];
					break;
				}
			}
		}

		if(p != null){
			System.out.println("Parcel has been found!");
		}

		else{
			System.out.println("Parcel could not be found!");
		}
		return p;
	}

	public void showAllParcels(){
		System.out.println("Here are all the User information in the system:\n");
		for(Parcel p : parcels){
			if(p != null){
				System.out.println("***************************************");
				System.out.println("Parcel's ID: ADB" + p.pid);
				System.out.println("Sender's Name: " + p.sname);
				System.out.println("Sender Address: " + p.saddress);
				System.out.println("Sender's Phone Number: " + p.sphn);
				System.out.println("Receiver's Name: " + p.rname);
				System.out.println("Receiver's Address: " + p.raddress);
				System.out.println("Receiver's Phone: " + p.rphn);
				System.out.println("Delivery Charge: " + p.deliverychrg);
        System.out.println("***************************************");
			}
		}
	}
}