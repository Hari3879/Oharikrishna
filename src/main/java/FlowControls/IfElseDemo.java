package FlowControls;
/**
 * find given number is even or odd
 */

import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) {
		/**
		 * finding even or odd number
		 */
            Scanner sc=new Scanner(System.in);
            System.out.println("eneter Number is");
            int Number=sc.nextInt();
            if (Number%2==0) {
            	System.out.println( Number+" is even ");
            	
            }else {
            	System.out.println(Number+" is odd ");
            }
            
	}

}
