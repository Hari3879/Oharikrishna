package Constructor;

class child {
	child(){
this(10);
		System.out.println( "chid default");
	}
	child(int j){
//		this(10);
//		super(10);
		System.out.println("chid param");
	}
}

 class ThisAndSuper  extends child {

	public ThisAndSuper() {
//		super();
//		this(10);
		System.out.println(" parent default");
	}
	ThisAndSuper(int i){
		System.out.println(" parent parametrizrd ");
	}
	class super1 extends ThisAndSuper{
		super1(){
			System.out.println("hi");
		}
		super1( int k){
			System.out.println("hello");
		}
	}
	
	public static void main(String[] args) {
		
		ThisAndSuper sc= new ThisAndSuper();
		

	}

}
