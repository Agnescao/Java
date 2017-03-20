package rmiServer;

public class Node {
	public int key;
	public String name;
	public int balance;
    public Address m_address;
	
    public Node left;
	public Node right;

	Node(int key,String nm, int b,String town,String city) {
		this.key =key;
		name = nm;
		balance=b;
		m_address=new Address( city, town);
		
	}

	
	public int readKey() {
		return key;
	}


	


	
	@Override
   public String toString()
   {
	   return "Node:" + key + "  Name : " +name +"  Balance:"+balance +"  Town:"+m_address.getTown()+"  City:"+m_address.getCity();
   }

	public String readName() {
		return name;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public Address getM_address() {
		return m_address;
	}

	public void setM_address(Address m_address) {
		this.m_address = m_address;
	}


	public Node getLeft() {
		return left;
	}


	public void setLeft(Node left) {
		this.left = left;
	}


	public Node getRight() {
		return right;
	}


	public void setRight(Node right) {
		this.right = right;
	}

	

	
}