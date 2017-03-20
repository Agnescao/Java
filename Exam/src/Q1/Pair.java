package Q1;
public class Pair<T extends Number & Comparable <T>> {
	private T value1;
	private T value2;
	
	public Pair(T v1,T v2){
		this.value1=v1;
		this.value2=v2;
	}
	
	public void setValue1(T v){
	    this.value1=v;}

	public void setValue2(T v){
	    this.value2=v;}
	
	public  void printValues(){
              System.out.println("\nValues:");
              System.out.println("=======");
              System.out.println("Value1: "+ value1);
              System.out.println("Value2: "+ value2);
              }
       public  boolean  search(T  t){
                if ( (t.compareTo(value1)==0) || (t.compareTo(value2)==0))
                        return  true;
               // if ( (t.equals(value1)) || (t.equals(value2)))
                else    return false;}
}
