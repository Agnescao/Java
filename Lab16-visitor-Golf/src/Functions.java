
public class Functions implements Visitor{
    Golf g;
	public void visit(Visitable v) {
		g=(Golf)v;
		
	}
	public void restart_round(){
		g.setHolesPlayed(0);
		g.setShots(0);
	}
	public int holes_left(){
		return 18-g.readHolesPlayed();
	}
	
}
