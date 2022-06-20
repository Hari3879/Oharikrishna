package Swap;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enetr a value is");
	
		int a= sc.nextInt();
	System.out.println("enter b value is ");
	int b= sc.nextInt();
	int c;
	
	c=a;
	a=b;
	b=c;
	
	System.out.println(+a);
	System.out.println(+b);
		
		
	}

}
