package Constructor;

class B {
	
	B(){
		this(20);
		System.out.println("Default class of Parent");
	}
	B(int j){
			
		System.out.println("Parameter class of Parent");
		System.out.println(j);
	}
}


 class A extends B{

	A() {
		
		System.out.println("Default class of child");
	}
	A(int i){
//		super();
		System.out.println("parameterised class of child");
		System.out.println(i);
		
	}

	public static void main(String[] args) {
		A c=new A(10);
	}

}
