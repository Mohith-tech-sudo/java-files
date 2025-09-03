//Hierarchial Inheritance

class Box{
	double width;
	double height;
	double depth;
	
	Box(double w,double h,double d){
		this.width=w;
		this.height=h;
		this.depth=d;
	}
	Box(double d){
		this.width=d;
		this.height=d;
		this.depth=d;
	}
	Box(){
		this.width=0;
		this.height=0;
		this.depth=0;
	}
	void volume(){
		double vol = width*height*depth;
		System.out.println("Volume of the box is " + vol);
	}
}

class BoxWeight extends Box{
	double weight;
	BoxWeight(double w,double h,double d,double b){
		this.width=w;
		this.height=h;
		this.depth=d;
		this.weight=b;
	}
}

class BoxValue extends Box{
	int value;
	BoxValue(double w,double h,double d,int v){
		this.width=w;
		this.height=h;
		this.depth=d;
		this.value=v;
	}
}

public class InheritanceDemo3{
	public static void main(String[] args){
		BoxWeight b1 = new BoxWeight(11,12,15,18);
		b1.volume();
	}
}
