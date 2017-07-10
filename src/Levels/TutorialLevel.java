package Levels;

import java.util.ArrayList;

import Entities.Entity;
import Entities.Ship;
import Entities.TextInstruction;
import Entities.ShipModule.ShipModule;

public class TutorialLevel extends Level {

	public TutorialLevel() {
		super();
		background = "space";
		ents.add(new Ship(200,100,500,390,0));
		ents.add(new TextInstruction(100, 100, 0, "noimage", "Upgrade your right engine! Check your storage for scrap metal!", 30));
	}

	@Override
	public boolean objectiveMet() {
		
		ArrayList<Entity> f = ((Ship)ents.get(0)).getModules();
		int x = ((ShipModule)f.get(4)).getLevel();
		return(x == 1);
	}

	@Override
	public void tickAction() {
		//ents.get(0).moveTo(ents.get(0).getX() + 1, ents.get(0).getY() + 1, 0);
		
		
	}

}
