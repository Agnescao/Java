



import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MatchTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

        Match m=new Match();
       functions f=new functions();
       m.accept(f);


		int choice = 1;

		while(choice!=4)
		{
         System.out.println();
		 System.out.println("1.Team 1 Score");
		 System.out.println("2.Team 2 Score");
		 System.out.println("3.Print Details");
		 
		 System.out.println("4.Exit");
		 System.out.println("5.resetMatch");
		 System.out.println("6.readResult");



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
				m.print_score();
			}
			else if(choice==5)
			{
				f.resetMatch();
			}
			else if(choice==6)
			{
				 System.out.println(f.readResult());
			}


		}  // end while



	}

}
