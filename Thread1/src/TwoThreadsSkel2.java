import java.util.concurrent.*;

class Base{
	 protected String Name;
     public Base(String str) {
             	    Name=str;
                  }
}


class SimpleThread extends Base implements Runnable  {
	       
             public SimpleThread(String str) {
             	    super(str);
                  }
             public void run() {
                 for (int i = 0; i < 10; i++) 
                     {   System.out.println(i + " " + Name);
                           try {
                                    Thread.sleep((int)(Math.random() * 1000));
                               } 
                           catch (InterruptedException e) {}
                      }
                 System.out.println("DONE! " + Name);
                 }
}

public  class TwoThreadsSkel2 {

public static void main(String[] args)
    { 
	 ExecutorService threadExecutor;
	 threadExecutor=Executors.newCachedThreadPool();
	 
       SimpleThread s1=new SimpleThread( "Jamaica" );
       SimpleThread s2=new SimpleThread( "Fiji" );
       threadExecutor.execute(s1);
       threadExecutor.execute(s2);
      
      }
}

