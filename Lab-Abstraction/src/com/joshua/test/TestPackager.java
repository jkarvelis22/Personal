package com.joshua.test;

import com.joshua.builders.Assembler;
import com.joshua.interfaces.Packager;

public class TestPackager {

    public static void main(String[] args) {
        Packager packager = new Assembler();
        Package myPackage = packager.assemblePackage();

        System.out.println(myPackage);
    }
}
