package Levels;

import java.awt.Color;

import Entities.*;
import Entities.Menus.MenuComponents.StatusBar;

public class Level2 extends Level {

	public Level2() {
		ents.add(new TextInstruction(100, 100, 0, "noimage", "congrat", 70));
		ents.add(new StatusBar(300, 300, 25, 200, 0, Color.green, false, 0, "Health", false,0,100,60));

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
