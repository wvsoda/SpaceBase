package Levels;

import Entities.Ship;

public class Level1 extends Level {

	public Level1() {
		super();
		ents.add(new Ship(200,100,390,500,0));
	}

	@Override
	public boolean objectiveMet() {
		// TODO Auto-generated method stub
		return false;//((Ship)ents.get(0)).engineClicked();
	}

	@Override
	public void tickAction() {
		//ents.get(0).moveTo(ents.get(0).getX() + 1, ents.get(0).getY() + 1, 0);
		
	}

}
