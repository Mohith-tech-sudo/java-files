//Default method in interface

interface A{
	void abstractMethod();
	default void sample(){
		System.out.println("This is a default method.");
	}
}
class B implements A{
	public void abstractMethod(){
		System.out.println("Abstract method ");
	}
}

public class DefaultMethod{
	public static void main(String[] args){
		B obj = new B();
		obj.sample();
		obj.abstractMethod();
	}
}
