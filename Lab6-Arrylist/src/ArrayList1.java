  
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
				    int res1=sum(new ArrayList(list));
				    System.out.println("Sum of all elements in list="+res1);
				    //find out how many even in list
				    int res2=countEven(new ArrayList(list));
				    System.out.println("Even elements in list="+res2);
				    //find out how many times the target occurs in list
				    int tar=Console.readInt("Enter target");
				    int res3=countTarget(new ArrayList(list),tar);
				    System.out.println("Els found in list="+res3);
				    
				    int tar2=Console.readInt("Enter target");
				    boolean res4=searchTarget(new ArrayList(list),tar2);
				    System.out.println("search target in list="+res4);
				    
				    
				    boolean res5=containsEvenNo(new ArrayList(list));
				    System.out.println("cotains even num in list="+res5);
				    
				    boolean res6=containsAllEvenNo(new ArrayList(list));
				    System.out.println("cotains even num in list="+res6);
				    
				    
				    
    }

	
  }