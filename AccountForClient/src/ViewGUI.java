import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;
import java.rmi.Naming;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class ViewGUI {

	JFrame frame;
	private Connection con = null;
	private Statement stmt = null;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblName;
	private JLabel lblNewLabel;
	private int index=0;

	
	private JButton btnNewButton;
	private JButton btnFirst;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewGUI window = new ViewGUI();
					window.frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	
	}

	/**
	 * Create the application.
	 */
	public ViewGUI() throws Exception{
		initialize();
		
       String url="rmi:///";
        // String url = "jdbc:mysql://localhost:3307/BEng_Assign"; 
		//for(int i=0; i<6;i++)
	           student list = (student)Naming.lookup(url);
	    textField.setText(list.getName());
        textField_1.setText(list.getAddress());
        
        btnNewButton = new JButton("Next");
        btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 13));
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		 if (index<5)index++;
	 	         try{ textField.setText(list.getName());
	 	              textField_1.setText(list.getAddress());}
	 	         catch(Exception e2){System.out.println(e2.getMessage());}
				
        	}
        });
        btnNewButton.setBounds(21, 164, 116, 50);
        frame.getContentPane().add(btnNewButton);
        
        btnFirst = new JButton("First");
        btnFirst.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		 index=0;
	 	         try{ textField.setText(list.getName());
	 	        // textField_1.setText(list.getAddress());
	 	         }
	 	         catch(Exception e2){System.out.println(e2.getMessage());}
				
        	}
        });
        btnFirst.setFont(new Font("Arial Black", Font.BOLD, 13));
        btnFirst.setBounds(160, 164, 116, 50);
        frame.getContentPane().add(btnFirst);
        
        
		

		//setEnabled(true);
		
		initiate_db_conn();
	}
	public void initiate_db_conn() {
		try {
			// Load the JConnector Driver
			Class.forName("com.mysql.jdbc.Driver");
			// Specify the DB Name
			String url = "jdbc:mysql://localhost:3307/BEng_Assign";
			// Connect to DB using DB URL, Username and password
			con = DriverManager.getConnection(url, "root", "admin");
			// Create a generic statement which is passed to the
			// TestInternalFrame1
			stmt = con.createStatement();
		} catch (Exception e) {
			System.out.println("Error: Failed to connect to database\n"
					+ e.getMessage());
		}
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblWelcomeToView = new JLabel("Welcome to View page");
		lblWelcomeToView.setFont(new Font("ËÎÌו", Font.BOLD, 16));
		lblWelcomeToView.setBounds(10, 10, 192, 24);
		frame.getContentPane().add(lblWelcomeToView);
		
		textField = new JTextField();
		textField.setBounds(163, 44, 136, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(163, 75, 136, 21);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		lblName = new JLabel("NAME");
		lblName.setBounds(48, 38, 43, 32);
		frame.getContentPane().add(lblName);
		
		lblNewLabel = new JLabel("Address");
		lblNewLabel.setBounds(37, 71, 105, 24);
		frame.getContentPane().add(lblNewLabel);
	}
}
