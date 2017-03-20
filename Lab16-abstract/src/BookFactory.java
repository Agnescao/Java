
public class BookFactory {

	public Book getBook(String title, String isbn, double price, int weight) {
		if(weight<300) return new StandardBook(title, isbn , price);
		else return new HeavyBook(title, isbn , price);
	}

}
