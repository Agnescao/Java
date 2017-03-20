



import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StepperTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

                 Stepper s=new Stepper(10,20);



		int choice = 1;

		while(choice!=5)
		{
                  System.out.println();
		 System.out.println("1.SteUp");
		 System.out.println("2.StepDown");
		 System.out.println("3.PrintDetails");
		 System.out.println("4.Exit");



		 choice = Console.readInt("Please enter a value-->");
			if(choice==1)
			{
				boolean res =s.stepUp();
                                if(res==false)System.out.println("Error Too High");
          

			}

			else if(choice==2)
			{
				boolean res =s.stepDown();
                                if(res==false)System.out.println("Error Too Low");

			}

			else if(choice==3)
			{
				s.printDetails();
			}



		}  // end while



	}

}
