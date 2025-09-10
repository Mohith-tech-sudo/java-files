//ArrayListdemo3
import java.util.ArrayList;

public class ArrayList3{
	public static void main(String[] args){
		ArrayList<String> names = new ArrayList<>();
			names.add("Alice");
			names.add("Bob");
			names.add("Charlie");

			String searchName = "Bob";
			
			if(names.contains(searchName)){
				System.out.println(searchName + "is in the list.");
			}else{
				System.out.println(searchName + "is not in the list.");
		}
	}
}
