
public class Stepper implements Prototype_stepper  {
	private Counter c;
	private int max;

	public Stepper(int i, int j) {
		// TODO Auto-generated constructor stub
		c=new Counter(i);
		max=j;
	}
	

	public boolean stepUp() {
		// TODO Auto-generated method stub
		int value=c.readValue();
		if(value<max){ c.increment();return true;}
		else return false;
		
	}


	public boolean stepDown() {
		// TODO Auto-generated method stub
		int value=c.readValue();
		if(value>0){c.decrement(); return true;}
		else return false;
	}


	public void printDetails() {
		// TODO Auto-generated method stub
		System.out.println("Stepper Details ");
		System.out.println("--------------- ");
		System.out.println("Value : " +c.readValue());
		
	}
	

}
