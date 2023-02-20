package Simpleprograms;

class Output {
float salary = 40000;
}

class Programmer extends Output{
	int bonus = 10000;
}
 
 class Mainclass{
	public static void main(String[] args) {
		Programmer p=new Programmer ();
		
		System.out.println("Programmer salary is : "+ p.salary);
		System.out.println("Bonus of Programmer is : "+ p.bonus);

	}

}
