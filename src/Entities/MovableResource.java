package Entities;

public class MovableResource {
	int amt;
	String id;
	
	public MovableResource(int Amt, String ID){
		amt=Amt;
		id=ID;
	}
	
	public int amt(){
		return amt;
	}
	
	public String type(){
		return id;
	}
}
