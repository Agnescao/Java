import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;


public class AddAccountGUI {

	JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
    private JButton btnA;
    private JTextField textField_2;
    private JTextField textField_3;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddAccountGUI window = new AddAccountGUI();
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
	public AddAccountGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblWelcomeToOpen = new JLabel("Welcome to open account interface");
		lblWelcomeToOpen.setFont(new Font("宋体", Font.BOLD, 16));
		lblWelcomeToOpen.setBounds(0, 0, 371, 30);
		frame.getContentPane().add(lblWelcomeToOpen);
		
		JLabel lblAccount = new JLabel("Name");
		lblAccount.setFont(new Font("宋体", Font.BOLD, 14));
		lblAccount.setBounds(37, 64, 91, 30);
		frame.getContentPane().add(lblAccount);
		
		JLabel lblBalance = new JLabel("city");
		lblBalance.setFont(new Font("宋体", Font.BOLD, 14));
		lblBalance.setBounds(37, 103, 91, 30);
		frame.getContentPane().add(lblBalance);
		
		textField = new JTextField(10);
		textField.setBounds(179, 69, 139, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(179, 108, 139, 21);
		frame.getContentPane().add(textField_1);
		
		
		JButton btnA = new JButton("Insert");
		btnA.setFont(new Font("宋体", Font.BOLD, 13));
		btnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*Class.forName("com.mysql.jdbc.Driver");
				// Specify the DB Name
				String url = "jdbc:mysql://localhost:3307/BEng_Assign";
				// Connect to DB using DB URL, Username and password
				con = DriverManager.getConnection(url, "root", "admin");
				// Create a generic statement which is passed to the
				// TestInternalFrame1
				stmt = con.createStatement();*/
				Object target = e.getSource();
				if(target== btnA )
				{
					try{
					
					Connection con;
					 Class.forName("com.mysql.jdbc.Driver");
					 con = DriverManager
                             .getConnection("jdbc:mysql://localhost:3307/BEng_Assign",
                                             "root", "admin");

             PreparedStatement ps = con
                             .prepareStatement("Insert into student values(?,?,?,?");

             String id = textField_2.getText();
             String username = textField_1.getText();
             String city=  textField.getText(); 
             String town=textField_3.getText();
            
            
             ps.setString(1, id);
             ps.setString(2, username);
              ps.setString(3, town);
             ps.setString(3,  city);
             

             ps.executeUpdate();
             con.close();

             textField_2.setText("");
             textField_3.setText("");
             textField.setText("");
             textField_1.setText("");
            
             } catch (Exception d) {

                     System.out.println("ERROR  " + d);

             }

             }

           
     }
				
				}
		);
		
			

		btnA.setBounds(10, 201, 177, 23);
		frame.getContentPane().add(btnA);
		
		JButton btnBackToHome = new JButton("Back to Home");
		btnBackToHome.setFont(new Font("宋体", Font.BOLD, 13));
		btnBackToHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBackToHome.setBounds(197, 201, 154, 23);
		frame.getContentPane().add(btnBackToHome);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setFont(new Font("宋体", Font.BOLD, 13));
		lblNewLabel.setBounds(37, 24, 91, 21);
		frame.getContentPane().add(lblNewLabel);
		
		textField_2 = new JTextField();
		textField_2.setBounds(179, 24, 66, 21);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(179, 139, 139, 21);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblTown = new JLabel("town");
		lblTown.setFont(new Font("宋体", Font.BOLD, 14));
		lblTown.setBounds(37, 134, 91, 30);
		frame.getContentPane().add(lblTown);
	}
}
