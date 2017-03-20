package hashset;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Stack;
import java.util.TreeSet;


  public class HashSet1
  {	
  
	  static boolean search(HashSet set, Integer i){
		  boolean res=false;
		  Iterator iter =set.iterator();

		  while(iter.hasNext())
		  {     Integer element =(Integer)iter.next();
		         if (i.equals(element)) res=true;
		  }
		  return res;

		  }


	  static void print(HashSet set){
		  Iterator i =set.iterator();
		  System.out.print("{");

		  if (i.hasNext())System.out.print( ""+i.next() );
		  while(i.hasNext())
		  {       int element =(Integer)i.next();
		           System.out.print( ","+element );
		  }
		  System.out.println("}");
		  }


   public static void main( String[] args )
    {
HashSet<Integer> set = new HashSet();
Collections.addAll(set , 4,5,3,2,3,1,3);


System.out.println( set );
boolean res1=search(set,3);
System.out.println("Search for 3="+res1);
print(set);

Stack<Integer> set2 = new Stack();
Collections.addAll(set2 , 4,5,3,2,3,1,3);

System.out.println( set2 );
/*boolean res2=search(set2,3);
System.out.println("Search for 3="+res1);*/
print(set2);

int res3=addOdd(set2);
System.out.println("Add odd="+res3);

boolean res4=AllOdd(set);
System.out.println("All Odd "+res4);

    }


private static boolean AllOdd(HashSet<Integer> set) {
	Iterator i =set.iterator();
	boolean flag=true;
	 while(i.hasNext())
		 
	  {     
		 
		 
		 int element =(Integer)i.next();
		 if(element%2==1){ flag=false;}
	           
	  }
	
	
	return flag;
}


private static int addOdd(Stack<Integer> set2) {
	Iterator i =set2.iterator();
	int sum=0;
	 while(i.hasNext())
		 
	  {     
		 
		 
		 int element =(Integer)i.next();
		 if(element%2==1){ sum=sum+element;}
	           
	  }
	
	return sum;
}


private static void print(Stack<Integer> set2) {
	Iterator i =set2.iterator();
	  System.out.print("{");

	  if (i.hasNext())System.out.print( ""+i.next() );
	  while(i.hasNext())
	  {       int element =(Integer)i.next();
	           System.out.print( ","+element );
	  }
	  System.out.println("}");
	
}


/*private static boolean search(Stack<Integer> set2, int i) {
	boolean res=false;
	  Iterator iter =set2.iterator();

	  while(iter.hasNext())
	  {     Integer element =(Integer)iter.next();
	         if (i.equals(element)) res=true;
	  }
	  return res;
}*/
  }
