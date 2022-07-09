package com.java.movie;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Test {

    public void pin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Number ?");
        String snumber = sc.next();
        while(!Pattern.matches("[0-9]{10}", snumber)){
            System.err.println(" Number must be 10 digits");
            snumber = sc.next();
        }
        int sno = Integer.parseInt(snumber);
        System.out.println("Enter  Name ?");
        String sname = sc.next();
        while(!Pattern.matches("^[A-Z][a-z]*", sname)){
            System.err.println("Please Enter  Name first Character must be Capital");
            sname = sc.next();
        }
        System.out.println("Enter Mobile Number ?");
        String mno = sc.next();
        while(!Pattern.matches("[0-9]{10}", mno)){
            System.out.println("Please Enter Mobile Number must be 10 digits");

        }
        long mobile = Long.parseLong(mno);
        System.out.println(" Number = "+sno);
        System.out.println(" Name   = "+sname);
        System.out.println(" Mobile No = "+mobile);

    }

}