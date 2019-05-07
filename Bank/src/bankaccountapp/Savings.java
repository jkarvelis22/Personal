package bankaccountapp;

public class Savings extends Account {
    //List properties specific to savings account
    int safetyDepositBoxID;
    int getSafetyDepositBoxKey;

    //Constructor to initialize settings for the Savings properties
    public Savings(String name, String sSN, double initDeposit){
        super(name, sSN, initDeposit);
        System.out.println("NEW SAVINGS ACCOUNT: ");



    }

    //List any methods specific to savings account
}
