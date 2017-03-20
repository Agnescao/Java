

class Join3 extends Thread {
	static int  counter=0,delay=1000;

	
	public void run(){
		    try {Thread.sleep(delay);}catch(Exception e){}
		    counter++;
		    System.out.println("Value="+counter);
		   
	}


    public static void main( String[] args ) throws InterruptedException
          {         Join3 t1=new Join3();
                    Join3 t2=new Join3();
				    t1.start();
				   t1.join();
				    delay=0;
				    t2.start();
				    t2.join();
				    System.out.println("Value="+counter);
				    System.out.println("Completed");
          }

}
