
public class StandardBook extends Book {

	public StandardBook(String t, String i, double p) {
		super(t, i, p);
		// TODO Auto-generated constructor stub
	}

	@Override
	double readGrossPrice() {
		// TODO Auto-generated method stub
		return price*2.25;
	}
	

}
