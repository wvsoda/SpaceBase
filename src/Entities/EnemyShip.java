	package Entities;

import java.awt.Polygon;
import java.util.ArrayList;

import Entities.Menus.Menu;
import Entities.Menus.MenuSpawnable;
import Entities.ShipModule.*;
import importing.ImportManager;

public class EnemyShip extends PolyEntity implements MenuSpawnable {
	
	int totalHealthMax = 300;
	int currentHealth;
	public EnemyShip(int x, int y, int h, int w, double angel){
		super(0, 0, h, w, angel, "enemyShip", null);
		
		currentHealth = totalHealthMax;
		
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
		
		ArrayList<Entity> itms = new ArrayList<Entity>();
		itms.add(new MovableResource(1, "scrap"));
		
		components.add(new Storage(new Polygon((storageX), (storageY), storageX.length), 
				"Center", smallest(storageX), smallest(storageY),itms));
		
		components.add(new SideEngine(new Polygon(EngineRx,EngineLRy,EngineRx.length), 
				"Right", smallest(EngineRx), smallest(EngineLRy)));
		components.add(new SideEngine(new Polygon((EngineLx),(EngineLRy),EngineLRy.length), 
				"Left", smallest(EngineLx), smallest(EngineLRy)));
		components.add(new Cockpit(new Polygon((cockpitX), (cockpitY), cockpitX.length), 
				smallest(cockpitX), smallest(cockpitY)));
		components.add(new MainEngine(new Polygon((mainEngineX), (mainEngineY), mainEngineX.length), 
				smallest(mainEngineX), smallest(mainEngineY)));
		moveTo(x, y, 0);
		//clicked = null;
		//components
	}

	
	@Override
	public void whenClicked(int x, int y){
		super.whenClicked(x, y);
		ImportManager.soundControl("click","play");
	}
	
	@Override
	public Menu spawnMenu() {
		// TODO Auto-generated method stub
		try{
			return ((ShipModule)clicked).spawnEnemyMenu();
		}
	    catch(NullPointerException e){
	    	System.out.println("Your shit's null boi");
	    	return null;
	    }
	}
	
	public ArrayList<Entity> getModules(){
		return components;
	}


	public boolean dead() {
		if (((ShipModule)components.get(3)).health <= 0){
			return true;
		}
		int h = 0;
		for(Entity e : components){
			h += ((ShipModule)e).health;
		}
		if(h <= (int)(totalHealthMax / 10)){
			return true;
		}
		
		return false;
	}

}
