package com.joshua.model;

public class Simulator {
    public static void main(String[] args) {
        CustomObject obj = new CustomObject("josh");
        System.out.println(obj);

        Object objRef=obj;
        System.out.println(objRef);

        Object objRef2 = (Object)obj;
        System.out.println(objRef2);
    }

}
