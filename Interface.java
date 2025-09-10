//Interface program
import java.io.*;

interface Add{
    int add(int a,int b);
}

interface Sub{
  	int sub(int a,int b);
}
 
class A implements Add , Sub
{
  	public int add(int a,int b){
      	return a+b;
	}
  
  	public int sub(int a,int b){
    	return a-b;
    	}
  
}

class Interface{
    
    public static void main (String[] args) 
    {
      	A obj = new A();
      
      	System.out.println("Addition : " + obj.add(2,1));
      	System.out.println("Substraction : " + obj.sub(2,1));
      
    }
}
