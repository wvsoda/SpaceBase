package Entities.Menus;

import java.awt.Graphics;
import java.util.ArrayList;
import Entities.*;


public class ShipModuleMenu extends Menu{

	public ShipModuleMenu(int x, int y, int h, int w, ArrayList<Entity> coms,Entity container) {
		super(x, y, h, w, coms, "", container);
		label = ((ShipModule)cont).getModType() + " level " +((ShipModule)cont).getLevel();

		components.add(new MenuButton(x+10,y+30,"Upgrade","equip", "upgrade", this));
		
	}

	@Override
	public void whenClicked(int x, int y) {
		boolean done = false;
		int i = 0;
		while(!done && i < components.size()){
			Entity e = components.get(i);
			if(e.checkBounds(x,y)){
				clicked = e;
				
				done = true;
			}
			else
				i++;
		}
	}

	@Override
	public void buttonClick(String action) {
		switch (action){
		case "upgrade" :
			((ShipModule)cont).upgrade();
			break;
		default:
			System.out.println("buttonClick action error");
		}
	}

	@Override
	public void labelUpdate() {
		label = ((ShipModule)cont).getModType() + " level " +((ShipModule)cont).getLevel();
	}
	
	

	

}
