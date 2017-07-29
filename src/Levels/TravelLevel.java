package Levels;

import Entities.*;
import Entities.Menus.MenuComponents.MenuButton;

public class TravelLevel extends Level {
	
	int travelTime;
	int tickTime;
	int distance;
	int tickTimeMax;
	int i = 0;
	double riskFactor;
	Level dest;
	boolean stop;
	
	public TravelLevel(int dist,int speed,double risk, Ship e, Level destination) {
		super(e);
		dest = destination;
		travelTime = dist/speed;
		tickTimeMax = (travelTime*50);
		tickTime = tickTimeMax;
		
		ents.add(new TextInstruction(500, 600, 0, null, "Time Left: ", 30));
		ents.add(new ShipIcon(0,370,200,256,0));
		ents.add(new TextInstruction(450,650,0,null,"Risk of Encounters: "+(riskFactor*100)+"%", 20));
		ents.add(new MenuButton(10,10,75,125,"Stop","click","",null,true));
	}
	
	public void initialize(){
	}
	
	public TravelLevel(int tick, double risk, Ship e, Level destination){
		super(e);
		dest = destination;
		tickTime = tick;
		tickTimeMax = tickTime;
		
		ents.add(new TextInstruction(500, 600, 0, null, "Time Left: ", 30));
		ents.add(new ShipIcon(0,370,200,256,0));
		ents.add(new TextInstruction(450,650,0,null,"Risk of Encounters: "+(riskFactor*100)+"%", 20));
		ents.add(new MenuButton(10,10,75,125,"Stop","click","",null,true));
	}
	
	
	@Override
	public boolean objectiveMet() {
		// TODO Auto-generated method stub
		
		
		return (tickTime <= 0) || stop;
	}

	@Override
	public void tickAction() {
		tickTime--;
		i++;
		travelTime = tickTime/50;
		((TextInstruction)ents.get(0)).text = "Time Left: "+travelTime;
		double percent = i*1280/tickTimeMax;
		percent /= 1280;
		ents.get(1).moveTo((int)(percent*1280), 370, 0.0);
		
		int x = (int) (100*Math.random());
		int y = (int) (100*Math.random());
		System.out.println((x+y)+"%");
		if (x < riskFactor){
			dest = new FightLevel(dest, ship, stop);
			tickTime = 0;
		}
		if (((MenuButton)ents.get(3)).clicked()){
			dest = new IdleLevel(ship, false, riskFactor, dest, tickTime);
			stop = true;
		}
	}

	@Override
	public Level getNextLevel() {
		return dest;
	}

}
