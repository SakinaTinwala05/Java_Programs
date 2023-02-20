package Simpleprograms;

public class Method {

	// create a method
	public int addNum(int a,int b) {
		int sum = a+b;
		return sum;
	}
	
	public static void main(String[] args) {
		
		int num1 = 25;
		int num2 = 15;
		
		// create an object of Method
		Method obj = new Method();
		
		// calling Method
		int result = obj.addNum(num1, num2);
		System.out.println("Sum is : "+ result);
	}

}
