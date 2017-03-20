



	public class AccountTestSkel{


	public static void main(String [] args)
	{
		Account a = new Account(12205,200);
        MoreFunctions mf=new MoreFunctions();
        a.accept(mf);
		int choice = 5;

		while(choice!=4)
		{
		System.out.println("\nAccunt Application");
		System.out.println("===================");
		System.out.println("1.Withdraw");
		System.out.println("3.Check Balance");
		System.out.println("5.Reset Balance");
		System.out.println("6.Print details");
		System.out.println("4.Exit");

		choice = Console.readInt("Please enter a value-->");
			if(choice==1)
			{   int amt=Console.readInt("Enter Amount");
			    boolean res1=a.withdraw(amt);
			    if (res1==false) System.out.println("Error");
			}
			else if(choice==3)
			{
				int res=a.read_balance();
				System.out.println("Balance="+res);
			}
			else if(choice==5)
			{   int amt=Console.readInt("Enter Amount");
				mf.set_balance(amt);
				
			}
			else if(choice==6)
			{  mf.printdetails();
				
			}

		}  // end while
	}

	}