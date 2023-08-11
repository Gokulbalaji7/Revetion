package revetion;

public class tryctch_finally {

	public static void main(String[] args) {

		
	 
        try
        {
            int data = 125 / 0;   //for sample give 5 insted of 0
            System.out.println ("Try Block Result:" + data);
        } 
        
        catch (NullPointerException e) {
            System.out.println ("NullPointerException will be executed");
        } 
        catch (ArithmeticException e) {
        System.out.println("ArithmeticException will be executed");
        }
        
  //with finally block
        finally {
            System.out.println ("No  but finally block will be executed");
      
        } 
	}

}
