package accessmodifiers;

class access {
	public static void access() {
		System.out.println("b");
//		System.out.println(c);

	}

	int c = 13;
	int b = 20;

}

class avi { 
	void avi() {
		int z=15;
		System.out.println(z);
		
}

}

public class Hello {

	protected void merugu() {
		int hari = 45;
		int avi = 10;
		System.out.println("Protected Method is  " + hari);
		System.out.println(hari * avi);

	}

	public static void a() {
		System.out.println("This is from Hello clas a");
	}

	public static void main(String[] args) {

		access obj = new access();
		avi h=new avi();
		Hello hello = new Hello();

		int a = 10;
		int v = 15;
		System.out.println(a);
//		System.out.println(b);
		System.out.println(a * v);

		a();

		Acessnani();
		obj.access();
		h.avi();
		hello.merugu();
		access();
	}

	private static void Acessnani() {
		System.out.println("djfghjk");
		int y = 12;
		int z = 45;
		System.out.println(y * z);

	}

	public static void access() {
		System.out.println("b");
//		System.out.println(c);

	}

}
