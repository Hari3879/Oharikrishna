package instanceaccesmodifiers;

public class instanceaccesmodifiers {
	int num4 = 40;
	static int  a=50;
	
	public static void main(String[] args) {
		instanceaccesmodifiers obj=new instanceaccesmodifiers();
		
		int num=10;
				System.out.println(num);
				System.out.println(a);//static variable
				obj.h4();
				obj.h3();
				obj.h1();
				obj.h();
				 int hari = obj.num4;
				 System.out.println(hari);


				
				

	}

	public static void publi() {// satic method
		int num2 = 20;
		
		System.out.println(num2);
		
	}

	public void h() {
		System.out.println("instance");
		System.out.println(num4);
	}

	private void h1() {
		System.out.println("private");
	}

	protected void h3() {
		System.out.println("protected");

	}

	void h4() {
		int num3 = 30;
		System.out.println(num3 * 100);
	}

}
