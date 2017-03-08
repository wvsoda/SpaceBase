package Entities;


public class Ship extends PolyEntity {

	public Ship(int x, int y, int h, int w, double angel){
		super(x, y, h, w, angel, "ship", null);
	}

	@Override
	public void tickAction(Object b) {
		Integer[] is = ((Integer[])b);
		xCoord = is[0];
		yCoord = is[1];
		
	}


}
