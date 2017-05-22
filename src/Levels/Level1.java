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
		return ((Ship)ents.get(0)).engineClicked();
	}

}
