
abstract class Book {
	protected String title;
	protected String isbn;
	protected double  price;
	public Book(String t, String i, double p){
		title=t;
		isbn=i;
		price=p;
		}
	public void printDetails(){
		System.out.println("\nBook Details");
		System.out.println("============");
		System.out.println("Title: "+title);
		System.out.println("isbn: "+isbn);
		System.out.println("Price: "+price);
	}
	public void resetPrice(double p){price=p;}
    public double readPrice(){return price;}
      //  add a readGrossPrice   abstract method

	abstract double readGrossPrice();
   }


//////////////////////////////////////////////////////
// Add StandardBook (<300g) (adds 2.25 for postage when calculating GrossPrice)
// Add HeavyBook            (adds 3.25 for postage when calculating GrossPrice)
//


////////////////////////////////////////////////////

public class BookFactoryQ{
public static void main(String[] args){
                 double origPrice=62.48;
                 BookFactory cfactory = new BookFactory();
                 String title=Console.readLine("Enter Title:");
                 String isbn=Console.readLine("Enter ISBN:");
                 double price  =Console.readDouble("Enter Balance:");
                 int weight  =Console.readInt("Enter Weight (g):");
                 Book b = cfactory.getBook(title,isbn,price,weight);
                 int choice=1; int val=0;
                 while(choice!=5){
	               System.out.println("\n1: Change Price");
	               System.out.println("2: Read Base Price");
	               System.out.println("3: Print Details");
	               System.out.println("4: Read Gross Price");
	               System.out.println("5: Exit");
                   System.out.println("Enter Choice:");
                   choice=Console.readInt("Enter Choice:");
	               switch(choice){
	                  case 1:
		                    double np=Console.readInt("Enter New Price: ");
		                    b.resetPrice(np); break;
	                  case 2:  double res=(double)b.readPrice();
		                       System.out.println("Base Price: "+res);
		                       break;
	                  case 3:  b.printDetails();
                               break;
	                  case 4:
	                	       double res2=(double)b.readGrossPrice();
	                           System.out.println("Gross Price: "+res2);
	                           break;
		                    }}}}
