
class Account implements Visitable {
	private int number;
	private int balance;

	public Account(int n, int b) {
		number = n;
		balance = b;
	}

	public boolean withdraw(int amt) {
		if (amt > balance)
			return false;
		else {
			balance -= amt;
			return true;
		}
	}

	public int read_balance() {
		return balance;
	}


	public void set_balance(int b) {
		balance=b;
		
	}
	public int read_Number() {
		return number;
		
	}
	

@Override
public void visit(Visitor v) {
	v.visit(this);
	
}

public void accept(Visitor v) {
	v.visit(this);
	
}


}
