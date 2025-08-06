//To implement method overloading

public class Overloading
{
		//method 1
		void show()
		{
			System.out.println("No parameters");
		}
		//method 2
		void show(double x,double y)
		{
			System.out.println("Sum of x and y value"+(x+y));
		}
		//method 3
		void show(double x,double y,double a)
		{
			System.out.println("Sum of x,y,a value"+(x+y+a));
		}
		//method 4
		void show(double x,double y,double a,double b)
		{
			System.out.println("Sum of x,y,a,b value"+(x+y+a+b));
		}


	public static void main(String[] args)
	{
		Overloading obj = new Overloading();
		obj.show();
		obj.show(6,3);
		obj.show(6,3,4);
		obj.show(6,3,4,7);
	}
}
