package Entities;

import java.awt.Polygon;
import java.util.ArrayList;
import importing.ImportManager;

public class Ship extends PolyEntity implements MenuSpawnable {

	ShipModule clicked;
	
	public Ship(int x, int y, int h, int w, double angel){
		super(0, 0, h, w, angel, "ship", null);
		int[] shipX = {0,115,115,275,275,385,385,310,310,80,80,0};
		int[] shipY = {100,100,35,35,100,100,340,340,490,490,345,345};
		int[] EngineRx = {300,385,385,300};
		int[] EngineLx = {0,85,85,0};
		int[] EngineLRy = {100,100,340,340};
		int[] cockpitX = {115,275,275,115};
		int[] cockpitY = {35,35,100,100};
		int[] storageX = {115,275,275,115};
		int[] storageY = {100,100,315,315};
		int[] mainEngineX = {80,310,310,80};
		int[] mainEngineY = {315,315,490,490};
		
		
		components = new ArrayList<Entity>();
		this.setBounds(new Polygon((shipX),(shipY),shipX.length));
		components.add(new ShipModule(new Polygon(EngineRx,EngineLRy,EngineRx.length), 
				"EngineR", smallest(EngineRx), smallest(EngineLRy)));
		components.add(new ShipModule(new Polygon((EngineLx),(EngineLRy),EngineLRy.length), 
				"EngineL", smallest(EngineLx), smallest(EngineLRy)));
		components.add(new ShipModule(new Polygon((cockpitX), (cockpitY), cockpitX.length), 
				"Cockpit", smallest(cockpitX), smallest(cockpitY)));
		components.add(new ShipModule(new Polygon((storageX), (storageY), storageX.length), 
				"Storage", smallest(storageX), smallest(storageY)));
		components.add(new ShipModule(new Polygon((mainEngineX), (mainEngineY), mainEngineX.length), 
				"MainEngine", smallest(mainEngineX), smallest(mainEngineY)));
		moveTo(x, y, 0);
		clicked = null;
		//components
	}

	@Override
	public void tickAction(Object b) {
		//Integer[] is = ((Integer[])b);
		
		
	}

	@Override
	public void whenClicked(int x, int y) {
		boolean done = false;
		int i = 0;
		while(!done && i < components.size()){
			ShipModule e= (ShipModule) components.get(i);
			if(e.checkBounds(x,y)){
				clicked = e;
				done = true;
			}
			else
				i++;
		}
		ImportManager.playSound();
		//if(bounds.contains(x, y))
		//	System.out.print("yay");
		
	}

	@Override
	public Menu spawnMenu() {
		// TODO Auto-generated method stub
		try{
			return clicked.spawnMenu();
		}
	    catch(NullPointerException e){
	    	System.out.println("Your shit's null boi");
	    	return null;
	    }
	}


}
