package revetion;

public class Task221123 {

	public static void main(String[] args) {
		
		         
		        int b[] = {5,4,3,9,2,1};

		        int len = b.length;
		        
		        boolean ascending = true;
		        boolean descending = true;

		        if(ascending(b,len)!=0){
		           ascending=true;
		        }
		         else{
		           ascending=false;
		        }
		        
		          if(descending(b,len)){
		           descending=true;
		        }
		        else{
		           descending=false;
		        }
		        
		        if(ascending == true || descending == true){
		            System.out.println("its sorted");
		        }
		        else{
		            System.out.println("its not sorted ");
		        }
		    }
	
	
	
	
		    static int ascending(int a[],int n) {
		        if(n==0 ||  n==1){
		            return 1;
		        }
		            if(a[n-1]<a[n-2]){
		                return 0;
		            }
		          return ascending(a,n-1);
		        }
		    
		    
		    
		    
		        static boolean descending(int a[],int n) {
		            for (int i =0; i<n-1;i++){
		                if(a[i] <a[i+1]){
		                    return false;
		                }
		            }
		                return true;
		        }
		    }
		        
		        
		        
		        
		    
		
		
		
		
		
		
		
		
		
		