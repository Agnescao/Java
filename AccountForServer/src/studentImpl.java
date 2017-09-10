import java.rmi.*;
import java.rmi.server.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

  class studentImpl extends UnicastRemoteObject implements student{
       
		private String name;
         private Address address;
        
        
	protected studentImpl(String name,String city, String town) throws RemoteException {
		 
		
		this.name=name;
	    address =new  Address(city, town);
		// TODO Auto-generated constructor stub
	}
	public String getName(){
		try{
			 Connection con;
			 Class.forName("com.mysql.jdbc.Driver");
			 con = DriverManager
	              .getConnection("jdbc:mysql://localhost:3307/BEng_Assign",
	                              "root", "admin");
			 PreparedStatement pstmt = null;
			 
			 ResultSet rs = pstmt.executeQuery("select name from customer");
			 
	         if (rs.next()) {
	             String name = rs.getString(1);
	            System.out.print(name);
	             //Sets Records in TextFields.
	             
	          
	         }else {
	             JOptionPane.showMessageDialog(null, "Name not Found");
	         }
			
			
			}catch (Exception d) {

	            System.out.println("ERROR  " + d);}
		
		return name;
		}
	
		
        
		
		
		
		
	public String getAddress(){return address.toString();}
	
	

}
