import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.*;
import javax.swing.border.*;
import java.sql.*;

@SuppressWarnings("serial")
public class JDBCMainWindowContent extends JInternalFrame implements
		ActionListener {
	String cmd = null;

	// DB Connectivity Attributes
	private Connection con = null;
	private Statement stmt = null;
	private ResultSet rs = null;

	private Container content;

	private JPanel detailsPanel;
	private JPanel exportButtonPanel;
	// private JPanel exportConceptDataPanel;
	private JScrollPane dbContentsPanel;

	private Border lineBorder;

	private JLabel IDLabel = new JLabel("ID:                 ");
	private JLabel category = new JLabel("category:  ");
	private JLabel ProductsName = new JLabel("ProductsName:      ");
	private JLabel price = new JLabel("price:        ");
	private JLabel TotalAmount = new JLabel("TotalAmount:                 ");
	private JLabel AmountLeaveNum = new JLabel("AmountLeaveNum:               ");
	private JLabel insertDate = new JLabel("insertDate:       ");

	private JTextField IDTF = new JTextField(10);
	private JTextField NumcategoryTF = new JTextField(10);
	private JTextField ProductsNameTF = new JTextField(10);
	private JTextField priceTF = new JTextField(10);
	private JTextField TotalAmountTF = new JTextField(10);
	private JTextField AmountLeaveNumTF = new JTextField(10);
	private JTextField insertDateTF = new JTextField(10);

	private static QueryTableModel TableModel = new QueryTableModel();
	// Add the models to JTabels
	private JTable TableofDBContents = new JTable(TableModel);
	// Buttons for inserting, and updating members
	// also a clear button to clear details panel
	private JButton updateButton = new JButton("Update");
	private JButton insertButton = new JButton("Insert");
	private JButton exportButton = new JButton("Export");
	private JButton deleteButton = new JButton("Delete");
	private JButton clearButton = new JButton("Clear");

	private JButton NumCategory = new JButton("NumCategory :");
	private JButton averagePrice = new JButton("averagePrice :");
	private JTextField averagePriceTF = new JTextField(12);
	private JButton sumProducts = new JButton("sumProducts");
	private JTextField sumProductsTF = new JTextField(12);
	private JButton ListAlloutofStore = new JButton("ListAlloutofStore");
	private JButton ListAllProductsCategory = new JButton(
			"ListAllProductsCategory");
	private JButton lowprice = new JButton("lowprice:");
    private JButton orderPriceByDesc= new JButton("orderPriceByDesc:"); 
	public JDBCMainWindowContent(String aTitle) {
		// setting up the GUI
		super(aTitle, false, false, false, false);
		setEnabled(true);

		initiate_db_conn();
		// add the 'main' panel to the Internal Frame
		content = getContentPane();
		content.setLayout(null);
		content.setBackground(Color.lightGray);
		lineBorder = BorderFactory.createEtchedBorder(15, Color.red,
				Color.black);

		// setup details panel and add the components to it
		detailsPanel = new JPanel();
		detailsPanel.setLayout(new GridLayout(10, 2));
		detailsPanel.setBackground(Color.lightGray);
		detailsPanel.setBorder(BorderFactory.createTitledBorder(lineBorder,
				"CRUD Actions"));

		detailsPanel.add(IDLabel);
		detailsPanel.add(IDTF);
		detailsPanel.add(category );
		detailsPanel.add(NumcategoryTF);
		detailsPanel.add(ProductsName);
		detailsPanel.add(ProductsNameTF);
		detailsPanel.add(price);
		detailsPanel.add(priceTF);
		detailsPanel.add(TotalAmount);
		detailsPanel.add(TotalAmountTF);
		detailsPanel.add(AmountLeaveNum);
		detailsPanel.add(AmountLeaveNumTF);
		detailsPanel.add(insertDate);
		detailsPanel.add(insertDateTF);

		// setup products panel and add the components to it
		exportButtonPanel = new JPanel();
		exportButtonPanel.setLayout(new GridLayout(4, 2));
		exportButtonPanel.setBackground(Color.lightGray);
		exportButtonPanel.setBorder(BorderFactory.createTitledBorder(
				lineBorder, "Export Data"));
		exportButtonPanel.add(NumCategory);
		exportButtonPanel.add(averagePrice);
		exportButtonPanel.add(averagePriceTF);
		exportButtonPanel.add(sumProducts);
		exportButtonPanel.add(sumProductsTF);
		exportButtonPanel.add(ListAlloutofStore);
		exportButtonPanel.add(ListAllProductsCategory);
		exportButtonPanel.add(lowprice);
		exportButtonPanel.add(orderPriceByDesc);
		exportButtonPanel.setSize(500, 200);
		exportButtonPanel.setLocation(3, 300);
		content.add(exportButtonPanel);

		insertButton.setSize(100, 30);
		updateButton.setSize(100, 30);
		exportButton.setSize(100, 30);
		deleteButton.setSize(100, 30);
		clearButton.setSize(100, 30);

		insertButton.setLocation(370, 10);
		updateButton.setLocation(370, 110);
		exportButton.setLocation(370, 160);
		deleteButton.setLocation(370, 60);
		clearButton.setLocation(370, 210);

		insertButton.addActionListener(this);
		updateButton.addActionListener(this);
		exportButton.addActionListener(this);
		deleteButton.addActionListener(this);
		clearButton.addActionListener(this);

		this.NumCategory.addActionListener(this);
		this.averagePrice.addActionListener(this);
		this.sumProducts.addActionListener(this);
		this.ListAlloutofStore.addActionListener(this);
		this.ListAllProductsCategory.addActionListener(this);
		this.lowprice.addActionListener(this);
		this.orderPriceByDesc.addActionListener(this);
		content.add(insertButton);
		content.add(updateButton);
		content.add(exportButton);
		content.add(deleteButton);
		content.add(clearButton);

		TableofDBContents.setPreferredScrollableViewportSize(new Dimension(900,
				300));

		dbContentsPanel = new JScrollPane(TableofDBContents,
				JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		dbContentsPanel.setBackground(Color.lightGray);
		dbContentsPanel.setBorder(BorderFactory.createTitledBorder(lineBorder,
				"Database Content"));

		detailsPanel.setSize(360, 300);
		detailsPanel.setLocation(3, 0);
		dbContentsPanel.setSize(700, 300);
		dbContentsPanel.setLocation(477, 0);

		content.add(detailsPanel);
		content.add(dbContentsPanel);

		setSize(982, 645);
		setVisible(true);

		TableModel.refreshFromDB(stmt);
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

	// event handling
	public void actionPerformed(ActionEvent e) {
		Object target = e.getSource();
		if (target == clearButton) {
			IDTF.setText("");
			NumcategoryTF.setText("");
			ProductsNameTF.setText("");
			priceTF.setText("");
			TotalAmountTF.setText("");
			AmountLeaveNumTF.setText("");
			insertDateTF.setText("");

		}

		if (target == insertButton) {
			try {
				String updateTemp = "INSERT INTO products VALUES(" + null
						+ ",'" + NumcategoryTF.getText() + "','"
						+ ProductsNameTF.getText() + "'," + priceTF.getText()
						+ ",'" + TotalAmountTF.getText() + "','"
						+ AmountLeaveNumTF.getText() + "','"
						+ insertDateTF.getText() + "');";
				System.out.println(updateTemp);
				stmt.executeUpdate(updateTemp);

			} catch (SQLException sqle) {
				System.err.println("Error with  insert:\n" + sqle.toString());
			} finally {
				TableModel.refreshFromDB(stmt);
			}
		}
		if (target == deleteButton) {

			try {
				String updateTemp = "DELETE FROM products WHERE id = "
						+ IDTF.getText() + ";";
				System.out.println(updateTemp);
				stmt.executeUpdate(updateTemp);

			} catch (SQLException sqle) {
				System.err.println("Error with delete:\n" + sqle.toString());
			} finally {
				TableModel.refreshFromDB(stmt);
			}
		}
		if (target == updateButton) {
			try {
				String updateTemp = "UPDATE products SET "
						+ "Numcategory= '"
						+ NumcategoryTF.getText() + "', ProductsName = '"
						+ ProductsNameTF.getText() + "', price= "
						+ priceTF.getText() + ", TotalAmount ="
						+ TotalAmountTF.getText() + ", AmountLeaveNum= "
						+ AmountLeaveNumTF.getText() + ", insertDate = '"
						+ insertDateTF.getText() +

						"' where id = " + IDTF.getText();

				stmt.executeUpdate(updateTemp);
				// these lines do nothing but the table updates when we access
				// the db.
				rs = stmt.executeQuery("SELECT * from products ");
				rs.next();
				rs.close();
			} catch (SQLException sqle) {
				System.err.println("Error with  update:\n" + sqle.toString());
			} finally {
				TableModel.refreshFromDB(stmt);
			}
		}

		// ///////////////////////////////////////////////////////////////////////////////////
		// I have only added functionality of 2 of the button on the lower right
		// of the template
		// /////////////////////////////////////////////////////////////////////////////////
		if (target == this.NumCategory) {

			cmd = "select  ProductsClassName, count(*) as 'Num of productClass 'from products group by ProductsClassName ;";

			try {
				rs = stmt.executeQuery(cmd);
				writeToFile(rs);
			} catch (Exception e1) {
				e1.printStackTrace();
			}

		}
		if (target == this.averagePrice) {
			String averagePriceTF = this.averagePriceTF.getText();

			cmd = "select category, avg(price) as averagePrice " + "from products "
					+ "where category = '" +averagePriceTF + "';";

			System.out.println(cmd);
			try {
				rs = stmt.executeQuery(cmd);
				writeToFile(rs);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		if (target == this.ListAllProductsCategory) {

			cmd = "select distinct category from products;";

			try {
				rs = stmt.executeQuery(cmd);
				writeToFile(rs);
			} catch (Exception e1) {
				e1.printStackTrace();
			}

		}
		if (target == this.ListAlloutofStore) {

			cmd = "select productsName from products where AmountLeaveNum=0;";

			try {
				rs = stmt.executeQuery(cmd);
				writeToFile(rs);
			} catch (Exception e1) {
				e1.printStackTrace();
			}

		}
		
		if (target == this.lowprice) {

			cmd = "select productsName ,price from products where price<=30;";

			try {
				rs = stmt.executeQuery(cmd);
				writeToFile(rs);
			} catch (Exception e1) {
				e1.printStackTrace();
			}

		}
		if (target == this.sumProducts) {
			this.sumProductsTF.getText();

			cmd = "select  category,count(productsName) as sumProductsclass   from products "
					+ "where category = '" +sumProductsTF + "';";

			System.out.println(cmd);
			try {
				rs = stmt.executeQuery(cmd);
				writeToFile(rs);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
			if (target == this.orderPriceByDesc) {

				cmd = "select productsName ,price from products order by price DESC;";

				try {
					rs = stmt.executeQuery(cmd);
					writeToFile(rs);
				} catch (Exception e1) {
					e1.printStackTrace();
				}

			}

		}

	

	// /////////////////////////////////////////////////////////////////////////

	private void writeToFile(ResultSet rs) {
		try {
			System.out.println("In writeToFile");
			FileWriter outputFile = new FileWriter("Sheila.csv");
			PrintWriter printWriter = new PrintWriter(outputFile);
			ResultSetMetaData rsmd = rs.getMetaData();
			int numColumns = rsmd.getColumnCount();

			for (int i = 0; i < numColumns; i++) {
				printWriter.print(rsmd.getColumnLabel(i + 1) + ",");
			}
			printWriter.print("\n");
			while (rs.next()) {
				for (int i = 0; i < numColumns; i++) {
					printWriter.print(rs.getString(i + 1) + ",");
				}
				printWriter.print("\n");
				printWriter.flush();
			}
			printWriter.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
