package hk.corejava;

import java.util.Scanner;

public class WelcomeProgram {

	public static void main(String[] args) {
		
		System.out.println("Welcome to java");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Value");
		
		int a = sc.nextInt();
		System.out.println("enter b Value");
		int b = sc.nextInt();
		int c =a+b;
		System.out.println("op is"+c);
	
	}

}
