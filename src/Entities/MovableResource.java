package Entities;

import java.awt.Graphics;

public class MovableResource extends Entity {
	int amt;
	String id;
	
	
	//TODO this will use an ID type system later, but will only use images for now
	public MovableResource(int Amt, String img){
		super(0,0,0,0,0,img);
		amt=Amt;
		id = img;
	}
	
	public int amt(){
		return amt;
	}
	
	public String type(){
		return image;
	}


	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
	}

	@Override
	public void whenClicked(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println(image);
	}
}
