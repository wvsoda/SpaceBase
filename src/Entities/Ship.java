package Entities;

import java.awt.Polygon;
import java.util.ArrayList;


public class Ship extends PolyEntity {

	//ArrayList<ShipModule> components;
	
	public Ship(int x, int y, int h, int w, double angel){
		super(x, y, h, w, angel, "tomShip", null);
		int[] ptsx = {93,274,488,294};
		int[] ptsy = {302,146,300,465};
		int[] shipModx = {404,411,419,467,482,479,467};
		int[] shipMody = {186,399,467,423,399,259,186};
		int[] shipModx2 = {124,105,121,167,182,184};
		int[] shipMody2 = {194,254,420,420,400,187};
		//TODO: fix polygon bounds eventually
		components = new ArrayList<Entity>();
		this.setBounds(new Polygon(ptsx,ptsy,4));
		components.add(new ShipModule(new Polygon(shipModx,shipMody,7), "Thruster "));
		components.add(new ShipModule(new Polygon(shipModx2, shipMody2, 6), "Storager "));
		//components
	}

	@Override
	public void tickAction(Object b) {
		Integer[] is = ((Integer[])b);
		//xCoord = is[0];
		//yCoord = is[1];
		
	}

	@Override
	public void whenClicked(int x, int y) {
		boolean done = false;
		int i = 0;
		while(!done && i < components.size()){
			if(components.get(i).checkBounds(x,y)){
				done = true;
			}
			else
				i++;
		}
		//if(bounds.contains(x, y))
		//	System.out.print("yay");
		
	}


}
