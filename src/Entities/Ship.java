package Entities;

import java.util.ArrayList;


public class Ship extends PolyEntity {

	//ArrayList<ShipModule> modules;
	
	public Ship(int x, int y, int h, int w, double angel){
		super(x, y, h, w, angel, "tomShip", null);
		
		//components
	}

	@Override
	public void tickAction(Object b) {
		Integer[] is = ((Integer[])b);
		//xCoord = is[0];
		//yCoord = is[1];
		
	}

	@Override
	public void checkBounds(int xClick, int yClick) {
		// TODO Auto-generated method stub
		
	}


}
