//Constructor Chain
class A{
	A(){
		System.out.println("Constructor of A");
	}
}
class B extends A{
	B(){
		System.out.println("Constructor of B");
	}
}
class C extends B{
	C(){
		System.out.println("Constructor of C");
	}
}

class InheritanceDemo3{
	public static void main(String[] args){
		C c = new C();
	}
}
