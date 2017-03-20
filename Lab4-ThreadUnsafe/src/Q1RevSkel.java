
class Number extends Thread{
	public int value=0;
	public Number(int nm){
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
class Letter extends Thread{
	public char value='A';
	public Letter(char nm){
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

public class Q1RevSkel
{
public static void main(String[] args)
    {
            Number d1=new Number(1);
            Letter d2=new Letter('A');
            d1.start();
            d2.start();
      }
}
