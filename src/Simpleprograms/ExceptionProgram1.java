package Simpleprograms;

class TryCatch {

	public static void main(String[] args) {
		
		try {

		      int num1 = 100, num2 = 0;
		      int result = num1 / num2; // divide by zero
		      
		      //print the result
		      System.out.println("Result = " + result);
		    
		}
		    
		catch (ArithmeticException e) {
		      
			System.out.println("ArithmeticException : Division by Zero ");
		    
		}

	}

}
