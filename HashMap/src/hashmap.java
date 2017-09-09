import java.util.*;
public class hashmap {
	
	public static void main(String args[]) {
		
		HashMap<Integer, String> hash = new HashMap<Integer, String>();
		
		/* adding new elements to hashmap*/
		hash.put(12, "Charlie12");
		hash.put(1, "Charlie1");
		hash.put(2, "Charlie2");
		hash.put(23, "Charlie23");
		
		/* display hashmap*/
		display(hash);
		
		/* remove an element*/
		hash.remove(23);
		
		/* display hashmap after remove*/
		System.out.println("Hashmap after removal");
		display(hash);
		
		/* get value of key with 12*/
		System.out.println("The value of key =12 is :"+ hash.get(12));
		
		
	}
/* display method to show all elements of the hashmap*/
	private static void display(HashMap<Integer, String> hash) {
		// TODO Auto-generated method stub
		Set set = hash.entrySet();
		Iterator iterator = set.iterator();
		while(iterator.hasNext()) {
			Map.Entry me=(Map.Entry)iterator.next();
			System.out.println("The key is :"+me.getKey()+" & Value is :"+me.getValue());
		}
		
	}

}
