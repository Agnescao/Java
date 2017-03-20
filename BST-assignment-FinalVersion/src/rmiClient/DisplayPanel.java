package rmiClient;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;
import java.util.Vector;

import javax.swing.border.LineBorder;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

import rmiServer.BSTree;
import rmiServer.Node;




public class DisplayPanel extends JFrame{

	//private JFrame frame;
	private JTable table_1;
	public BSTree tree = new BSTree();
	public Node t;
	 Vector<String> row= new Vector<String>();
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//				//	DisplayPanel window = new DisplayPanel(t);
//					window.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public DisplayPanel(Node node) {
		t=node;
		initialize();
		

	}
	public int getRowCount() {
		
		// TODO Auto-generated method stub
		return tree.countNodes(tree.root) ;
	}

	/*public DisplayPanel(Node root) {
		// TODO Auto-generated constructor stub
		initialize(root);
	}*/
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//frame = new JFrame();
		this.setBounds(100, 100, 560, 376);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);
		
		JLabel lblCustomersData = new JLabel("Customers Data");
		lblCustomersData.setFont(new Font("ËÎÌו", Font.BOLD, 15));
		lblCustomersData.setBounds(126, 10, 180, 15);
		this.getContentPane().add(lblCustomersData);
		
		//table_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		//table_1.setBackground(Color.WHITE);
		
		/* for(int i=0;i<5;i++){
				for(int j=0;j<getRowCount();j++){
					   
					    String id=""+t.key;
					    row.addElement(id);
					    row.addElement(t.name);
					    String balance=""+t.balance;
					    row.addElement(balance);
					    row.addElement(t.m_address.getTown());
					    row.addElement(t.m_address.getCity());
					    Vector<Vector> colData = new Vector<Vector>();
						colData.addElement(row);
						
				}
		
	  
	}
		 Vector<String> columnNames = new Vector<String>();
		    columnNames.addElement("ID");
		    columnNames.addElement("Name");
		    columnNames.addElement("Balance");
		    columnNames.addElement("Town");
		    columnNames.addElement("City");
		    System.out.println("hh");*/
		AbstractTableModel tableModel=new TableModel();
		    ((TableModel) tableModel).setModel(t);
		    table_1 = new JTable(tableModel);
		  //  table_1.setModel(new TableModel(){ tableModel.table; });
		   
		    table_1.show();
		    table_1.setBorder(new LineBorder(new Color(0, 0, 0)));
			table_1.setBackground(Color.WHITE);
			table_1.setBounds(34, 49, 473, 243);
			this.getContentPane().add(table_1);
			
	}
	
	   // DefaultTableModel tableModel = (DefaultTableModel) table_1.getModel();

	 
	
}


