
public class Cat {
	private String name;
	private int numOfLegs;
	private int numOfTails;
	private boolean isAlien;

	
	public Cat() {
		super();
	}
	public Cat(String name, int numOfLegs, int numOfTails, boolean isAlien) {
		this.name = name;
		this.numOfLegs = numOfLegs;
		this.numOfTails = numOfTails;
		this.isAlien = isAlien;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		
	}
	public int numOfLegs() {
		return numOfLegs;
	}
	public void setNumOfLegs(int numOfLegs) {
		this.numOfLegs = numOfLegs;

}
	public int getNumOfTails() {
		return numOfTails;
	}
	public void setNumOfTails(int numOfTails) {
		this.numOfTails = numOfTails;
	}
	public boolean getIsAlien() {
		return isAlien;
	}
	public void setIsAlien(boolean isAlien) {
		this.isAlien = isAlien;
	}
	@Override
	public String toString() {
		return "Cat [name=" + name + ", numOfLegs=" + numOfLegs + ", numOfTails=" + numOfTails + ", isAlien=" + isAlien
				+ "]";
	}
	
}