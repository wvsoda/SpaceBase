package Levels;

import java.util.ArrayList;

import Entities.*;

public class startMenu extends level {

	public startMenu() {
		Ship e = new Ship(300,200,390,500,0); 
		ents.add(e);
		
		ArrayList<Entity> g = new ArrayList<Entity>();
		Menu f = new Menu(700,600,200,50,g);
		ents.add(f);
	}

	@Override
	public boolean objectiveMet() {
		// TODO Auto-generated method stub
		return false;
	}

}
