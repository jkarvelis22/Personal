
public class Car {
	
	private String type;
	private int numOfWheels;
	private int numOfDoors;
	private boolean isTruck;

	public Car() {
		super();
	}

	public Car(String type, int numOfWheels, int numOfDoors, boolean isTruck) {
		this.type = type;
		this.numOfWheels = numOfWheels;
		this.numOfDoors = numOfDoors;
		this.isTruck = isTruck;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public int getNumOfWheels() {
		return numOfWheels;
	}

	public void setNumOfWheels(int numOfWheels) {
		this.numOfWheels = numOfWheels;
	}

	public int getNumOfDoors() {
		return numOfDoors;
	}

	public void setNumOfDoors(int numOfDoors) {
		this.numOfDoors = numOfDoors;
	}

	public boolean isTruck() {
		return isTruck;
	}

	public void setTruck(boolean isTruck) {
		this.isTruck = isTruck;
	}

	@Override
	public String toString() {
		return "Car [type=" + type + ", numOfWheels=" + numOfWheels + ", numOfDoors=" + numOfDoors + ", isTruck="
				+ isTruck + "]";
	}
	
}
