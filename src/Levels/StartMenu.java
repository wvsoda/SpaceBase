package Levels;

import java.util.ArrayList;

import Entities.*;

public class StartMenu extends Level {
	Button k;
	public StartMenu() {
		
		
		ArrayList<Entity> g = new ArrayList<Entity>();
		k = new Button (0,0,50,200,"","Start");
		g.add(k);
		Menu f = new Menu(700,600,200,50,g,"blank");

		ents.add(f);
	}

	@Override
	public boolean objectiveMet() {
		if(k.isClicked())
			return true;
		else
			return false;
	}

}
