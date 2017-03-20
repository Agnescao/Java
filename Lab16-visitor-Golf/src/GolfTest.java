//package Ex15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class GolfTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Golf g = new Golf();
        Functions f=new Functions();
       g.accept(f);




		int choice = 1;

		while(choice!=6)
		{
		 System.out.println();
		 System.out.println("1.Add New Score");
		 System.out.println("2.Read Score");
		 System.out.println("3.Print Details");
                 System.out.println("4.Number of Holes Left to Play");
                 System.out.println("5.Restart Round");
		 System.out.println("6.Exit");



		 choice = Console.readInt("Please enter a value-->");
			if(choice==1)
			{
				int s=Console.readInt("enter score for next hole-->");
				g.add_next_score(s);
			}

			else if(choice==2)
			{
			    System.out.println("Score="+g.read_score());

			}


			else if(choice==3)
			{
				g.print_details();
			}
			else if(choice==4)
			{
				f.holes_left();
			}
			else if(choice==5)
			{
				f.restart_round();
			}

		}  // end while



	}

	}


