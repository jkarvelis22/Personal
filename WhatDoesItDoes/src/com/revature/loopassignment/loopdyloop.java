package com.revature.loopassignment;

public class loopdyloop {
    public static void doloop(int i) {
    for (int z = i; i<60; i++) {


        do {
            if (i % 2 == 0) {
            System.out.println("<-");
            ++i;}

            else if (i % 3 == 0) {
                System.out.println("->");
                ++i;
            }

            else {
                System.out.println("^_^");
                ++i;
            }



            }while (i!=100);
    }
    }

    public static void switchcase(int i) {
        switch (i) {
        case 73 :
            System.out.println("This number is cool");
            break;
        case 25 :
            System.out.println("This number isn't cool");
            break;
        default:
            System.out.println("This number is meh");
            break;


        }
    }
    public static void main(String [] args) {
        switchcase(22);
        doloop(15);

    }
}

	
