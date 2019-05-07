package com.revature;

public class StringDriver {

    public static void main(String[] args) {
        String string1 = "North";
        String string2 = "North";
        String string3 = new String("North");
        String string4 = null;

        System.out.println(string1 == string2);//false
        System.out.println(string1 == string3);//false
        System.out.println(string1.equals(string3));//true

        //Moves the string object into the string pool
        string3 = string3.intern();
        System.out.println(string1 == string3);//true

        String string5 = "South";
        string5.concat("east");//does nothing without capturing the return value
        System.out.println(string5;//"South"(beacuse Srings are immutable

        String string6 = string5.concat("west");
        System.out.println(string6);//Southwest

        String string7 = "Southwest";
        System.out.println(string6 == string7);//false

       // string4.concat("hello"); //NullPointerException

        System.out.println(string6.hashCode());
        System.out.println(string7.hashCode());

        /*
        StringBuilder
        -mutable
        -not thread safe

        StringBuffer
        -mutable
        -thread safe
         */
    }

}
