package Levels;

import Entities.Ship;
import Entities.Menus.MenuComponents.MenuButton;

public class IdleLevel extends Level {

	boolean atLocation;
	Level destination;
	double riskFactor;
	boolean exit;
	int travelTimeLeft;
	
	public IdleLevel(Ship e, boolean Location, double risk, Level dest, int travelTime) {
		super(e);
		atLocation = Location;
		riskFactor = risk;
		destination = dest;
		travelTimeLeft = travelTime;
		
		ents.add(ship);
		ents.add(new MenuButton(10, 10, 75, 125, "Exit", "click", "", null, true));
	}

	@Override
	public boolean objectiveMet() {
		return ((MenuButton)ents.get(1)).clicked();
	}

	@Override
	public void tickAction() {
		// TODO Auto-generated method stub

	}

	@Override
	public Level getNextLevel() {
		if (!atLocation){
			return new TravelLevel(travelTimeLeft, riskFactor, ship, destination);
		}else{
			return null;
		}
	}

}
