package com.revature.scan;

import java.util.Scanner;

public class ScannerFun {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		String contents;
		System.out.println("What would you like to print?");
		contents = sc.nextLine();
		System.out.println(contents);
		System.out.println("What else");
		contents = sc.nextLine();
		System.out.println(contents);
		
		//My added input
		System.out.println("How will we do it?");
		
		
		
		
	}

}
