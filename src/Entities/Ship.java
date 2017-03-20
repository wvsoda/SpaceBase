package Entities;

import java.awt.Polygon;
import java.util.ArrayList;


public class Ship extends PolyEntity {

	ArrayList<ShipModule> modules;
	
	public Ship(int x, int y, int h, int w, double angel){
		super(x, y, h, w, angel, "tomShip", null);
		
		this.setBounds(new Polygon(new int[]{93,274,294,488},new int[]{146,300,302,465},4));
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
		/*for(ShipModule mod : modules)
			mod.checkBounds(x, y);*/
		System.out.print("yay");
		
	}


}
