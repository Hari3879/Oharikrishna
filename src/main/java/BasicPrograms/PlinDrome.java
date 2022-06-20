package BasicPrograms;
/**
 * given string is palindrome or not 
 */

import java.util.Scanner;

public class PlinDrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
	System.out.println("enter the string which you  want know palindrome or not is  ");
			      String myString = sc.next();
			     StringBuffer buffer = new StringBuffer(myString);
			      buffer.reverse();
			      String data = buffer.toString();
			      if(myString.equals(data)){
			         System.out.println("Given String is palindrome");
			      } else {
			         System.out.println("Given String is not palindrome");
			      }
			   }
			
	}


