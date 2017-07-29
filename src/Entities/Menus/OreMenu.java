package Entities.Menus;

import java.util.ArrayList;

import Entities.Entity;
import Entities.Menus.MenuComponents.MenuButton;
import Entities.PlanetModules.OrePatch;
import Entities.ShipModule.ShipModule;

public class OreMenu extends Menu {

	public OreMenu(int x, int y, int w, int h, ArrayList<Entity> coms,
			String lab, OrePatch container) {
		super(x, y, w, h, coms, lab, container);
		label = container.oreType() + " amount: " + container.amount();
		
		components.add(new MenuButton(x+10,y+30, "Confirm","equip", "mine", this, false));
	}

	@Override
	public void buttonClick(String action) {
		switch (action){
		case "mine" :
			((OrePatch) cont).mine();
			break;
		//case "repair":
		//	((ShipModule)cont).health++;
		default:
			System.out.println("buttonClick action error");
		}
	}

	@Override
	public void labelUpdate() {
		// TODO Auto-generated method stub

	}

}
