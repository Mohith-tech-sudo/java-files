class Parent{
	int num = 150;

	Parent(){
		System.out.println("Parent class Constructor called");
	}
	void display(){
		System.out.println("This is Parent class");
	}
}

class Child extends Parent{
	int num = 200;
	
	Child(){
		super();
		System.out.println("Child class constructor called");
	}
	void show(){
		System.out.println("Child num: " + num);
		System.out.println("Parent num using superkeyword: " + super.num);
		super.display();
	}
}

public class SuperKeywordDemo{
	public static void main(String[] args){
		Child obj = new Child();
		obj.show();
	}
}
