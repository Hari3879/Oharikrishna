package Assignment1;
/**
 * Define a static Method that computes the age in terms of years and months for a given birthMonth and birthYear of a person.
 */

import java.util.Scanner;

public class FindAge {
	
	static double calculateAge( int birthYear ,int  birthMonth) {
		double curentAge=2021-birthYear;
		double age=((12*curentAge+birthMonth)/12);
		if(birthMonth<1 || birthYear<1 ) {



			return -1;
			}
			if(birthMonth>6 && birthYear>=2022) {



			return -2;
			}
			return age;



			}
		
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the your birth year");
		int birthYear=sc.nextInt();
		System.out.println("enter the your birth month");
		int birthMonth=sc.nextInt();
		System.out.println(calculateAge(birthYear,birthMonth));





		}





		
	

	
	
}


