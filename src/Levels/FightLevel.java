package Levels;

import Entities.*;
import Entities.Menus.MenuComponents.MenuButton;

public class FightLevel extends Level {

	Level oldLevel;    /// the level that the fight level was triggered from
	
	public FightLevel(Level old, Ship e) {
		super(e);
		oldLevel = old;
		
		ents.add(new EnemyShip(600, 200, 500, 390, 0));
		ents.add(new TextInstruction(400,50,0,"noimage","Fight Scene yeet", 40));
	}
	
	public void initialize(){
		ship.moveTo(100, 200, 0);
		ship.resize(500, 390);
		ents.add(ship);
	}

	@Override
	public boolean objectiveMet() {
		return ((EnemyShip)ents.get(0)).dead();
	}

	@Override
	public void tickAction() {
		// TODO Auto-generated method stub

	}

	@Override
	public Level getNextLevel() {
		return oldLevel;
	}

}
