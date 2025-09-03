//ArrayList using for loop

import java.util.ArrayList;
public class ArrayList2{
	public static void main(String[] args){
		ArrayList<Integer> numbers = new ArrayList<>();
			for(int i = 1;i<=5;i++){
				numbers.add(i*10);
			}
			System.out.println("Using for-each loop:");
				for(int num   : numbers){
					System.out.println(num);
				}
				System.out.println("Using for loop:");
					for(int i=0; i<numbers.size(); i++){
						System.out.println(numbers.get(i));
				}
		}
}
