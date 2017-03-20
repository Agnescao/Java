package arraylist;
public class Test {
public static void main(String[] args){
	Number[] arr={5.5,6.3,3.3,8.3,1.3};
	ArrayTest at=new ArrayTest(arr);
	try{
	    Number res1=at.first();
	    System.out.println("First="+res1);
	    Number res2=at.max();
	    System.out.println("Max="+res2);
	    Number res3=at.sum();
	    System.out.println("Sum="+res3);
	    at.printAll();
	}
	catch(Exception e){
		System.out.println("Error");
	}     
}
}
