package Levels;

import Entities.*;
import Entities.Menus.MenuComponents.MenuButton;

public class FightLevel extends Level {

	Level oldLevel;    /// the level that the fight level was triggered from
	
	public FightLevel(Level old, Ship e) {
		super(e);
		oldLevel = old;
		
		ents.add(ship);
		ship.moveTo(100, 200, 0);
		ship.resize(256, 200);
		ents.add(new TextInstruction(400,50,0,"noimage","Fight Scene yeet", 40));
		ents.add(new MenuButton(800,300, 200,300, "fight", "", "", null, true));
	}

	@Override
	public boolean objectiveMet() {
		// TODO Auto-generated method stub
		return ((MenuButton)ents.get(2)).clicked();
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
