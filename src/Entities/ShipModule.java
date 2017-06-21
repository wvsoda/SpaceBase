package Entities;

import java.awt.Graphics;
import java.awt.Polygon;
import java.util.ArrayList;

import Entities.Menus.Menu;
import Entities.Menus.ShipModuleMenu;

public class ShipModule extends Entity implements MenuSpawnable{

	ArrayList<Entity> resources;
	String moduleType;
	int relX, relY;
	boolean menuOpened;
	int modLevel;

	public ShipModule(Polygon b, String modType, int topX, int topY) {
		super(topX,topY,0,0, 0.0, "");
		moduleType = modType;
		bounds = b;
		resources = new ArrayList<Entity>();
		menuOpened = false;
		modLevel = 0;
	}

	@Override
	public void whenClicked(int x, int y) {
		System.out.print(moduleType);
		menuOpened = true;
	}
	
	@Override
	public Menu spawnMenu() {

		if(menuOpened){
			//later create ship module sub classes
			
			return new ShipModuleMenu(xCoord+200, yCoord-50, 182,207, new ArrayList<Entity>(),this);
		}
		return null;
	}
	
	public String getModType(){
		return moduleType;
	}
	
	public int getLevel(){
		return modLevel;
	}
	
	public void upgrade(){
		modLevel++;
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		
	}

}

