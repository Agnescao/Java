package cu;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Q1b 
{
    public static void main(String[] args)
    {
    	     ExecutorService threadExecutor;
    	    
    	     threadExecutor=Executors.newCachedThreadPool();
             Incrementer  i = new Incrementer();  
             threadExecutor.execute(i);
             Decrementer d = new Decrementer();                  
             threadExecutor.execute(d);
    }
}


/**************************************/


class Incrementer implements Runnable{
     public void run()
    {     
    	 
    	 for (int i = 1; i <= 6; i++)
                  {
                                 System.out.println("Incrementer: "+ i);
                                 try{ Thread.sleep(1000);}
                                 catch(Exception e){}
                      }
    }}


/**************************************/

class Decrementer extends Thread{
      public void run()
      {             for (int i = 6; i >0; i--)
                    {
                                  System.out.println("Decrementer: "+ i);
                                  try{ Thread.sleep(1000);}
                                  catch(Exception e){}
        }
    }
}

