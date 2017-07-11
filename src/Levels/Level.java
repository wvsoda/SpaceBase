package Levels;

import java.util.ArrayList;
import java.util.List;
import Entities.*;

public abstract class Level {
	
	static int currentLevel = 0;
	List<Entity> ents;
	String background;
	Ship ship;
	
	
	public Level(Ship e) {
		//initialize ents here
		ship = e;
		ents = new ArrayList<Entity>();
	}
	
	public abstract boolean objectiveMet();
	
	public abstract void tickAction();
	
	public List<Entity> getEnts(){
		return ents;
	}
	
	public String getBackground(){
		return background;
	}
	
	public abstract Level getNextLevel();

}
