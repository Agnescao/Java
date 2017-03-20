
class Counter {
	private int value = 0;
	private static Counter  single;
    private static boolean created = false;

	private Counter() {
		single=this;
		created=true;
		value = 0;
	}

	public int readValue() {
		return value;
	}

	public void stepValue() {
		value++;
	}
	public static Counter getInstance(){
		if(!created){
			single=new Counter();
		}
		return single;
	}
}

public class TestCounter {
	public static void main(String[] args) {
		Counter c1 = Counter.getInstance();
		Counter c2 = Counter.getInstance();
		c1.stepValue();
		System.out.println("Value= :" + c1.readValue());
		c2.stepValue();
		System.out.println("Value= :" + c2.readValue());
	}
}
