package Levels;

import java.util.ArrayList;

import Entities.Entity;
import Entities.Ship;
import Entities.TextInstruction;
import Entities.ShipModule.ShipModule;
import Entities.ShipModule.Storage;

public class TutorialLevel extends Level {

	public TutorialLevel(Ship e) {
		super(e);
		background = "space";
		ents.add(ship);
		ents.add(new TextInstruction(100, 100, 0, "noimage", 
				"Your engine's broke! Check your storage for scrap metal to repair it", 30));
		((ShipModule)((Ship)ents.get(0)).getModules().get(4)).health = 50;
		
	}
	
	public void initialize(){
		
	}

	@Override
	public boolean objectiveMet() {
		
		ArrayList<Entity> f = ((Ship)ents.get(0)).getModules();
		int x = ((ShipModule)f.get(4)).health;
		if (x ==75){
			((ShipModule)f.get(4)).nextLevel = false;
			return true;
		}else{
			return false;
		}
	}

	@Override
	public void tickAction() {
		ArrayList<Entity> f = ((Ship)ents.get(0)).getModules();
		//System.out.println(((ShipModule)f.get(3)).clickCount);
		if(!((ShipModule)f.get(4)).nextLevel && ((ShipModule)f.get(0)).clickCount>0){
			((ShipModule)f.get(4)).setNextLevelPoss();
			ents.remove(1);
			ents.add(new TextInstruction(100,100,0,"noimage","Oh goodie. You do have scrap metal."
					+ "Go repair that main engine then",30));
		}
		
		
	}

	@Override
	public Level getNextLevel() {
		((Storage)ship.getModules().get(0)).getResources().remove(0);
		return new TravelLevel(100, 10, 0.0,ship,new FightLevel(new GameOverLevel(ship), ship, false));
	}

}
