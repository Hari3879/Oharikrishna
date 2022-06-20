package BasicPrograms;

public class PalinDrome1 {

	public static void main(String[] args) {
	
			      String str = "ABA";
			      String strRev = new StringBuffer(str).reverse().toString();
			      if (str.equals(strRev))
			         System.out.println("Palindrome!");
			      else
			         System.out.println("Not a Palindrome!");
			   }
			
	}


