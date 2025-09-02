//Constructor calling chain

class Animal{
	Animal(){
		System.out.println("Animal executed first");
	}
}

class Mammal extends Animal{
	Mammal(){
		System.out.println("Mammal next");
	}
}

class Carnivores extends Mammal{
	Carnivores(){
		System.out.println("Carnivores next");
	}
}

public class ConstructorDemo{
	public static void main(String[] args){
		Carnivores carniv = new Carnivores();
	}
}
