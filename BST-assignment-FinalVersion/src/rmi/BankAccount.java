package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface BankAccount extends Remote {

	String getAdmin() throws RemoteException;

}
