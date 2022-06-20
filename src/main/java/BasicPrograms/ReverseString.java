package BasicPrograms;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a String :");
		String str=sc.next();
		System.out.print("revese a string:");
		//int j=str.length();
		
		//while(i>0) {
		for(int j=str.length();j>0;j--) {
			
			System.out.print(str.charAt(j-1));//3//2
			//i--;//4//3//2
		}
		
		
		
		
	}

}
