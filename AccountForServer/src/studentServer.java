import java.net.MalformedURLException;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
public class studentServer {
	private static String user = "root";  
    private static String pass = "admin";  
    private static String className ="com.mysql.jdbc.Driver";  
    private static String url = "//localhost:3307/BEng_Assign";  
    private static Connection conn;  
    private static java.sql.Statement state; 
  
    	
	public studentServer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String [] args)throws RemoteException, ClassNotFoundException, SQLException, MalformedURLException
	{
		
	
	
			
			
		
          /* Class.forName(className);  
             conn = DriverManager.getConnection(url,user,pass);  
             state =conn.createStatement(); */
		studentImpl server=  new studentImpl("lei","jiujiang","mian");
		
             Naming.rebind(url,server);
             System.out.println("服务已经启动。。");
            /* String sql  = "select name from student ;";  
     		String sqll  = "select city from student ;"; 
     		String sqlll="select town from student ;";
     	       String name[]=null;
     	       String city[]=null;
     	       String town[]=null;
     	       int i;
     	        try {  
     	            ResultSet rsname = state.executeQuery(sql);
     	         
     	            ResultSet rscity = state.executeQuery(sqll); 
     	        
     	           ResultSet rstown = state.executeQuery(sqlll);
     	         
     	           
     	            	 for( i =0;i<=6;i++)
     	            {    rsname.next();
     	                 name[i]= rsname.getString(i);
     	                 System.out.print(name[i]);
     	                 city[i]=rscity.getString(i);
     	                 town[i]=rstown.getString(i);
     	                // list[i]=new customerImpl(name[i],city[i],town[i]);
     	               
     	            }  
     	            rsname.close();
     	            rscity.close();
     	            rstown.close();
     	            
     	              
     	        
     	        	
     	   
               
        }catch (SQLException e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        }  catch (MalformedURLException e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        }
		
	        }  finally{ System.out.println( "finally") ;}  */
		
	
	}
	}
	
		
		
	


