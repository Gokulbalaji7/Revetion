package revetion;

public class trymultiplecatch {

	public static void main(String[] args) {

	
		
		
//sample 1	
		
		try{    
            String s = null;    // or give s = "gokul"
            System.out.println(s.length());  
           }    
           catch(ArithmeticException e)  
              {  
               System.out.println("Arithmetic Exception will throw");  
              }    
           catch(ArrayIndexOutOfBoundsException f)  
              {  
               System.out.println("ArrayIndexOutOfBounds Exception will throw");  
              }    
           catch(NullPointerException g)  
              {  
               System.out.println("NullPointerException will throws ");  
              }  
		catch (Exception h) {

			 System.out.println("Parent Exception will throws ");
		}
		
		
		
		
		
//sample 2	
		
		try {
			int[]exptn = {10,20,30};
			System.out.println(exptn[3]);	// in index 0,1,2,3 so four values
		} 
		catch (ArrayIndexOutOfBoundsException a) {

			System.out.println(a);
		}
		catch (ArithmeticException b) {

			System.out.println(b);
		}
		
		catch (Exception c) {

		System.out.println("parent default exception wil throw");
		
		}
		
		
		
		
		
		
		
		
	}

}
