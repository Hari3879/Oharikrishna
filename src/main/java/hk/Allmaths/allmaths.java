package hk.Allmaths;

import java.util.Scanner;

public class allmaths {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("enter 1st value=");
		int a=sc.nextInt();
		System.out.println("enter 2nd value=");
		int b=sc.nextInt();
		int c=a-b,d=a+b,e=a*b,f=a/b,g=a%b;
		System.out.println("program results is "+c +"\n"+d+"\n"+e+"\n"+f+"\n"+g);
		

	}

}
