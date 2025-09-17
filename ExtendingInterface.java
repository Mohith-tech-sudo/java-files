// Extending Interfaces 

interface A{
	int x = 20;
	public void showA();
}

interface B extends A{
	int y = 30;
	public void showB();
}

class C implements B{
	public void showA(){
		System.out.println("X is " +x);
	}
	public void showB(){
		System.out.println("Y is " +y);
	}
}

class ExtendingInterface{
	public static void main(String[] args){
		C obj = new C();
		obj.showA();
		obj.showB();
	}
}
