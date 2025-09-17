//using Prime package

import prime.PrimePackage;

public class PrimeCheck{
	public static void main(String[] args){
		PrimePackage p = new PrimePackage();
		int[] numbers = {2,3,4,5,6,7,8,9};
		System.out.println("Prime numbers in the list: ");
		for(int num : numbers){
			if(p.prime(num)){
				System.out.println(num);
			}
		}
	}
}
