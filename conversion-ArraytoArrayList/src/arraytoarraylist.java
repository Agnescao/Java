import java.util.*;
public class arraytoarraylist {
	public static void main(String args[]) {
		
		
		String array[] = {"I","won't","go","back","I"}; 
		ArrayList<String> arr = new ArrayList<String>(Arrays.asList(array));
		
		//Collections.addAll(arr, array);
		
		/* remove duplicate element */
		for(int i = 0; i<arr.size()/2+1; i++ ) {
			
			String e = arr.get(i);
			
			for(int j = i+1; j<arr.size();j++) {
				
				if (e.equals(arr.get(j))) {
					arr.remove(j);
				}
			}
			
		}
		for(String a : arr) {
			
			System.out.println(a);
		}
	}

}
