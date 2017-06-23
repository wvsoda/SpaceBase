package Entities.Menus;

import java.awt.Color;
import java.util.ArrayList;

import Entities.Entity;
import Entities.Menus.MenuComponents.MenuButton;
import Entities.Menus.MenuComponents.statusBar;
import Entities.ShipModule.ShipModule;

public class engineMenu extends ShipModuleMenu {

	public engineMenu(int x, int y, int h, int w, ArrayList<Entity> coms, Entity container) {
		super(x, y, h, w, coms, container);
		
		
		components.add(new statusBar(x+10, y+90, 100, 25, 0, Color.YELLOW, true, 0, "Fuel", false, 50, 0, 5));
		components.add(new MenuButton(x+40, y+110, 25, 75, "Add Fuel", "click", "addFuel", this));
	}

	@Override
	public void buttonClick(String action){
		switch (action){
		case "addFuel":
			((statusBar)components.get(1)).currentValue++;
			if ((((statusBar)components.get(1)).currentValue) >= (((statusBar)components.get(1)).minValue)){
				(((statusBar)components.get(1)).currentValue) = (((statusBar)components.get(1)).minValue);
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
