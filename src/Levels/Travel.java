package Levels;

import Entities.*;

public class Travel extends Level {
	
	int travelTime;
	int tickTime;
	int distance;
	int tickTimeMax;
	int i = 0;
	double riskFactor;
	Level dest;
	
	public Travel(int dist,int speed,double risk, Ship e, Level destination) {
		super(e);
		dest = destination;
		travelTime = dist/speed;
		tickTimeMax = (travelTime*50);
		tickTime = tickTimeMax;
		
		ents.add(new TextInstruction(500, 600, 0, null, "Time Left: ", 30));
		ents.add(new ShipIcon(0,370,200,256,0));
		ents.add(new TextInstruction(450,650,0,null,"Risk of Encounters: "+(riskFactor*100)+"%", 20));
	}

	@Override
	public boolean objectiveMet() {
		// TODO Auto-generated method stub
		
		
		return (tickTime <= 0);
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
			dest = new FightLevel(dest, ship);
			tickTime = 0;
		}
	}

	@Override
	public Level getNextLevel() {
		return dest;
	}

}
