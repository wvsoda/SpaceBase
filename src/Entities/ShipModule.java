package Entities;

import java.awt.Graphics;
import java.awt.Polygon;
import java.util.ArrayList;
import Entities.Button;

import Entities.Menus.Menu;

public class ShipModule extends Entity implements MenuSpawnable{

	ArrayList<Entity> resources;
	String moduleType;
	int relX, relY;
	boolean menuOpened;
<<<<<<< HEAD
	
=======
	int modLevel;
>>>>>>> 9896681c5f4e4510ef9fa9730fe356eb4648b462
	public ShipModule(Polygon b, String modType, int topX, int topY) {
		super(topX,topY,0,0, 0.0, "");
		moduleType = modType;
		bounds = b;
		resources = new ArrayList<Entity>();
		menuOpened = false;
<<<<<<< HEAD
		
		Button dd = new Button(25,30,30,100,"","Option 1");
		Button fd = new Button(25,90,30,100,"","Option 2");
		Button gd = new Button(25,150,30,100,"","Option 3");
		resources.add(dd);
		resources.add(fd);
		resources.add(gd);
=======
		modLevel = 0;
>>>>>>> 9896681c5f4e4510ef9fa9730fe356eb4648b462
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
<<<<<<< HEAD
		if(menuOpened)
			return new Menu(xCoord+200, yCoord-50, 150,210, resources,"blank");
=======
		if(menuOpened){
			//later create ship module sub classes
			ArrayList<Entity> buttons = new ArrayList<Entity>();
			buttons.add(new MenuButton(10,10,"Upgrade"));
			return new Menu(xCoord+200, yCoord-50, 182,207, buttons, moduleType+" level"+modLevel,this);
		}
>>>>>>> 9896681c5f4e4510ef9fa9730fe356eb4648b462
		return null;
	}
	
	public String modType(){
		return moduleType;
	}
	
	public void upgrade(){
		modLevel++;
	}
}
