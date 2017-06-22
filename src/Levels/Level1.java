package Levels;

import java.util.ArrayList;

import Entities.Entity;
import Entities.Ship;
import Entities.textInstruction;
import Entities.ShipModule.ShipModule;

public class Level1 extends Level {

	public Level1() {
		super();
		ents.add(new Ship(200,100,500,390,0));
		ents.add(new textInstruction(100, 100, 0, 0, 0, "noimage", "Upgrade your right engine!", 70));
	}

	@Override
	public boolean objectiveMet() {
		
		ArrayList<Entity> f = ((Ship)ents.get(0)).getModules();
		int x = ((ShipModule)f.get(0)).getLevel();
		return(x > 1);
	}

	@Override
	public void tickAction() {
		//ents.get(0).moveTo(ents.get(0).getX() + 1, ents.get(0).getY() + 1, 0);
		
	}

}
