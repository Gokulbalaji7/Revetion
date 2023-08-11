package revetion;

public class nested_try {

	public static void main(String[] args) {

		try {
			
			try {
				
   // sample 1
				
			//	int a= 20;
				//int b = 0;
				//int c= a/b;
				
				
			//	System.out.println(c + "  answer will executed");
				
				
				
				
	// sample 2	
				
	/*			String s = null;
				if(s.equals("ggg"))
				{
					System.out.println("passed");
				}
				else {
					System.out.println("failed");
				}
				*/	
				
								
				 
				
			} 
			
		
			catch (NullPointerException e) {
			System.out.println(" NullPointerException will throw");
			}
			
		} 
		catch (ArithmeticException b) {
		System.out.println("ArithmeticException will throw");
		}
		
	}

}
