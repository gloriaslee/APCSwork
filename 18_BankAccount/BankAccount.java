/*
Duck Duck Goose - Gloria Lee (Flounder), Jonathan Song (Pheonix), Rin Fukuoka (Tape)
APCS
HW18 - CPA-one
2021-10-14
QCC:
DISCO:
Lastest and Greatest Q2 Response:
Latest and Greatest Q3 Response:
*/

public class BankAccount{
  static String fullName;
  static String password;
  static int pin;
  static int accountNumber;
  static double accountBalance;

  public BankAccount(String a, String b, int c, int d, double f){
    fullName = a;
    password = b;
    pin = c;
    accountNumber = d;
    accountBalance = f;
  }

  public static void infoPrint(){
    System.out.println("Name: "+fullName);
    System.out.println("Password: "+password);
    System.out.println("PIN: "+pin);
    System.out.println("Account Number: "+accountNumber);
    System.out.println("Account Balance: "+accountBalance+" dollars");
  }

  public static void deposit(double depositAmount){
    accountBalance = accountBalance + depositAmount;

  }

  public static void withdraw(double withdrawAmount){
    accountBalance = accountBalance - withdrawAmount;

  }

  public static void main(String[] args){
    BankAccount firstAccount = new BankAccount("Flounder", "you'll never guess", 1234, 1, 10000.99);
    infoPrint();
    withdraw(200.49);
    infoPrint();
    deposit(2343.53);
    infoPrint();

  }


}

