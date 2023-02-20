package Simpleprograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetCollection2 {

	public static void main(String[] args) {
		
		Set<String> fruits = new LinkedHashSet <String> ();

		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Mango");
		
		System.out.println(fruits);
		
	}

}
