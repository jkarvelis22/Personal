package com.revature.flow;

public class LoopyLoopz {

	/*If statement
	 * for decision making
	 * provides multiple paths of execution
	 * 
	 * if (<conditional>){
	 * <what LOGIC to do if true>
	 * }else if(<second conditional>){
	 * <what logic to do if 2nd conditional is true>
	 * }else{
	 * <what to do if its false>
	 * }
	 * 
	 * Switch Cases
	 * provide multiple paths of execution based on some value 
	 * the "switch" is based on an integer numeric, String, char, boolean or enum
	 * 
	 * For Loops
	 * for(a;b;c){do something}
	 * a is the variable declaration (counter)
	 * b is the conditional that controls how far the loop will go
	 * c is the incrementor/decrementor
	 * 
	 * While loop
	 * while(<condition>){<do Something>}
	 * do While loop
	 * do{<do this logic>} while (<conditional>)
	 */
	public static void doWileyWhile(int i) {
		do {
			System.out.println(i);
			i++;
		}while(i<100);
	}
	
	
	public static void wileyWhile(int i) {
		while(i<100) {
			System.out.println("Boring");
			i++;
		}
	}
	public static void forLoopFunness(int p) {
		for(int i = p; i<27; i++) {
			if(i == 13) {
				//Branching statements
				//break- breaks out of loop;
				continue;//skips the current iteration
			}
			System.out.println(i);
		}
	}
	public static void switchMethod(String color) {
		switch (color) {
		case "green":
			System.out.println("Green is the best");
			break;
		case "red":
			System.out.println("You picked red");
			break;
		case "yellow":
			System.out.println("Caution");
			break;
		default:
			System.out.println("You're dumb. pick a better color!");
			}
		System.out.println("outside switch");
	}
	public static void ifMethod(int a) {
		
		if(a>50) {
			System.out.println("a is bigger than 50!");
		}
		else if(a == 50) {
			System.out.println(" a is smack dab on 50!!");
		}
		else {
			System.out.println("a is smaller than 50 :(");
		}
	}
	
	public static void main(String[] args) {
		//ifMethod(75);
		//ifMethod(3);
		//ifMethod(50);
		//switchMethod("purple");
		//forLoopFunness(3);
		//wileyWhile(54);
		  doWileyWhile(80);
	}
}
