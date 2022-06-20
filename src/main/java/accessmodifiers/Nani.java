package accessmodifiers;

public class Nani {

	public static void a() {
		System.out.println("This is from Nani cls a");
		
	}

	private static void b() {
		System.out.println(" private b");
	}
	

	protected static void c() {
		System.out.println(" protected c");

	}

	void d() {
		System.out.println(" default d");
	}

	public static void main(String[] args) {
		Nani ab = new Nani();
		a();
		b();
		c();
		ab.d();
	}
}
