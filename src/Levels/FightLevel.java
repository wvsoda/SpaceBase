package Levels;

import Entities.*;

public class FightLevel extends Level {

	Level oldLevel;    /// the level that the fight level was triggered from
	
	public FightLevel(Level old, Ship e) {
		super(e);
		oldLevel = old;
	}

	@Override
	public boolean objectiveMet() {
		// TODO Auto-generated method stub
		return false;
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
