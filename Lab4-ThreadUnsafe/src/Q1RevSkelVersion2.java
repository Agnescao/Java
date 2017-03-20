
class Number1 extends Thread{
	public int value=0;
	public Number1(int nm){
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
class Letter1 implements Runnable{
	public char value='A';
	public Letter1(char nm){
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

public class Q1RevSkelVersion2
{
public static void main(String[] args)
    {
            Number1 d1=new Number1(1);
            Letter1 d2=new Letter1('A');
            d1.start();
            Thread t2=new Thread(d2);
            t2.start();
      }
}
