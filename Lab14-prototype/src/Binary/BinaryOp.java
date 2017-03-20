package Binary;

public class BinaryOp implements Prototype_Binary {
	
	private Pair p;

	public BinaryOp(int i, int j) {
		// TODO Auto-generated constructor stub
		p=new Pair(i,j);
	}

	public void resetV1(int val) {
		// TODO Auto-generated method stub
		p.setV1(val);
	}

	public void resetV2(int val) {
		// TODO Auto-generated method stub
		p.setV2(val);
	}

	public int add() {
		// TODO Auto-generated method stub
		int res=p.readV1()+p.readV2();
		return res;
	}

	public int mult() {
		// TODO Auto-generated method stub
		int res=p.readV1()*p.readV2();
		return res ;
	}

	public void printDetails() {
		// TODO Auto-generated method stub
		System.out.println("BinaryOp Details ");
		System.out.println("--------------- ");
		System.out.println("Value1 : " +p.readV1());
		System.out.println("Value2 : " +p.readV2());
	}

}
