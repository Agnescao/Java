







	public class OutingTest1{
	public static void main(String [] args)
	{
	    Outing ro = new Outing(5);
	    moreFunctions m=new moreFunctions();
	    ro.accept(m);
		int choice = 1;
		while(choice!=5)
		{    System.out.println();
			 System.out.println("1.Book place");
			 System.out.println("2.Cancel");
			 System.out.println("3.Reset to 0");
			 System.out.println("4.Print details");
		     System.out.println("5.Exit");
			choice = Console.readInt("Please enter a value-->");
			if(choice==1)
			{
			  m.book();
			 	System.out.println("Not implemented yet");

			}
			else if(choice==2)
			{
				boolean res1=ro.cancel();
				if(res1==true){
					System.out.println("Cancelled successfully.");
							      }
				else  {
					System.out.println("Not Cancelled successfully.");
			      }
			}
			else if(choice==3)
			{
                m.reset();
				System.out.println("Not Implemented Yet");
			}
			else if(choice==4)
			{
		        ro.print_details();

			}

		}  // end while
	}

	}