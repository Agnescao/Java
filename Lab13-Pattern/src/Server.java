class Server 
{       private String ipnumber="172.16.254.4";
         private String name="Gamma";
         private String location="Athlone";
         private int sequence=0;
         private static int count=0;
         private static Server  single;
         private static boolean created = false;

    public Server()
    
    {   
    	single=this; created=true;
    	count++;
        sequence=count;
    }
    public static Server getInstance(){
        if (!created){
          single=new Server();
          }
        return single;
        }

    public String readNumber(){return ipnumber;}
    public void print_details()
    {
          System.out.println("Name:= " + name);
          System.out.println("ipNumber:= " + ipnumber);
		   System.out.println ("Location:= " + location);
		   System.out.println ("Sequence:= "+sequence);
		   System.out.println ();
    }
}

