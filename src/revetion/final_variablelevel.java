package revetion;

public class final_variablelevel {
	
	final int speedlimit=90;//final variable
	
	public void run(){  
	  speedlimit=400;  
	 }  
	
	 public static void main(String args[]){  
		 final_variablelevel obj=new  final_variablelevel();  
	 obj.run();  
	 }  
	}

/*
Characteristics of final keyword in java:


In Java, the final keyword is used to indicate that a variable, method, or class cannot be modified or extended. Here are some of its characteristics:

Final variables: When a variable is declared as final, its value cannot be changed once it has been initialized. This is useful for declaring constants or other values that should not be modified.


Final methods: When a method is declared as final, it cannot be overridden by a subclass. This is useful for methods that are part of a class’s public API and should not be modified by subclasses.


Final classes: When a class is declared as final, it cannot be extended by a subclass. This is useful for classes that are intended to be used as is and should not be modified or extended.


Initialization: Final variables must be initialized either at the time of declaration or in the constructor of the class. This ensures that the value of the variable is set and cannot be changed.
Performance: The use of final can sometimes improve performance, as the compiler can optimize the code more effectively when it knows that a variable or method cannot be changed.
Security: final can help improve security by preventing malicious code from modifying sensitive data or behavior.
Overall, the final keyword is a useful tool for improving code quality and ensuring that certain aspects of a program cannot be modified or extended. By declaring variables, methods, and classes as final, developers can write more secure, robust, and maintainable code. 


*/
