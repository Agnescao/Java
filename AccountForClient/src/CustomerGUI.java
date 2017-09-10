import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class CustomerGUI {

	private JFrame frame;
	JButton b; 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerGUI window = new CustomerGUI();
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
	public CustomerGUI() {
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
		
		JLabel lblNewLabel = new JLabel("Welcome to BOI\r\n\r\n");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setBounds(0, 0, 219, 52);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnAddAnAccount = new JButton("Add an account");
		btnAddAnAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							AddAccountGUI window = new AddAccountGUI();
							window.frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});}
				
			
		});
		btnAddAnAccount.setFont(new Font("ËÎÌו", Font.PLAIN, 15));
		btnAddAnAccount.setBounds(31, 88, 165, 36);
		frame.getContentPane().add(btnAddAnAccount);
		
		JButton btnViewYourAccount = new JButton("View your account");
		btnViewYourAccount.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent a) {
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
		});
		btnViewYourAccount.setFont(new Font("ËÎÌו", Font.PLAIN, 15));
		btnViewYourAccount.setBounds(31, 165, 203, 36);
		frame.getContentPane().add(btnViewYourAccount);
	}
}
