package BasicPrograms;

import java.util.Scanner;

public class ArnstringNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number: ");
		int num = sc.nextInt();

		int number, temp, total = 0;

		number = num;
		while (number != 0) {
			temp = number % 10;
			total = total + temp * temp * temp;
			number /= 10;
		}

		if (total == num)
			System.out.println(num + " is an Armstrong number");
		else
			System.out.println(num + " is not an Armstrong number");

	}

}
