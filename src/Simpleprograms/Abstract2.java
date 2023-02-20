package Simpleprograms;

abstract class StarCompany {
	abstract void printInfo();
}

class Employee extends StarCompany {
    void printInfo() {
        String name = "Sakina";
        int age = 21;
        float salary = 20000;
 
        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
 
    }
 
}
class Base {
	public static void main(String[] args) {
		
		StarCompany s = new Employee();
        s.printInfo();

	}

}
