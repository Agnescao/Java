package Tripe;
class Triple<T extends Number & Comparable <T>>  {
	T value1;
	T value2;
	T value3;

	public Triple(T v1, T v2, T v3){
		value1 = v1;
		value2 = v2;
		value3 = v3;
	}

	public T readValue1() {
		return value1;
	}
	public void setValue1(T val) {
	         value1=val;
	}

	public T addValues() {
		Number res1=0;

		 res1=  value1.doubleValue() + value2.doubleValue() + value3.doubleValue();
	    return  (T) res1;
		}

	public T largest(){
		T res=value1;
		if(value2.compareTo( res)>0) res=value2;
			if(value3.compareTo(res)>0) res=value3;
			return (T) res;}

}
public class TripleTestGenQ3 {
	public static void main(String [] args){

			Triple<Double> t = new Triple<Double>(8.2,10.0,7.6);
			System.out.println("Original Value1="+t.readValue1());
			System.out.println("Adding 3 Values="+t.addValues());
			System.out.println("Largest= "+t.largest());
		        t.setValue1(13.7);
			System.out.println("Largest= "+t.largest());
			
			Triple<Integer> t2 = new Triple<Integer>(8,10,7);
			System.out.println("Original Value1="+t2.readValue1());
			System.out.println("Adding 3 Values="+t2.addValues());
			System.out.println("Largest= "+t2.largest());
		        t2.setValue1(13);
			System.out.println("Largest= "+t2.largest());
	}
}
