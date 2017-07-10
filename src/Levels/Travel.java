package Levels;

import Entities.*;

public class Travel extends Level {
	
	int travelTime;
	int tickTime;
	int distance;
	int tickTimeMax;
	int i = 0;
	double riskFactor;
	public Travel(int dist,int speed,double risk) {
		travelTime = dist/speed;
		tickTimeMax = (travelTime*50);
		tickTime = tickTimeMax;
		
		ents.add(new TextInstruction(500, 600, 0, null, "Time Left: ", 30));
		ents.add(new ShipIcon(0,370,200,256,0));
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
	}

}
