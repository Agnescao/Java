package Member;
public class Member <T extends Number & Comparable <T>>{
	private T ID;
	
	public Member(T id){
		this.ID=id;
	}
	
	public void setID(T id){
		this.ID=id;
	}

	public T readID(){
		return   this.ID;
	}
	
	public boolean checkID(T id)
	{ if (ID.equals(id))      return true;
	else                 return false;
	}

}
