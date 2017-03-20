




public class Counter {

	private int value;

	public Counter(int v)
	{
		value=v;}


	public void increment()
	{
		value++;
	}

	public void decrement()
	{
		value--;
	}

	public int readValue(){
		return   value;
	}
}
