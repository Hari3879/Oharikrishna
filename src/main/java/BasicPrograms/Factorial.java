package BasicPrograms;
/**
 * factorial of a number
 */

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int number=sc.nextInt();
//	long n,fact=1;
//	n=Long.parseLong(args[0]);
//	for(int i=1;i<=number;i++) {
	int fact=1;
	for(int i=1;i<=number;++i) {
		fact=fact*i;
		}
//		      
//	}
	System.out.println(fact);

	}
	

}
