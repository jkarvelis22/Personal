package com.revature.pillars;

public class Driver {
	public static void main(String[] args) {
		UltraRocketShip uss = new UltraRocketShip("uss delicious", 2, 100, true,"ACAI berry");
		System.out.println(uss.isMiniFridge());
		System.out.println(uss.toString());
		uss.getFuelCapacity();
		
	}
}
