package bankaccountapp;

public class BankAccountApp {
	public static void main(String[] args) {
		
		Checking chkacc1 = new Checking ("Tom Wilson","384743834", 1500);
		Savings savacc1 = new Savings("Rob Lowe", "489749832", 2500);
		
		savacc1.showInfo();
		System.out.println("********");
		chkacc1.showInfo();
		
		//Read a CSV file then create new accounts based on that data
	}

}
