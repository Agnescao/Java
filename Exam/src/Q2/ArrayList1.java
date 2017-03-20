package Q2;
import java.util.*;


  public class ArrayList1<T extends Number & Comparable <T>>
  {

    static int sum(ArrayList list){ 
    	if(list.size()==0)return 0;
    	else
    	{
    		int first=(Integer)list.get(0);
    		list.remove(0);
    		return first+sum(list);
    		
    		
    		}
    	       
    }
    	   
    	  
    	                       
  		                      
    public static void main( String[] args )
     { 
				    ArrayList<Integer> list = new ArrayList();
				    Collections.addAll(list , 4,5,3,2,3,1,3);
				    int res1=sum(new ArrayList(list));
				    System.out.println("Sum of all elements in list="+res1);
    }
  }