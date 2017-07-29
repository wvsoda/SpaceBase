package Entities.Menus;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import Entities.*;
import Entities.Menus.MenuComponents.*;
import Entities.ShipModule.ShipModule;


public class ShipModuleMenu extends Menu{

	public ShipModuleMenu(int x, int y, int h, int w, ArrayList<Entity> coms,Entity container) {
		super(x, y, h, w, coms, "", container);
		label = ((ShipModule)cont).getModType() + " level " +((ShipModule)cont).getLevel();
		//translateComs(x,y);
		components.add(new MenuButton(x+10,y+30, "Upgrade","equip", "upgrade", this, false));
		components.add(new MenuButton(x+10, y+90, "Repair", "equip", "repair", this, false));
		components.add(new StatusBar(x+10, y+150, 25, 162, 0, Color.GREEN, false, 0, "Health", true, 0, ((ShipModule)cont).maxHealth, ((ShipModule)cont).health, true));
	}
	/*
	@Override
	public void whenClicked(int x, int y) {
		super.whenClicked(x, y);
	}
	*/
	@Override
	public void buttonClick(String action) {
		switch (action){
		case "upgrade" :
			((ShipModule)cont).upgrade();
			break;
		case "repair":
			((ShipModule)cont).health = ((ShipModule)cont).maxHealth;
		default:
			System.out.println("buttonClick action error");
		}
	}

	@Override
	public void labelUpdate() {
		label = ((ShipModule)cont).getModType() + " level " +((ShipModule)cont).getLevel();
	}
	
	

	

}
