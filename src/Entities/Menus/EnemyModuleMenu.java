package Entities.Menus;

import java.util.ArrayList;

import Entities.Entity;
import Entities.Menus.MenuComponents.*;
import Entities.ShipModule.ShipModule;
import importing.ImportManager;

public class EnemyModuleMenu extends Menu {

	public boolean shootable;
	public EnemyModuleMenu(int x, int y, int w, int h, ArrayList<Entity> coms, String lab, Entity container, boolean attackable) {
		super(x, y, w, h, coms, lab, container);
		label = ((ShipModule)cont).getModType() + " level " +((ShipModule)cont).getLevel();
		shootable = attackable;
		
		components.add(new MenuButton(x+10, y+30, "Shoot", "shoot","shoot", this, true));
		components.add(new StatusBar(x+10, y+90, 25, 162, 0, null, false, 0, "Health", true, 0, 
				((ShipModule)cont).maxHealth, ((ShipModule)cont).health, true));
	}

	@Override
	public void buttonClick(String action) {
		
		switch (action){
		case "shoot":
			((ShipModule)cont).health -= 10;
			ImportManager.soundControl("shoot", "play");
			break;
		default : System.out.println("Buttonclick action error- "+cont.getClass()+this.getClass());
		}
		
	}

	@Override
	public void labelUpdate() {
		if(((ShipModule)cont).destroyed){
			((MenuButton)components.get(0)).clickable = false;
		}
		((StatusBar)components.get(1)).currentValue = ((ShipModule)cont).health;

	}

}
