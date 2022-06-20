package FlowControls;

import java.util.Scanner;

/**
 * find the largest number in the given Numbers
 * @author ho22078
 *
 */

public class IfElseIfElse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number ,second number,third number ");
		int FirstNumber=sc.nextInt();
		int SecondNumber=sc.nextInt();
		int ThirdNumber=sc.nextInt();
		if(FirstNumber>SecondNumber&& FirstNumber>ThirdNumber) {
			System.out.println( FirstNumber+"largest number");
		}else if(SecondNumber> FirstNumber && SecondNumber>ThirdNumber) {
			System.out.println("largest number is "+SecondNumber);
			
			
		}else if( ThirdNumber>FirstNumber && ThirdNumber> SecondNumber ) {
		System.out.println("largest number is " + ThirdNumber);
		
		}
		else {
			System.out.println("any two or more numbers are equal ");
		}
	
	}

}
