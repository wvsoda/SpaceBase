package Levels;

import java.util.ArrayList;

import Entities.Entity;
import Entities.Ship;
import Entities.TextInstruction;
import Entities.ShipModule.ShipModule;

public class TutorialLevel extends Level {

	public TutorialLevel(Ship e) {
		super(e);
		background = "space";
		ents.add(ship);
		ents.add(new TextInstruction(100, 100, 0, "noimage", 
				"Upgrade your main engine! Check your storage for scrap metal!", 30));
		
	}

	@Override
	public boolean objectiveMet() {
		
		ArrayList<Entity> f = ((Ship)ents.get(0)).getModules();
		int x = ((ShipModule)f.get(4)).getLevel();
		return(x == 1);
	}

	@Override
	public void tickAction() {
		ArrayList<Entity> f = ((Ship)ents.get(0)).getModules();
		//System.out.println(((ShipModule)f.get(3)).clickCount);
		if(!((ShipModule)f.get(4)).nextLevel && ((ShipModule)f.get(3)).clickCount>0){
			((ShipModule)f.get(4)).setNextLevelPoss();
			ents.remove(1);
			ents.add(new TextInstruction(100,100,0,"noimage","Oh goodie. You do have scrap metal."
					+ "Tally ho to the main engine then",30));
		}
		
		
	}

	@Override
	public Level getNextLevel() {
		
		return new Travel(100, 10, 0.0,ship,new GameOverLevel(ship));
	}

}
