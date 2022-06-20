package FlowControls;
/**
 * choice of i chhosen peticular oparation for two given numbers 
 */

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1.subtraction 2.addition 3.multiplication 4.divistion");
		System.out.println("enter range b/w 1 to 4 ");
	   
		int choice = sc.nextInt();
		int Number=sc.nextInt();
		int Number2=sc.nextInt(); 
		
		switch(choice){
			case 1:System.out.println(Number-Number2);
			break;
			
			case 2:System.out.println(Number+Number2);
			break;
			case 3:System.out.println(Number*Number2);
			break;
			case 4:System.out.println(Number/Number2);
			break;
			default:System.out.println("given range not valid");
			
		}
	}
}
