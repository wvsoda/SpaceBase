package Levels;

import Entities.*;
import Entities.Menus.MenuComponents.MenuButton;

public class StartLevel extends Level {

	public StartLevel() {
		super(new Ship(200,100,500,390,0));
		background = "space";
		ents.add(new MenuButton(500,500,"START","click","",null,true));
		ents.add(new TextInstruction(300,300,0,"noimage","SPACE BASE",100));
	}

	@Override
	public boolean objectiveMet() {
		// TODO Auto-generated method stub
		return ((MenuButton)ents.get(0)).clicked();
	}

	@Override
	public void tickAction() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Level getNextLevel() {
		FirstPlanetLevel level = new FirstPlanetLevel(ship);
		return level;
	}

}