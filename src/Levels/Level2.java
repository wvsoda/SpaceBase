package Levels;

import java.awt.Color;

import Entities.*;
import Entities.Menus.MenuComponents.statusBar;

public class Level2 extends Level {

	public Level2() {
		ents.add(new textInstruction(100, 100, 0, "noimage", "congrat", 70));
		ents.add(new statusBar(300, 300, 25, 200, 0, Color.green, false, 0, "Health", false,0,100,60));

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
