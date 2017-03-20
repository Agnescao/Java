package rmiClient;

import rmiServer.Node;
import rmiServer.BSTree;




import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Font;

import javax.swing.JButton;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import rmiServer.BSTree;

public class ClientPanel {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClientPanel window = new ClientPanel();

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public ClientPanel() {
		initialize();
		this.frame.setVisible(true);
		tree.insert(1, "J.Smith", 2000, "Athlone", "Westmeath");
		tree.insert(2, "T.Black", 2400, "Athlone", "Westmeath");
		tree.insert(3, "M.Gray", 3000, "Athlone", "Westmeath");
	}

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JButton btnSearchName;
	private JTextField SearchName;
	private JButton btnNewButton_1;
	
	public BSTree tree = new BSTree();
	void traverse(Node t, String nm) {
		// TODO Auto-generated method stub
		
			if (t.left != null)
			traverse(t.left, nm);
			visit(t, nm);
			if (t.right != null)
			traverse(t.right, nm);
		
	}

	void visit(Node t, String nm) {
		// TODO Auto-generated method stub
		
		if (nm.equals(t.name)) {
			textField.setText("" + t.readKey());
			textField_1.setText("" + nm);
			textField_2.setText("" + t.getBalance());
			textField_3.setText("" + t.m_address.getTown());
			textField_4.setText("" + t.m_address.getCity());

		} else {
			textField.setText("Not Found !");
			textField_1.setText("Not Found !");
			textField_2.setText("Not Found !");
			textField_3.setText("Not Found !");
			textField_4.setText("Not Found !");

		}
	}

	/**
	 * Launch the application.
	 */


	/**
	 * Create the application.
	 */
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame();
		frame.setFont(new Font("Dialog", Font.PLAIN, 15));
		frame.getContentPane().setFont(new Font("宋体", Font.BOLD, 25));
		frame.setBounds(100, 100, 386, 452);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblId = new JLabel("ID:");
		lblId.setFont(new Font("宋体", Font.BOLD, 15));
		lblId.setBounds(41, 35, 54, 15);
		frame.getContentPane().add(lblId);

		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("宋体", Font.BOLD, 15));
		lblName.setBounds(41, 60, 54, 15);
		frame.getContentPane().add(lblName);

		JLabel lblBlan = new JLabel("Balance:");
		lblBlan.setFont(new Font("宋体", Font.BOLD, 15));
		lblBlan.setBounds(41, 85, 84, 15);
		frame.getContentPane().add(lblBlan);

		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setFont(new Font("宋体", Font.BOLD, 15));
		lblAddress.setBounds(41, 110, 84, 15);
		frame.getContentPane().add(lblAddress);

		JLabel lblTown = new JLabel("Town");
		lblTown.setFont(new Font("宋体", Font.BOLD, 15));
		lblTown.setBounds(259, 127, 54, 15);
		frame.getContentPane().add(lblTown);

		JLabel lblCity = new JLabel("City");
		lblCity.setFont(new Font("宋体", Font.BOLD, 15));
		lblCity.setBounds(259, 152, 54, 15);
		frame.getContentPane().add(lblCity);

		textField = new JTextField();
		textField.setBounds(149, 32, 66, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent arg0) {

			}
		});
		textField_1.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent arg0) {

			}
		});
		textField_1.setBounds(149, 57, 66, 21);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(149, 82, 66, 21);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setBounds(149, 124, 66, 21);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setBounds(149, 149, 66, 21);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);

		SearchName = new JTextField();
		SearchName.setBounds(41, 225, 124, 21);
		frame.getContentPane().add(SearchName);
		SearchName.setColumns(10);
		SearchName.setVisible(false);
		// insert new customer button
		JButton btnNewButton = new JButton("Insert new customer");
		btnNewButton.setFont(new Font("宋体", Font.BOLD, 14));
		btnNewButton.setBounds(41, 192, 252, 23);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int id = Integer.parseInt(textField.getText());
				String name = textField_1.getText();
				int balance = Integer.parseInt(textField_2.getText());
				String town = textField_3.getText();
				String city = textField_4.getText();
				
				tree.insert(id, name, balance, town, city);
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				
				tree.inOrderTraverseTree(tree.root);

			}
		});

		// button for searching customer by name

		btnSearchName = new JButton("Search Name");
		btnSearchName.setFont(new Font("宋体", Font.BOLD, 14));
		btnSearchName.setBounds(41, 225, 252, 23);
		frame.getContentPane().add(btnSearchName);
		btnSearchName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnSearchName.setVisible(false);
				SearchName.setVisible(true);
				btnNewButton_1.setVisible(true);

			}

		});

		btnNewButton_1 = new JButton("Search");
		btnNewButton_1.setBounds(169, 225, 124, 23);
		frame.getContentPane().add(btnNewButton_1);

		btnNewButton_1.setVisible(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Node t=tree.root;
				String name=SearchName.getText();
	           traverse(t, name);
	

			}

		});

		JButton btnSearchBalance = new JButton("Search By Id");
		btnSearchBalance.setFont(new Font("宋体", Font.BOLD, 14));
		btnSearchBalance.setBounds(41, 267, 252, 23);
		frame.getContentPane().add(btnSearchBalance);
		btnSearchBalance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 int id=Integer.parseInt(textField.getText());
				Node n=tree.findNodeByID(id);
				if(n!=null){
				textField.setText(""+id);
				textField_1.setText(""+n.name);
				textField_2.setText(""+n.balance);
				textField_3.setText(""+n.m_address.getTown());
				textField_4.setText(""+n.m_address.getCity());
				}else{
					textField_1.setText("Not Found !");
					textField_2.setText("Not Found !");
					textField_3.setText("Not Found !");
					textField_4.setText("Not Found !");
				}
				
			}

		});

		JButton btnDeleteCutomer = new JButton("Delete customer");
		btnDeleteCutomer.setFont(new Font("宋体", Font.BOLD, 14));
		btnDeleteCutomer.setBounds(41, 300, 252, 23);
		frame.getContentPane().add(btnDeleteCutomer);
		btnDeleteCutomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			    int id=Integer.parseInt(textField.getText());
				boolean res=tree.remove(id);
				if(res){
					System.out.println("delete successfully !");
					tree.inOrderTraverseTree(tree.root);
					
				}else System.out.println("delete failed !");
			}});

			

		JButton btnDisplayAllCustomers = new JButton("Display all customers");
		btnDisplayAllCustomers.setFont(new Font("宋体", Font.BOLD, 14));
		btnDisplayAllCustomers.setBounds(41, 337, 252, 23);
		frame.getContentPane().add(btnDisplayAllCustomers);
		btnDisplayAllCustomers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//tree.inOrderTraverseTree(tree.root);
				DisplayPanel window=new DisplayPanel(tree.root);
				window.setVisible(true);
				

			}

		});

	}

}
