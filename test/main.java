public static void main( String[] args ) {
    BankAccount ba = new BankAccount();
    ba.setName("Flounder");
    ba.setPasswd("abcdefg11");
    ba.setPIN(1234);  
    ba.setAcctNum(167);
    ba.setBalance(2389.58);
    ba.toString();
    ba.deposit(1245.39);
    ba.toString();
    ba.withdraw(385.29);
    ba.toString();
}
