package Entities.Menus;

import java.awt.Color;
import java.util.ArrayList;

import Entities.Entity;
import Entities.Menus.MenuComponents.MenuButton;
import Entities.Menus.MenuComponents.StatusBar;
import Entities.ShipModule.ShipModule;

public class EngineMenu extends ShipModuleMenu {

	public EngineMenu(int x, int y, int h, int w, ArrayList<Entity> coms, Entity container) {
		super(x, y, h, w, coms, container);
		
		
		components.add(new StatusBar(x+10, y+90, 100, 25, 0, Color.YELLOW, true, 0, "Fuel", false, 50, 0, 5));
		components.add(new MenuButton(x+40, y+110, 25, 75, "Add Fuel", "click", "addFuel", this));
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