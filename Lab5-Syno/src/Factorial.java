  import java.util.*;


  public class Factorial
  {

    static int fact(int n){              // to be completed
    	   if(n==0)return 1;
    	   else return n*fact(n-1);
    	   
    	   }
    	                       
    static int power(int b,int p){              // to be completed
 	  if(p==0)return 1;
 	  else return  b*power(b,p-1);
 	   }                      
    public static void main( String[] args )
     { 
				    int n=Console.readInt("Enter Value:");
				    int p=Console.readInt("Enter power:");
				    int res1=fact(n);
				    int res2=power(n,p);
				    System.out.println("Fact "+ n + "="+res1);
				    System.out.println("Power "+ p + "="+res2);
    }
  }