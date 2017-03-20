package Q4;



public class CityTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

        City c=new City("Dublin","Ireland",1100000);



		int choice = 1;

		while(choice!=5)
		{
         System.out.println();
		 System.out.println("1.Reset Population");
		 System.out.println("2.Read Name");
		 System.out.println("3.PrintDetails");
		 System.out.println("4.Exit");



		 choice = Console.readInt("Please enter a value-->");
			if(choice==1)
			{    int newPop = Console.readInt("Enter New Population-->");
				 c.setNewPopulation(newPop);
			}

			else if(choice==2)
			{
				System.out.println("\nName= "+c.readName());

			}

			else if(choice==3)
			{
				c.printDetails();
			}



		}  // end while



	}

}
