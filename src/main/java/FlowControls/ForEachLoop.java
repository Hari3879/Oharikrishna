package FlowControls;
/**
 * array values printing 
 * @author ho22078
 *
 */

public class ForEachLoop {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,5};
		for (int i=0;i<arr.length;++i) {
//			System.out.println(arr[i]);
//			System.out.println(arr[(0)]);
			arr[(0)]=222;
			System.out.println(arr[i]);
			for (int k:arr) {
				System.out.println(k);
			}
					
			
		}
	}

}
