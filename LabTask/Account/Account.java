public class Account {
    private String accountName;
    private int accountNum;
    private double balance;

    public Account(){

    }
    public void setAccountNum(int accountNum){
        this.accountNum = accountNum;
    }
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
   public void setBalance(double balance){
        this.balance = balance;
   }
   
   public int getAccountNum(){
    return accountNum;
   }
   public String getAccountName(){
    return accountName;
   }
   public double getbalance(){
    return balance;
   }
   
   public void showDetails(){
    System.out.println("Account Number : " + accountNum);
    System.out.println("Account Name : " + accountName);
    System.out.println("Account Balance : " + balance);
   }
}
