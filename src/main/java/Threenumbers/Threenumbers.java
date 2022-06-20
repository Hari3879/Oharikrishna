package Threenumbers;

import java.util.Scanner;

public class Threenumbers {

	public static void main(String[] args) {
//		int a = 0;
//		int b = 1;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("total numbers=");
//		int n = sc.nextInt();
//		while (b <= n)
//			;
//		{
//			System.out.println("input number" + "(" + b + ")" + ":");
//			a = sc.nextInt();
//			b += 1;
//		}
//		int avg = (a / n);
//		System.out.println("Average:" + avg);
		 double num = 0;
		  double x = 1;
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Input the number(n) you want to calculate the average: ");
		  int n = sc.nextInt();
		  while (x <= n) {
		   System.out.println("Input number " + "("+  (int) x +")" + ":");
		   num += sc.nextInt();
		 
		   x += 1;
		  }
		  double avgn = (num / n);

		  System.out.println("Average:" + avgn);	
	}

}
