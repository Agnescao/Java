package rmiServer;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import rmi.BankAccount;

public class BankAccountImpl extends UnicastRemoteObject implements BankAccount {

	private String admin;

	public BankAccountImpl(String admin) throws RemoteException {

		this.admin = admin;
	}

	@Override
	public String getAdmin() throws RemoteException {
		// TODO Auto-generated method stub
		return admin;
	}

}
