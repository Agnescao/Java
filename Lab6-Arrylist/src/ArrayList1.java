  
import java.util.*;


  public class ArrayList1
  {

    static int sum(ArrayList list){              // to be completed
    	   if (list.size()==0) return 0;
    	   else{   int first= (Integer)list.get(0);
    	           list.remove(0);
    	           return first+ sum(list);
    	        }
    	   
    	   }
    
    static int countEven(ArrayList list)  {
    	if (list.size()==0) return 0;
    	else{
    		
    		int first= (Integer)list.get(0);
    		list.remove(0);
    		if(first%2==0)
                return  1+countEven(list); 
    		else
    			return 0+countEven(list);
    	}
    	
    }   
    
    static int countTarget(ArrayList list, int tar) {
		// TODO Auto-generated method stub
    	if (list.size()==0) return 0;
    	else{
    		
    		int first= (Integer)list.get(0);
    		list.remove(0);
    		if(first==tar)
                return  1+countTarget(list,tar); 
    		else
    			return 0+countTarget(list,tar);
    	}
		
	}
  		   
    static boolean searchTarget(ArrayList list, int tar) {
		// TODO Auto-generated method stub
    	if (list.size()==0) return false;
    	else{
    		
    		int first= (Integer)list.get(0);
    		list.remove(0);
    		if(first==tar)
    			 return true; 
    		else
    			return searchTarget(list,tar);
    		
    		
    	}
		
	}
    static boolean containsEvenNo(ArrayList list) {
		// TODO Auto-generated method stub
    	if (list.size()==0) return false;
    	else{
    		
    		int first= (Integer)list.get(0);
    		list.remove(0);
    		if(first%2==0)
    			 return true; 
    		else
    			return containsEvenNo(list);
    		
    		
    	}
		
	}
    static boolean containsAllEvenNo(ArrayList list) {
		// TODO Auto-generated method stub
    	if (list.size()==0) return false;
    	else{
    		
    		int first= (Integer)list.get(0);
    		list.remove(0);
    		if(first%2==0)
    			 return true  ; 
    		else
    			return containsAllEvenNo(list);
    		
    		
    	}
		
	}
    
    public static void main( String[] args )
     { 
				    ArrayList<Integer> list = new ArrayList();
				    Collections.addAll(list , 4,4,4,4,4,4,4);
				    int result1=sum(new ArrayList(list));
				    System.out.println("Sum of all elements in list="+result1);
				    //find out how many even in list
				    int result2=countEven(new ArrayList(list));
				    System.out.println("Even elements in list="+result2);
				    //find out how many times the target occurs in list
				    int target1=Console.readInt("Enter target");
				    int result3=countTarget(new ArrayList(list),target1);
				    System.out.println("Els found in list="+result3);
				    
				    int target2=Console.readInt("Enter target");
				    boolean result4=searchTarget(new ArrayList(list),target2);
				    System.out.println("search target in list="+result4);
				    
				    
				    boolean res5=containsEvenNo(new ArrayList(list));
				    System.out.println("cotains even num in list="+res5);
				    
				    boolean res6=containsAllEvenNo(new ArrayList(list));
				    System.out.println("cotains even num in list="+res6);
				    
				    
				    
    }

	
  }