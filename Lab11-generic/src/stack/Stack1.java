package stack;

import java.util.Collections;
import java.util.Stack;
import java.util.Iterator;
import java.util.TreeSet;

import Tripe.Console;


  public class Stack1
  {	
  
	  static boolean search(Stack set, Integer i){
		  boolean res=false;
		  Iterator iter =set.iterator();

		  while(iter.hasNext())
		  {     Integer element =(Integer)iter.next();
		         if (i.equals(element)) res=true;
		  }
		  return res;

		  }


	  static void print(Stack set){
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
Stack<Integer> set = new Stack();
Collections.addAll(set , 4,5,3,2,3,1,3);

System.out.println( set );
boolean res1=search(set,3);
System.out.println("Search for 3="+res1);
print(set);

int tar=Console.readInt("Enter a number: ");
int res=countGreat(set,tar);
System.out.println("the number greater than "+tar+" is "+res);
int tar2=Console.readInt("Enter a number which if it is greater than all element : ");
boolean res2=AllLessThan(set,tar);
System.out.println("the number greater than "+tar2+" is "+res2);
    }


private static boolean AllLessThan(Stack<Integer> set, int tar) {
	 Iterator i =set.iterator();
	 boolean res=false;
	  while(i.hasNext())
	  {       int element =(Integer)i.next();
	           if(element<=tar){res=true;}
	  }
	return res;
}


private static int countGreat(Stack<Integer> set, int tar) {
	 Iterator i =set.iterator();
	 int count=0;
	  while(i.hasNext())
	  {       int element =(Integer)i.next();
	           if(element>tar){count++;}
	  }
	return count;
}
  }
