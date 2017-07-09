package Entities.ShipModule;

import java.awt.Graphics;
import java.awt.Polygon;
import java.util.ArrayList;

import Entities.Entity;
import Entities.Menus.Menu;
import Entities.Menus.ShipModuleMenu;
import Entities.Menus.StorageMenu;

public class Storage extends ShipModule {
	
	//ArrayList<Entity> items;
	public Storage(Polygon b, String location, int topX, int topY, ArrayList<Entity> itms) {
		super(b, location + " Storage", topX, topY);
		resources = itms;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void whenClicked(int x, int y) {
		// TODO Auto-generated method stub

	}

	@Override
	public Menu spawnMenu() {
		// TODO Auto-generated method stub
		ArrayList<Entity> d = new ArrayList<Entity>();
		d.add(new StorageMenu(10, 80, 160, 160, resources, "", null));
		return new ShipModuleMenu(xCoord+200, yCoord-50, 182,247, d,this);
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		
	}
}
