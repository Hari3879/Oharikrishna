package Swapnumbers;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("ENETER A VALUE IS =");
		int a=sc.nextInt();
		System.out.println("ENETER b VALUE IS =");
		int b=sc.nextInt();
		
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("after swaping  a value is"+ a +"and b value is" +b);

	}

}
