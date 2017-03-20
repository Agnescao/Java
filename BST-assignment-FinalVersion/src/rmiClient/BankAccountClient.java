package rmiClient;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import rmi.BankAccount;

public class BankAccountClient extends JFrame {

	
	public BankAccountClient() {
		super("Bank Account");
		JPanel contentPanel = new JPanel();
		setContentPane(contentPanel);
		contentPanel.add(new JLabel("Enter Adminstrator name: "));
		contentPanel.add(m_name);
		contentPanel.add(m_button);
		m_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				findAccount();
			}
		});
		pack();
	}

	private void findAccount() {
		String url = "rmi:///";
		String name = m_name.getText().trim();
		System.err.println(name);
		BankAccount account;
		try {

			account = (BankAccount) Naming.lookup(url + name);

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
		/*JOptionPane.showOptionDialog(this, new BankAccountClientPanel(),
				"Bank Account Client Display", JOptionPane.DEFAULT_OPTION,
				JOptionPane.PLAIN_MESSAGE, null, null, null);*/
		ClientPanel window = new ClientPanel();
	}

	// //// Private instance data //////
	private JTextField m_name = new JTextField(10);
	private JButton m_button = new JButton("Find Account");


}
