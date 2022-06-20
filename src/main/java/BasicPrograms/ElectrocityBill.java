package BasicPrograms;

import java.util.Scanner;

public class ElectrocityBill {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enetr the units ");
		int units = sc.nextInt(); 
		System.out.println("per unit value");
		int perunit=sc.nextInt();
		 double billToPay = 0;  
		 if(units < 100)  
	        {  
	            billToPay = units * perunit;  
	        }  
		 else if(units < 300){  
	            billToPay = 100 * perunit + units * perunit;  
	        }  
		  else if(units >300)  
	        {  
	            billToPay = 100 *perunit + units * 2 + units*perunit;  
	        }  
	        System.out.println("The electricity bill for " +units+ " is : " + billToPay); 
	
		 

	}

}
