//To implement a constructor
class Person{
	String name;
	int age;
	
	Person(){
		name="Unknown";
		age=0;
	}
	
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	void display()
	{
		System.out.println("Name: " + name + ",Age: " +age);
	}


	public static void main(String[] args)
	{
     	Person p1=new Person();
     	p1.display();
     	
     	Person p2=new Person("Mohith",18);
     	p2.display();
	}
}
