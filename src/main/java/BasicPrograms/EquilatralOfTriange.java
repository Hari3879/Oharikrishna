package BasicPrograms;
/**
 * equilatral triangele area
 * @param args
 */


import java.util.Scanner;

public class EquilatralOfTriange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr one of the  side ");
		 double side=sc.nextInt();
		double  area=Math.sqrt(3)/4*side*side;
				System.out.println(area );
//		int height=sc.nextInt();
//		int base=sc.nextInt();
//        double area =(base*height)/2;
//       System.out.println(area);
//	}

}
}
