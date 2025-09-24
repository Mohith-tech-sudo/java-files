//All the shapes should be in different files
//Interface shape package operation
//Shape.java
package P1;

public abstract class Shape{
	public abstract double calculateArea();
}

//Rectangle.java
package P2;
import P1.Shape;
public class Rectangle extends Shape{
	double length;
	double width;
	public Rectangle(double length, double width){
		this.length = length;
		this.width = width;
	}
	public double calculateArea(){
		return length*width;
	}
}

//Circle.java
package P3;
import P1.Shape;

public class Circle extends Shape{
	private double radius;
	public Circle(double radius){
		this.radius = radius;
	}
	public double calculateArea(){
		return Math.PI * radius * radius;
	}
}

//Importing all Shape,Rectangle,Circle packages
import P1.Shape;
import P2.Rectangle;
import P3.Circle;

public class Main{
	public static void main(String[] args){
		Rectangle r = new Rectangle(5,4);
		System.out.println("Area of Rectangle:" + r.calculateArea());
		Circle c = new Circle(3);
		System.out.println("Area of Circle:" + c.calculateArea());
	}
}

//First should be executed by javac -d . Shape.java
//Next should be executed by javac -d . Rectangle.java
//Next should be executed by javac -d . Circle.java
//Then main method should be executed by javac Main.java then Java Main
