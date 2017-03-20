public class SingletonTest{
    public static void main(String[] args)
    {
            // Server s1 = new Server();
             //Server s2 = new Server();
        Server s1 = Server.getInstance();
        Server s2 = Server.getInstance();

             s1.print_details();
             s2.print_details();
    }
}
