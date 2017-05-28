package Entities;

import java.awt.Graphics;
import java.awt.Polygon;
import java.util.ArrayList;

import Entities.Menus.Menu;

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
	public void draw(Graphics g) {

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
			ArrayList<Entity> buttons = new ArrayList<Entity>();
			buttons.add(new MenuButton(10,10,"Upgrade"));
			return new Menu(xCoord+200, yCoord-50, 182,207, buttons, moduleType+" level"+modLevel,this);
		}
		return null;
	}
	
	public String modType(){
		return moduleType;
	}
	
	public void upgrade(){
		modLevel++;
	}
}
