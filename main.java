package com.java.movie;

import java.util.Scanner;

public class main {
	 static Scanner sc=new Scanner(System.in);
	

	public static void main(String[] args) {
		
		CustomerDAOImpl cdi=new CustomerDAOImpl();
		System.out.println("enter your name ");
		cdi.name();
		System.out.println("enter your age ");
		cdi.age();	
		System.out.println("enter your mobile num");
		cdi.mobileNum();
		System.out.println("enter req seats" );
		cdi.ReqSeats();
		
	
			
}
}
