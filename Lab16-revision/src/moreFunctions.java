public class moreFunctions implements Visitor {

	private Outing o;

	public void visit(Visitable v) {

		o = (Outing) v;
	}

	public void book() {
         o.count++;
	}
   public void reset(){
	   o.count=0;
   }
}
