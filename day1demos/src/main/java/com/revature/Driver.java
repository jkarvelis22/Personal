package com.revature;

public class Driver {

    public static void main(String... args) {

        varArgs("test1");
        varArgs("test2", 1);
        varArgs("test3", 1, 2, 3, 4);
    }

    public static void varArgs(String myString, int... value) {
        System.out.println(myString);

        for (int i : value) {
            System.out.println(i);
        }

    }

}
