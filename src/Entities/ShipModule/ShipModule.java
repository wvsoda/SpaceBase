package Entities.ShipModule;

import java.awt.Graphics;
import java.awt.Polygon;
import java.util.ArrayList;

import Entities.Entity;
import Entities.MenuSpawnable;
import Entities.Menus.Menu;
import Entities.Menus.ShipModuleMenu;

public abstract class ShipModule extends Entity implements MenuSpawnable{

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
	public abstract void whenClicked(int x, int y);
		
	
	@Override
	public abstract Menu spawnMenu();
	
	public String getModType(){
		return moduleType;
	}
	
	public int getLevel(){
		return modLevel;
	}
	
	public void upgrade(){
		modLevel++;
	}

	public abstract void draw(Graphics g);

}

