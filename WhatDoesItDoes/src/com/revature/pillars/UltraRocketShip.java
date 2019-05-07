package com.revature.pillars;

import com.revature.blueprints.RocketShip;

/*
 * Members of a class - variables and methods
 * Static and instance forms
 * Instance variables - property of one specific object(i.e. warpDriveModel)
 * Static variables - belong to ALL UltraRocketShips(i.e. Ford)
 * Instance methods - Behavior related to a specific object(i.e getName())
 * Static methods - Behavior relative to the entire class/all objects of that type
 * Final variable - Value cannot be changed
 * 		static final variables are constants
 *  	Final instance variables cannot be changed once initialized
 *  	final method - A method that cannot be overridden
 *  	final class - A class that cannot be extended/no more inheritance
 */

public class UltraRocketShip extends RocketShip {
	private boolean hasBar;
	private String warpDriveModel;
	static private String manufacturer = "Ford";
	
	public static void setManufacturer(String manufacturer) {
		UltraRocketShip.manufacturer = manufacturer;
	}
	
	public static String getManufacturer() {
		return manufacturer;
	}
	//Default constructor
	public UltraRocketShip() {
		super();
		this.setMiniFridge(true);
	}
	//Constructor with parameters 
	public UltraRocketShip(String name, int numOfRockets, int fuelCapacity, boolean hasBar,
			String warpDriveModel) {
		super(name, numOfRockets, fuelCapacity, true);
		this.hasBar = hasBar;
		this.warpDriveModel = warpDriveModel;
	}

	public String getWarpDriveModel() {
		return warpDriveModel;
	}

	public void setWarpDriveModel(String warpDriveModel) {
		this.warpDriveModel = warpDriveModel;
	}
	@Override
	public boolean isMiniFridge() {
		System.out.println("Duh of course it has a mini fridge");
		return super.isMiniFridge();
	}
	@Override
	public String toString() {
		return "UltraRocketShip [name="+ super.getName()+" numOfRockets= "
	+ super.getNumOfRockets()+ " fuelCapacity= "+ super.getFuelCapacity()+
	"hasBar=" + hasBar + ", warpDriveModel=" + warpDriveModel + "]";
	}
	
	
	
	
	
	}

