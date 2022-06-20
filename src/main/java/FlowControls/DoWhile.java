package FlowControls;
/**
 * print 1 to 10 numbers 
 * @author ho22078
 *
 */

public class DoWhile {

	public static void main(String[] args) {
		int number=1;
		 int sum=0;
		do {
		System.out.println(number);
			sum +=number;
			
			++number;
			 //sum +=number;
			//System.out.println(number);
		}
		while(number<=10);
		System.out.println(sum);
		
	}

}
