package com.udemy.operators;

public class OperatorPrecedence {
	
public static void main(String[] args) {


	double value = 20;
	double value1 = 80;
	double total = (value + value1) * 25;
	double remainingTotal = total % 40;
	System.out.println("total is: " + total);
	System.out.println("remainingTotal is: " + remainingTotal);
	if(remainingTotal <= 20)
		System.out.println("Total was over the limit");
	
	}
}
