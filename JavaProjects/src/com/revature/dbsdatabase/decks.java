package com.revature.dbsdatabase;

import java.util.Scanner;

public class decks {
	String dbs1 = "Broly Unleashed";
	String dbs2 = "Super Saiyan Goku";
	String dbs3 = "Frieza";
	String dbs4 = "Buu";	
	

	public decks() {
	Scanner in = new Scanner (System.in);
	
	boolean timeToExit = false;
	
	while(true) {
		System.out.println("Select your poison!?");
	String dbs = in.nextLine();
	
	switch(dbs) {
	case "Broly":
	System.out.println("You Kakarot. I choose you to be the first of my victims.");
	this.dbs1 = dbs;
	timeToExit = true;
	break;

	case "Goku":
		System.out.println("Kamehamehaaaaaa!!!!");		
	this.dbs2 = dbs;
	timeToExit = true;
	break;

	case "Frieza":
		System.out.println("\"There are three things I refuse to tolerate. Cowardice. Bad haircuts, and military insurrection. "
				+ "\nAnd it is unfortunate that our friend Vegeta possesses all three of these.\"");
	this.dbs3 = dbs;
	timeToExit = true;
	break;
	
	case "Majin Buu":
		System.out.println("No more Mr.Nice Buu");
		this.dbs4 = dbs;
		timeToExit = true;
		break;
	
	default:
		System.out.println("Invalid entry. Please try again.");
	}
	if(timeToExit) {
		break;
	}
	}

	
}
	
	
	 
 }

