package com.revature.varargs;

public class FunWithVarargs {
	    //Var args - Variable Length Arguments
	    //A method that will take a variable number of arguments
	    //must be the last argument
	    //can be of any type

	    public static void main(String[] args) {
	        vaTest(19);
	        vaTest(1,4,2,555,255,62,62);


	    }

	    public static void vaTest(int... v) {//...is how we declare a var args// }
	        //Automate and hides the process of creating and saving the values into an array prior to invoking a method
	        System.out.println("Number of arguments is: " + v.length + " Contents:");

	        //For each/Augmented For Loop - Used with collections
	        for (int x: v) {
	            System.out.println(x);
	        }
	    }
	}


