package Areaandperimeter;

import java.util.Scanner;

public class AreaAndPerimeter {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enetr the radius =");
		double radius =sc.nextDouble(); 
		
		double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;
		System.out.println("perimeter is " +perimeter);
		System.out.println("area is "+area);
	}

}
