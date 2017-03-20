package rmiServer;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import javax.swing.JFrame;

class ServerMain extends UnicastRemoteObject {
	protected ServerMain() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		JFrame f=new JFrame("Bank Server");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		try {
			  System.out.println("Starting...");
			  BankAccountImpl account1 = new BankAccountImpl("Alisa");
		      // Create a second object that provides the BankAccount service
		      BankAccountImpl account2 = new BankAccountImpl("Darth ");
			  Registry reg = LocateRegistry.createRegistry(1099);
		      reg.rebind("Alisa", account1);
		      reg.rebind("Darth", account2); 
		      System.out.println("Server Started");
			

			
		} catch (Exception e) {
			System.out.println("Error:" + e);
		}
	}
}
