
public class BankAccount{
//instance variables
  private String fullName;
  private String password;
  private int pin;
  private int accountNumber;
  private double accountBalance;

//setting instance variables
  public String setName(String newName){
    String oldName = fullName;
    fullName = newName;
    return oldName;
  }

  public String setPassword(String newPassword){
    String oldPassword = password;
    password = newPassword;
    return oldPasswd;
  }

  public short setPin( short newPin ) {
    short oldPin = pin;
    pin = newPin;
    return oldPin;
  }

  public int setAccountNumber( int newAccountNumber ) {
    int oldAccountNumber = accountNumber;
    accountNumber = newAccountNumber;
    return oldAccountNumber;
  }

  public double setBalance( double newBalance ) {
    double oldBalance = accountBalance;
    accountBalance = newBalance;
    return oldBalance;
  }
  
  


//deposit
  public void deposit(double depositAmount){
    accountBalance = accountBalance + depositAmount;

  }
//withdraw
  public void withdraw(double withdrawAmount){
    accountBalance = accountBalance - withdrawAmount;

  }
  
//overwritten String
  public String toString() {
    String retStr = "\nAccount info:\n=======================";
    retStr = retStr + "\nName: " + fullName;
    retStr = retStr + "\nPassword: " + password;
    retStr = retStr + "\nPIN: " + pin;
    retStr = retStr + "\nAccount Number: " + accountNumber;
    retStr = retStr + "\nBalance: " + accountBalance;
    retStr = retStr + "\n=======================";
    return retStr;
  }

//main method
  public static void main(String[] args){
   BankAccount ba = new BankAccount();  
    ba.setName("Flounder");  
    ba.setPassword("abcdefg11");  
    ba.setPin(1234);    
    ba.setAccountNumber(167);  
    ba.setBalance(2389.58);  
    ba.toString();  
    ba.deposit(1245.39);  
    ba.toString();  
    ba.withdraw(385.29);  
    ba.toString();  
  }


}
