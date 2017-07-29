package Levels;

import java.util.ArrayList;

import Entities.Entity;
import Entities.Planet;
import Entities.Ship;
import Entities.PlanetModules.OrePatch;

public class FirstPlanetLevel extends Level {

	public FirstPlanetLevel(Ship e) {
		super(e);
		background = "space";
		ents.add(new Planet(50,50,600,600,""));
		ents.add(ship);
		
	}

	@Override
	public boolean objectiveMet() {
		// TODO Auto-generated method stub
		ArrayList<Entity> r = ((Planet)ents.get(0)).getModules();
		return (((OrePatch)r.get(0)).mined());
	}

	@Override
	public void tickAction() {
		// TODO Auto-generated method stub

	}

	@Override
	public Level getNextLevel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void initialize() {
		// TODO Auto-generated method stub
		
	}

}
