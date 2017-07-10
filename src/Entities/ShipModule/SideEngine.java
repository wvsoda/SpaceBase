package Entities.ShipModule;

import java.awt.Graphics;
import java.awt.Polygon;
import java.util.ArrayList;

import Entities.Entity;
import Entities.Menus.Menu;
import Entities.Menus.ShipModuleMenu;

public class SideEngine extends ShipModule {

	public SideEngine(Polygon b, String location, int topx, int topy) {
		super(b, location + " Engine", topx, topy, 50);
	}

	@Override
	public void whenClicked(int x, int y) {
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

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		
	}

}
