package Q1;
public class TestPair{
public static void main(String args[]) {
    	Pair<Double> p=new Pair(2.1,4.2);
   		 int choice=1;
   		 while (choice !=0){
	        System.out.println("\n1: Reset Value1");
			System.out.println("2: Reset Value2");
			System.out.println("3: Print Details");
                        System.out.println("4: Search");
			System.out.println("0: Exit");
			choice =Console.readInt("Enter Choice:");
			
			if (choice==1){	 double amt=Console.readDouble("Enter Amount");
				             p.setValue1(amt);}
			if (choice==2){	 double amt=Console.readDouble("Enter Amount");
                                         p.setValue2(amt);}
			if (choice==3){	 p.printValues();}	
			if (choice==4){	 double tar=Console.readDouble("Enter Target:");
                             boolean res=p.search(tar);
			                 System.out.println("Found="+res); }	


	                
    }}
}