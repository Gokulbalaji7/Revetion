package revetion;

public class finally_ {

	public static void main(String[] args) {

		try {
			int[] myNumbers = { 1, 2, 3 };
			System.out.println(myNumbers[3]);
		}

		catch (ArrayIndexOutOfBoundsException f) {
			System.out.println(f    + "ArrayIndexOutOfBounds Exception will throw");
		}

		finally {
			System.out.println("Finally also printed");
		}

	}
}


/*
 
 The finally keyword is used to execute code 
 (used with exceptions - try.. catch statements) 
 no matter if there is an exception or not.
 
  final is the keyword and access modifier which is used 
  to apply restrictions on a class, method or variable. 

*/
