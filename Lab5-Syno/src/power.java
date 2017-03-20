  import java.util.*;


  public class power
  {

    static int fact(int n){              // to be completed
    	   int res=1;
    	   for(int i=1;i<=n;i++){
    		   res*= i;
    	   }
    	   return   res;
    	   }
    	                       
  		                      
    public static void main( String[] args )
     { 
				    int n=Console.readInt("Enter Value:");
				    int res1=fact(n);
				    System.out.println("Fact "+ n + "="+res1);
    }
  }