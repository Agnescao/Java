package rmiClient;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

import rmiServer.BSTree;
import rmiServer.Node;

/**
 * 
 */

/**
 * @author Caolei
 *
 */
public class TableModel extends AbstractTableModel{
	
	
	
int n=10;
	 public String[][] table = new String[n][5] ;
	  


	public String[][] getTable() {
		return table;
	}

	public void setTable(String[][] table) {
		this.table = table;
	}
	public BSTree tree = new BSTree();
	protected String[] columnNames = new String[] {
			"ID", "  Name", " Balance", "Town", " City"
		};
	Node[][] data ={
			
	};
	
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 5;
	}

	public int getRowCount() {
	
		// TODO Auto-generated method stub
		return table.length ;
	}


	 public String getColumnName(int col) {
	        return columnNames[col];
	    }

	public Object getValueAt(int row, int col) {
		// TODO Auto-generated method stub
		return table[row][col];
	}
	 
	public void setModel(Node focusNode){
		System.out.println("=>"+focusNode);
		table[0][0]=columnNames[0];
		table[0][1]=columnNames[1];
		table[0][2]=columnNames[2];
		table[0][3]=columnNames[3];
		table[0][4]=columnNames[4];
		setModel(focusNode, 1);
		}
	public void setModel(Node focusNode, int i){
		if(focusNode !=null){
			
			setRow(focusNode, i);
			i++;
			if(focusNode.left!=null){
				setModel(focusNode.left, i);}
			if(focusNode.right!=null){
				setModel(focusNode.right,  i);}
		}
		
	}
	private void setRow(Node t, int i){
		n++;
		  //String[] data = new String[5];

	        table[i][0] = ""+t.key;
	        table[i][1] = t.name;
	        table[i][2] = ""+t.balance;
	        table[i][3] = t.m_address.getTown();
	        table[i][4] = t.m_address.getCity();
		
		
		}
		
		}
	
	
	
    

