package Levels;

import java.util.ArrayList;

import Entities.Button;
import Entities.Entity;
import Entities.Menu;
import Entities.Ship;

public class IdleLevel extends Level {

	@Override
	public boolean objectiveMet() {
		// TODO Auto-generated method stub
		return false;
	}
	public IdleLevel() {
	
	Ship k;
	//ArrayList<Entity> g = new ArrayList<Entity>();
	k = new Ship (200,200,490,385, 0);
	//g.add(k);

	ents.add(k);
}

}
