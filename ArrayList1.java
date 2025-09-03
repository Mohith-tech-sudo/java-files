//Basic arraylist

import java.util.ArrayList;

public class ArrayList1{
	public static void main(String[] args){
		ArrayList<String> fruits = new ArrayList<>();
			fruits.add("Apple");
			fruits.add("Banana");
			fruits.add("Cherry");
			System.out.println("Fruits: " + fruits);
			System.out.println("First fruit: " + fruits.get(0));
			fruits.remove("Banana");
			System.out.println("After removal: " + fruits);
	}
}
