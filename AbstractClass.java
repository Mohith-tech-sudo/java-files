//Abstract Class program
import java.util.*;

abstract class AbstarctClass{
	abstract void printInfo();
}
class b extends AbstractClass{
	void printInfo(){
		String name = "Mohith";
		int age = 19;
		System.out.println("name is " + name);
		System.out.println("age is " + age);
	}
}

class AbstractClass{
	public static void main(String[] args){
		b obj = new b();
		obj.printInfo();
	}
}
