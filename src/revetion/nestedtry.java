package revetion;

import java.util.Scanner;

public class nestedtry {

	public static void main(String[] args) {
		
		
		
                          // sample 1		
		
		/*
		 * 
		 * try { int a=10; 
		 * System.out.println(a); 
		 * try { int b=10*a;
		 * System.out.println(b); 
		 * int c=b; System.out.println(c/0); }
		 * catch (Exception e)
		 * System.out.println(e.getMessage()+"child try block"); } }
		 * catch(Exception ex)
		 * { System.out.println(ex.getMessage()+"parent try block"); }
		 */

		
		
		
		
	                    	// sample 2
		
		
		try {
			String s = "gokul";
			System.out.println(s.charAt(0) + " is first try parent");
			try {
				System.out.println(s.charAt(5) + " is second try child");
			} catch (Exception e) {
				System.out.println(e.getMessage()+"child exception");
			}

		} catch (Exception f) {
			System.out.println(f.getMessage()+"parent exception");
		}

	}

}
