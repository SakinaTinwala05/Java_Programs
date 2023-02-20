package Simpleprograms;

interface CodeLang {
	  void getName(String name);
}

class ProgrammingLanguage1 implements CodeLang {

	  // implementation of abstract method
	  public void getName(String name) {
	    System.out.println("Programming Language: " + name);
	  }
}

class ProgrammingLanguage2 implements CodeLang {

	  // implementation of abstract method
	  public void getName(String name) {
	    System.out.println("Programming Language: " + name);
	  }
}

class Code {
	  public static void main(String[] args) {
	    
		ProgrammingLanguage1 language1 = new ProgrammingLanguage1();
	    language1.getName("Java");
	    
	    ProgrammingLanguage2 language2 = new ProgrammingLanguage2();
	    language2.getName("C++");
	    
	  }
}
