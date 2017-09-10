import java.rmi.*;
public interface student  extends Remote{
	public String getName()throws RemoteException;
	public String getAddress()throws RemoteException;
	
}
