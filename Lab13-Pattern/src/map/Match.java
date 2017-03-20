package map;






public class Match {
	private String team1;
	private String team2;
	private int score1;
	private int score2;
	private static Match  single;
    private static boolean created = false;
	private Match()
	{
		single=this;created=true;
		this.team1="City";
		this.team2="United";}

	public static Match getInstance(){
		if(!created){
			single=new Match();
		}
		return single;
	}
	public void team1_score()
	{
		score1++;
	}

	public void team2_score()
	{
		score2++;
	}

	public void print_score(){
		System.out.println("\nScore:");
		System.out.println(""+team1+"\t"+team2);
		System.out.println(" " +
				""+score1+"\t "+score2);}
}
