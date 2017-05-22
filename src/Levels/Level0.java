package Levels;

import Entities.*;

public class Level0 extends Level {

	public Level0() {
		super();
		ents.add(new MenuButton(300,300,"START"));
	}

	@Override
	public boolean objectiveMet() {
		// TODO Auto-generated method stub
		return ((MenuButton)ents.get(0)).clicked();
	}

}