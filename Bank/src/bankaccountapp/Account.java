package bankaccountapp;

public abstract class Account implements IBaseRate {
    //list common properties for savings and checking accounts
    String name;
    String sSN;
    double balance;

    static int index = 10000;
    String accountNumber;
    double rate;

    //Constructor to set base properties and initialize the account
    public Account(String name, String sSN, double initDeposit){
        this.name = name;
        this.sSN = sSN;
        balance = initDeposit + 100;
        System.out.println(" NAME: " + name + " SSN: " + sSN + " BALANCE: " + balance);

        //Set account number
        this.accountNumber=setAccountNumber();
        System.out.println("ACCOUNT NUMBER: " + this.accountNumber);
    }

    private String setAccountNumber(){
        String lastTwoSsn = sSN.substring(sSN.length()-2, sSN.length());
        int uniqueIndex = index;
        int randomNumber = (int) (Math.random() * Math.pow(10,3));
        return lastTwoSsn + uniqueIndex + randomNumber;


    }
    //List common methods

}
