package BasicPrograms;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("price of product");
         int price= sc.nextInt();
         System.out.println("discount in percentage");
         double discount=sc.nextInt();
         double discountedPrice= price*(discount/100);
         
         System.out.println( "discount amount " +discountedPrice);
         double priceafterdiscount=price-discountedPrice;
         System.out.println("after discount price"+priceafterdiscount);
         
         
	}

}
