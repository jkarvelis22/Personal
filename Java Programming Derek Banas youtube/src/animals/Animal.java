package animals;

import java.util.Scanner;

public class Animal {

    public static final double FAVNUMBER = 1.6180;

    private String name;
    private int weight;
    private boolean hasOwner = false;
    private byte age;
    private long uniqueID;
    private char favoriteChar;
    private double speed;
    private float height;

    protected static int numberOfAnimals = 0;

    static Scanner userInput = new Scanner(System.in);

    public Animal() {
        numberOfAnimals++;

        int sumOfNumbers = 5 + 1;
        System.out.println("5 + 1 = " + sumOfNumbers);

        int diffOfNumbers = 5 - 1;
        System.out.println("5 - 1 = " + diffOfNumbers);

        int multOfNumbers = 5 * 1;
        System.out.println("5 * 1 = " + multOfNumbers);

        int divOfNumbers = 5 / 1;
        System.out.println("5 / 1 = " + divOfNumbers);

        int modOfNumbers = 5 % 3;
        System.out.println("5 % 3 = " + modOfNumbers);

        System.out.print("Enter the name: \n");

        if (userInput.hasNextLine()) {
            this.setName(userInput.nextLine());

        }
    }

    public static void main(String[] args) {

        Animal theAnimal = new Animal();
    }
}
