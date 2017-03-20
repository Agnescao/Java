
public class MoreFunctions implements Visitor{
	private Account a;
	@Override
	public void visit(Visitable v) {
	a=(Account)v;
	}
	
	public void set_balance(int b) {
		
		
		a.set_balance(b);
		
	}
   public void deposit(int amt){
	   int current=a.read_balance();
	   current+=amt;
	  
	   a.set_balance(current);
   }
  /* public void resetNumber(int n){
	   int  cn=
   }*/
   public void printdetails() {
		System.out.println("\nAccount details:");
		System.out.println("Balance:"+a.read_balance()+"\t");
		System.out.println("Number:"+a.read_Number()+"\t");
		
	}
}
