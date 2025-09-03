//Member Hiding

class Parent{
	int num = 120;
}

class Child extends Parent{
	int num = 230;
	void display(){
		System.out.println("Child class num: " + num);
		System.out.println("Parent class num: " + super.num);
	}
}

public class MemberHidingDemo{
	public static void main(String[] args){
		Child obj = new Child();
		obj.display();
	}
}
