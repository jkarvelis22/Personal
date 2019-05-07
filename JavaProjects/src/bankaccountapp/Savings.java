package bankaccountapp;

public class Savings extends Account{
	//List properties specific to the Savings account
	int safetyDepositBoxID;
	int safetyDepositBoxKey;
	
	//Constructor to initialize
	public Savings(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "1" + accountNumber;
	}
	
	public void showInfo(){
		super.showInfo();
		System.out.println("ACCOUNT TYPE: Savings");
}
}
