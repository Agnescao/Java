package rmiClient;
import java.io.Serializable;


public class Address implements Serializable {
	private String city; 
	private String town;
	
	public String toString(){
 		return " "+city+":"+town;
 	}
	public Address(String city, String town) {
		super();
		this.city = city;
		this.town = town;
	}
	

}
