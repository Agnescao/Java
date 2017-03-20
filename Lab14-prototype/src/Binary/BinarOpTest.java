package Binary;







	public class BinarOpTest{
	public static void main(String [] args)
	{
		BinaryOp bo = new BinaryOp(9,5);
		int choice = 1;
		while(choice!=6)
		{    System.out.println();
			 System.out.println("1.reset V1");
			 System.out.println("2.reset V2");
			 System.out.println("3.Add");
			 System.out.println("4.Mult");
			 System.out.println("5.Print");
		     System.out.println("6.Exit");
			choice = Console.readInt("Please enter a value-->");
			if(choice==1)
			{  int val = Console.readInt("Enter a value-->");
			   bo.resetV1(val);
			}
			else if(choice==2)
			{
				int val = Console.readInt("Enter a value-->");
				bo.resetV2(val);
			}
			else if(choice==3)
			{
				int res=bo.add();
				System.out.println("Sum="+res);
			}
			else if(choice==4)
			{
				int res=bo.mult();
				System.out.println("Mult="+res);
			}
			else if(choice==5)
			{
				bo.printDetails();
			}
		}  // end while
	}

	}