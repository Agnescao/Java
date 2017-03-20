package container;
class Container<T extends Number & Comparable <T>>{
	 T counter;
	 T max;
	public Container(T c,T m){
		counter=c;
		max=m;
	}

	public T readCounter(){
		return counter;
	}
	public T readMax(){
		return max;
	}
	
	
	public void updateMax(T m){
		max=m;
	}
	public void updateCounter(T c){
		counter=c;
	}
	public T  diffCounterMax(){
		Number res=0;
		res=  max.doubleValue()  -counter.doubleValue();
		return (T) res;
	}
	
	public boolean counterGreaterThan(T v){
		if(counter.compareTo(v)>0)  return  true;
		else             return  false;
	}
}

public class ContainerGenQ {
	public static void main(String args[]){
		
		Container<Integer> c1 = new Container(1,3);
		System.out.println("Initial Value of Counter= "+c1.readCounter());
		System.out.println("Initial Value of Max= "+c1.readMax());
		System.out.println("Initial Difference= "+c1.diffCounterMax());
		System.out.println("Greater than 2: "+c1.counterGreaterThan(2));
		System.out.println("Greater than 0: "+c1.counterGreaterThan(6));
		System.out.println();
		c1.updateCounter(3);
		c1.updateMax(7);
		
		System.out.println("New Value of Counter= "+c1.readCounter());
		System.out.println("New Value of Max= "+c1.readMax());
		System.out.println("New Difference= "+c1.diffCounterMax());
		System.out.println("Greater than 2: "+c1.counterGreaterThan(2));
		
		
		Container<Double> c = new Container(1.2,3.3);
		System.out.println("Initial Value of Counter= "+c.readCounter());
		System.out.println("Initial Value of Max= "+c.readMax());
		System.out.println("Initial Difference= "+c.diffCounterMax());
		System.out.println("Greater than 2: "+c.counterGreaterThan(2.5));
		System.out.println("Greater than 0: "+c.counterGreaterThan(6.2));
		System.out.println();
		c.updateCounter(3.3);
		c.updateMax(7.4);
		
		System.out.println("New Value of Counter= "+c.readCounter());
		System.out.println("New Value of Max= "+c.readMax());
		System.out.println("New Difference= "+c.diffCounterMax());
		System.out.println("Greater than 2: "+c.counterGreaterThan(2.5));
		

	}

}
