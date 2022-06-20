package AreaOfCircle;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter radius  value ");
		int radius=sc.nextInt();
		//area of cielcle = pi*r^2
		// double area= Math.PI*radius*radius;
		
	int   area=(22*radius*radius)/7;
		System.out.println( "area of circle is " +area);

	}

}
