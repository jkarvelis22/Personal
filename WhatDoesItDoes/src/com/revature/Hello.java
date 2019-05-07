package com.revature;

import java.sql.Date;
//Fully Qualified Class Name
import com.revature.blueprints.RocketShip;

/*A package is a grouping of related types providing access protection and 
 * name space management. 
 */

public class Hello {
	//Single Comment
	/*this
	 * is
	 * a
	 * multi
	 * line
	 * comment
	 */ 
	
	/*Designated as public because of it being able to be seen by the world.
	 * Static is the call to nothing but that main method. Void is the return type
	 * The main method is the entry point to allowing the code to print out to 
	 * the console. We call system.out.println to print out Goodbye, Earth because of 
	 * the entry point of the main method.
	 */
	
	//JVM looks for a method with this signature
	//Entry point
	/*
	 * public - Access modifier (everything can see it)
	 * static - don't need an instance of the class to run a static method
	 * void - return type; doesn't return anything
	 * 
	 * JVM - Java Virtual Machine
	 *  Converts compiled Java code into machine code that your processor can understand
	 *  provides portability
	 * JRE - Java Runtime Environment
	 *  JVM+ libraries
	 *  Everything we need to RUN Java
	 * JDK - Java Development Kit
	 *  Contains the JVM and JRE
	 *  contains Compiler among other things
	 *  Everything we need to WRITE code
	 */
	public static void main(String[] args) {
		System.out.println("Goodbye, Earth");
			
			RocketShip rs1 = new RocketShip("Steve",3000,7,true);
			System.out.println(rs1.getName());
			rs1.setName("StillSteve");
			System.out.println(rs1.toString());
			
			Date d = new Date(1l);//using java.sql.date
			//if I want to use java.util.date EACH time
			java.util.Date d2 = new Date(2l);
	}
}
