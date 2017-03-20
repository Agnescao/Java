
class Counter <T extends Number & Comparable <T>>{
	private T value;

	public Counter(T v1){
		value = v1;
	}

	public T readValue(){
		return value;
	}

	public void updateValue(T v1){
		value = v1;
	}

	boolean equal(T v1){
		
		if(value.compareTo(v1)==0){
			return true;
		}else return false;
	}

	public void addValue(T v1){
		Number res =0;
		res = v1.doubleValue() + value.doubleValue();
		value = (T)res;
	}

	public void increment(){
		Number res =0;
		 res = value.doubleValue() + 1;
		value = (T)res;
	}
}

public class CounterGenQ {
	public static void main(String args[]){
		Counter<Double> ci = new Counter(2.2);
		System.out.println("Res="+ci.readValue());
		System.out.println("Equal="+ci.equal(4.3));
		ci.addValue(5.2);
		System.out.println("Res post add 5.2="+ci.readValue());
		ci.increment();
		System.out.println("Res post increment="+ci.readValue());


	}

}
