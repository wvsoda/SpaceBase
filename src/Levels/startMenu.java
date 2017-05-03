package Levels;

import Entities.*;

public class startMenu extends level {

	public startMenu() {
		Ship e = new Ship(300,200,390,500,0); 
		ents.add(e);
	}

	@Override
	public boolean objectiveMet() {
		// TODO Auto-generated method stub
		return false;
	}

}
