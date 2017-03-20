import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class Number2 extends Thread{
	public int value=0;
	public Number2(int nm){
		        value=nm;
	}     
      public void run(){
		for(int i=0; i<10;i++)
			 { System.out.println("Number"+": "+value);
			  value++;  
			 try{ Thread.sleep(1000);}
		         catch(Exception e){}
		       }
      }
}  
class Letter2 implements Runnable{
	public char value='A';
	public Letter2(char nm){
		        value=nm;
	}     
      public void run(){
		for(int i=0; i<10;i++)
			 { System.out.println("Letter"+": "+value);
			   value++;
			   try{ Thread.sleep(1000);}
		         catch(Exception e){}
		       }
      }
}

public class Q1RevSkelCon
{
public static void main(String[] args)
    {
	        ExecutorService threadExecutor;
	        threadExecutor=Executors.newCachedThreadPool();
            Number1 d1=new Number1(1);
            Letter1 d2=new Letter1('A');
            threadExecutor.execute(d1);
            threadExecutor.execute(d2);
           
      }
}
