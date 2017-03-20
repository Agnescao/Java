package map;



import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MatchTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Match m2=Match.getInstance();

        Match m=Match.getInstance();



		int choice = 1;

		while(choice!=5)
		{
         System.out.println();
		 System.out.println("1.Team 1 Score");
		 System.out.println("2.Team 2 Score");
		 System.out.println("3.Print Details");
		 System.out.println("4.Exit");



		 choice = Console.readInt("Please enter a value-->");
			if(choice==1)
			{
				m.team1_score();

			}

			else if(choice==2)
			{
				m.team2_score();

			}

			else if(choice==3)
			{
				m2.print_score();
			}



		}  // end while



	}

}
