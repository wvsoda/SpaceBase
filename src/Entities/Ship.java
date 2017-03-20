package Entities;

import java.awt.Polygon;
import java.util.ArrayList;


public class Ship extends PolyEntity {

	ArrayList<ShipModule> modules;
	
	public Ship(int x, int y, int h, int w, double angel){
		super(x, y, h, w, angel, "tomShip", null);
		int[] ptsx = {93,274,488,294};
		int[] ptsy = {302,146,300,465};
		//TODO: fix polygon bounds eventually
		this.setBounds(new Polygon(ptsx,ptsy,4));
		//modules.add(new ShipModule())
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
		while(!done && i < modules.size()){
			if(modules.get(i).checkBounds(x,y)){
				done = true;
			}
			else
				i++;
		}
		//System.out.print("yay");
		
	}


}
