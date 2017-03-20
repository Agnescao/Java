package Binary;

public class Pair {

	private int value1;
	private int value2;
	public Pair(int v1,int v2)
	{
		value1=v1;value2=v2;
		}
	public void  setV1(int v)
	{
		  value1=v;
	}
	public void  setV2(int v)
	{
		  value2=v;
	}
	public int  readV1()
	{
		return  value1;
	}

	public int  readV2()
	{
		return  value2;
	}

}
