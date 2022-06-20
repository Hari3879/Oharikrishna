package hk.pattern;

public class pattern {

	public static void main(String[] args) {
//		System.out.println("#  *  *  *  #");
//		System.out.println("*  #  *  #  *");
//		System.out.println("*  *  #  *  *");
//		System.out.println("*  #  *  #  *");
//		System.out.println("#  *  *  *  #");
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=10;j++) {
				if(i==j || i+j==11) {
					System.out.print("#");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println(" ");
	}

}
}
