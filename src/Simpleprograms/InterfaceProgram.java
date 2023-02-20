package Simpleprograms;

interface Polygon {
	  void getArea(int length, int breadth);
}

class Rectangle1 implements Polygon {

	  // implementation of abstract method
	  public void getArea(int length, int breadth) {
	    System.out.println("The area of the rectangle is " + (length * breadth));
	  
	  }
}

class Square implements Polygon {

	  // implementation of abstract method
	  public void getArea(int length, int breadth) {
	    System.out.println("The area of the square is " + (length * breadth));
	  
	  }
}

class Interface {
	public static void main(String[] args) {
		
		Rectangle1 r1 = new Rectangle1();
	    r1.getArea(5, 6);
	    Square r2 = new Square();
	    r2.getArea(5, 5);

	}

}
