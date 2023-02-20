package Simpleprograms;

public class EncapsulationMain {

	public static void main(String args[]) {
		int age = 18;
		String name = "sakina";
		EncapsulationProgram encapsulationProgram = new EncapsulationProgram();
		encapsulationProgram.setAge(age);
		encapsulationProgram.setName(name);
		System.out.println(
				"my name is:" + encapsulationProgram.getName() + " and my age is :" + encapsulationProgram.getAge());
	}

}
