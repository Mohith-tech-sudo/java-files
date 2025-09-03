//Constructor Chain
class Animal{	
	Animal(){
		System.out.println("Animal first");
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

public class ConstructorChain{
	public static void main(String[] args){
		Carnivores carniv = new Carnivores();
	}
}
