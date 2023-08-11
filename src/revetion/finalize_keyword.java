package revetion;

public class finalize_keyword {

	
	 public void finalize(){
	      System.out.println("Object garbage collected.");
	   }
	   public static void main(String[] args) {

		finalize_keyword t = new finalize_keyword();
	      t = null;
	      System.gc();
	   }
}

/*
                       what is Finalize :
                       
 Finalize() is the method of Object class.       <-------- 
 This method is called just before an object is garbage collected. 
 finalize() method overrides to dispose system resources, 
 perform clean-up activities and minimize memory leaks.
 
 
 
 system.gc() is a
 Runs the garbage collector in the Java Virtual Machine. 
Calling the gc method suggests that the Java Virtual Machineexpend effort toward recycling unused objects in order tomake the memory they currently occupy available for reuseby the Java Virtual Machine.When control returns from the method call, the Java Virtual Machinehas made a best effort to reclaim space from all unused objects.There is no guarantee that this effort will recycle any particularnumber of unused objects, reclaim any particular amount of space, orcomplete at any particular time, if at all, before the method returns or ever.There is also no guarantee that this effort will determinethe change of reachability in any particular number of objects,or that any particular number of Referenceobjects will be cleared and enqueued.

*/
