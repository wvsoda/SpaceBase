package Entities;

import java.awt.Graphics;

public class MovableResource extends Entity {
	int amt;
	String id;
	
	public MovableResource(int Amt, String ID){
		super(0,0,0,0,0,"");
		amt=Amt;
		id=ID;
	}
	
	public int amt(){
		return amt;
	}
	
	public String type(){
		return id;
	}


	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void whenClicked(int x, int y) {
		// TODO Auto-generated method stub
		
	}
}
