package Levels;

import java.util.ArrayList;
import java.util.List;
import Entities.*;

public abstract class Level {

	static int currentLevel = 0;
	List<Entity> ents;
	
	
	public Level() {
		//initialize ents here
		ents = new ArrayList<Entity>();
	}
	
	public abstract boolean objectiveMet();
	
	public List<Entity> getEnts(){
		return ents;
	}

}