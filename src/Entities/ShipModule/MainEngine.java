package Entities.ShipModule;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.ArrayList;

import Entities.Entity;
import Entities.Menus.*;
import Entities.Menus.MenuComponents.*;

public class MainEngine extends ShipModule {

	public MainEngine(Polygon b, int topX, int topY) {
		super(b, "Main Engine", topX, topY);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void whenClicked(int x, int y) {
		// TODO Auto-generated method stub
		System.out.print(moduleType);
		menuOpened = true;
	}

	@Override
	public Menu spawnMenu() {
		// TODO Auto-generated method stub
		if(menuOpened){
			//later create ship module sub classes
			EngineMenu x =  new EngineMenu(xCoord+200, yCoord-50, 182,207, new ArrayList<Entity>(),this);
			
			return x;
		}
		return null;
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub

	}

}
