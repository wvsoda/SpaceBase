package Entities.Menus;
import Entities.ShipModule.MainEngine;


import java.awt.Color;
import java.util.ArrayList;

import Entities.Entity;
import Entities.MovableResource;
import Entities.Menus.MenuComponents.MenuButton;
import Entities.Menus.MenuComponents.StatusBar;
import Entities.ShipModule.ShipModule;

public class EngineMenu extends ShipModuleMenu {

	public EngineMenu(int x, int y, int h, int w, ArrayList<Entity> coms, Entity container) {
		super(x, y, h, w, coms, container);
		
		
		components.add(new StatusBar(x+190, y+30, 100, 25, 0, Color.YELLOW, true, 0, "Fuel", false, 50, 0, 50));
		components.add(new MenuButton(x+220, y+50, 25, 75, "Add Fuel", "click", "addFuel", this,false));
		
		if(((ShipModule)container).nextLevel)
			((MenuButton)components.get(0)).removeMask();
	}		
	
	
	
	@Override
	public void buttonClick(String action){
		switch (action){
		case "addFuel":
			((StatusBar)components.get(1)).currentValue++;
			if ((((StatusBar)components.get(1)).currentValue) >= (((StatusBar)components.get(1)).minValue)){
				(((StatusBar)components.get(1)).currentValue) = (((StatusBar)components.get(1)).minValue);
			}
			
			break;
		case "upgrade" :
			((ShipModule)cont).upgrade();
			break;
		default:
			System.out.println("buttonClick action error");
			
		}
	}
}
