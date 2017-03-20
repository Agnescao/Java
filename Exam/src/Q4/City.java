package Q4;

interface Prototype_city{
	public void setNewPopulation(int p);
	public String readName();
	public void printDetails();
}
public class City implements Prototype_city{
	

	private Location location;
	private int population;
	public City(String name, String country, int population) {
		location=new Location(name,country);
		this.population = population;
	}
	public void setNewPopulation(int newPop) {
		this.population=newPop;
		
	}
	public String readName() {
		// TODO Auto-generated method stub
		return location.readName();
	}
	public void printDetails() {
		 System.out.println("\n     City Details          ");
		 System.out.println("\n");
			System.out.println("Name:     "+readName());
			System.out.println("Country:   "+location.readCountry());
                     System.out.println("population:  "+population);
			
		
	}
	


}
