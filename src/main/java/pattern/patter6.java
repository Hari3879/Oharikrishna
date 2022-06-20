package pattern;
/*
 * print numbers like calender 5 lins 5 rows 
 * and comented  printing alternative numbers 
 */

public class patter6 {

	public static void main(String[] args) {
		int n=5;
		int k=1;
		
	
		for(int i=1;i<=n;i++) {
			for ( int j=1;j<=n;j++) {
				System.out.printf("%2d",k);
				k++;
				// k+=2; if u want alternative numbers 
			}
			System.out.println(" ");
			}
	}
}


