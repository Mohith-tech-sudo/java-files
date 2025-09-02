//MemberHiding
class Parent {
    	int num = 90; 
}
class Child extends Parent {
    	int num = 150; 
    	void display() {
        		System.out.println("Child class num: " + num);       
        		System.out.println("Parent class num: " + super.num); 
    	}
}
public class MemberHidingDemo {
    	public static void main(String[] args) {
        		Child obj = new Child();
        		obj.display();
    	}
}
