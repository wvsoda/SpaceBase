package Levels;

import Entities.*;

public class Level2 extends Level {

	public Level2() {
		ents.add(new textInstruction(100, 100, 0, 0, 0, "noimage", "congrat", 70));
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

}
