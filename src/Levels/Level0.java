package Levels;

import Entities.*;

public class Level0 extends Level {

	public Level0() {
		super();
		ents.add(new MenuButton(500,500,"START","click","",null));
		ents.add(new textInstruction(300,300,0,"noimage","SPACE BASE",100));
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

}