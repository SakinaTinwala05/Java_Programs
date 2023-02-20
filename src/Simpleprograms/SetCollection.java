package Simpleprograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetCollection {

	public static void main(String[] args) {

		Set<String> data = new LinkedHashSet<String> ();
		
		data.add("Java");
		data.add("Python");
		data.add(".net");
		data.add("Python");
		
		System.out.println("Set :" + data);
		
	}

}
