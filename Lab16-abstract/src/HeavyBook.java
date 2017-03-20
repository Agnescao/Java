
public class HeavyBook extends Book{

	public HeavyBook(String t, String i, double p) {
		super(t, i, p);
		// TODO Auto-generated constructor stub
	}

	@Override
	double readGrossPrice() {
		// TODO Auto-generated method stub
		return price*3.25;
	}
	

}
