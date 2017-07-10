package Levels;

import java.awt.Color;

import Entities.*;
import Entities.Menus.MenuComponents.StatusBar;

public class GameOverLevel extends Level {

	public GameOverLevel(Ship e) {
		super(e);
		ents.add(new TextInstruction(350, 370, 0, "noimage", "GAME OVER", 100));                //////////////// EVENTUALLY THIS MIGHT HAVE SOME STATISTICS OF THE GAME OR STUFF LIKE THAT
		ents.add(new TextInstruction(0, 600, 0, "noimage", "congrat", 30));
		ents.add(new StatusBar(0, 575, 50, 1280, 0, Color.GREEN, false, 0, "", false, 0, 1280, 0));
		//ents.add(new StatusBar(300, 300, 25, 200, 0, Color.green, false, 0, "Health", false,0,100,60));

	}

	@Override
	public boolean objectiveMet() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void tickAction() {
		ents.get(1).moveTo((ents.get(1).getX())+1, 600, 0);
		((StatusBar)ents.get(2)).currentValue += 1;
		if (ents.get(1).getX() > 1280){
			ents.get(1).moveTo(0, 600, 0);
			((StatusBar)ents.get(2)).currentValue = 0;
		}

	}

	@Override
	public Level getNextLevel() {
		return null;
	}

}
