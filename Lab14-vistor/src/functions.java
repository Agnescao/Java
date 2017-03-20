
public class functions implements Visitor {
    private Match m;
	
	public void visit(Visitable v) {
		m=(Match)v;
		
	}
	public void resetMatch(){
		
		m.setTeam1Score(0);
		m.setTeam2Score(0);
	}
	public String readResult(){
		if(m.readTeam1Score()>m.readTeam2Score()) return "CITY WIN";
		else if(m.readTeam1Score()<m.readTeam2Score()) return "UNTILED WIN";
		else return "DRAW";
	}

}
