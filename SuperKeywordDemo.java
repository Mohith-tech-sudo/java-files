//Super Keyword

class Parent{
	int num = 100;
	Parent(){
		System.out.println("Parent class constructor called");
	}
	void display(){
		System.out.println("This is present class method");
	}
}

class Child extends Parent{
	int num = 150;
	Child()
	{
		super();
		System.out.println("Child class constructor called");
	}
	void show(){
		System.out.println("Child num: " + num);
		System.out.println("Parent num using supe: " + super.num);
		super.display();
	}
}

public class SuperKeywordDemo{
	public static void main(String[] args){
		Child obj  = new Child();
		obj.show();
	}
}
