package instance;

public class instance2 {
static int y=50;// static variable 
static int  z= 60;
int j=23;
int k=42;// instance variable 
	public static void main(String[] args) {
		instance2 e=new instance2();
		int a = 10;// local variable 
		int b = 20;
		int c = 30;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(y);
		hari();
		mitra();
		e.shasi();
		e.avinash();
		
		}
public  static void hari() {// static method 
	int x=25;
	System.out.println(x);
	}
public void shasi() {// instance method 
	System.out.println(y);
	System.out.println(j);
	
}
public static void mitra() {
//	System.out.println(j);
	System.out.println(y);
	}
public void avinash() {

	int m=41;
	System.out.println(j);
	System.out.println(m);
	
}
}
