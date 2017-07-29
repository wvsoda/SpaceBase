package Levels;

import java.io.IOException;

import Entities.*;
import Entities.Menus.MenuComponents.MenuButton;
import Entities.ShipModule.ShipModule;
import importing.ImportManager;

public class FightLevel extends Level {

	Level oldLevel;    /// the level that the fight level was triggered from
	boolean playerTurn;
	int enemyHealthCheck;
	
	public FightLevel(Level old, Ship e, boolean surprise) {
		super(e);
		oldLevel = old;
		
		if(surprise){
			playerTurn = false;
		}else{
			playerTurn = true;
		}
		
		ents.add(new EnemyShip(600, 200, 500, 390, 0));
		ents.add(new TextInstruction(400,50,0,"noimage","Fight Scene yeet", 40));
		enemyHealthCheck = ((EnemyShip)ents.get(0)).checkHealth();
	}
	
	public void initialize(){
		ship.moveTo(100, 200, 0);
		ship.resize(500, 390);
		ents.add(ship);
	}

	@Override
	public boolean objectiveMet() {
		return ((EnemyShip)ents.get(0)).dead();
	}

	@Override
	public void tickAction() {
		boolean x = false;
		EnemyShip eShip = (EnemyShip)ents.get(0);
		for (Entity e : eShip.getModules()){
			//int y = ((ShipModule)e).cue; 
			eShip.checkHealth();
			if (eShip.currentHealth < enemyHealthCheck){
				x = true;
				System.out.println("heck");
				break;
			}else{
				x = false;
			}
		}
		
		if (x || !playerTurn){
			switchTurn();
			x = false;
		}

	}
	
	private void switchTurn(){
		System.out.println(playerTurn);
		if(playerTurn){
			playerTurn = false;
			System.out.println("switching is occuring");
			
		}else{
			((EnemyShip)ents.get(0)).attack((Ship)ents.get(2));
			ImportManager.soundControl("shoot", "play");
			playerTurn = true;
			System.out.println("it shoudl be the player's turn now");
		}
		
		for (Entity e : ((EnemyShip)ents.get(0)).getModules()){
			for (Entity x : ((ShipModule)e).enemyMenu.getComponents()){
				if (x instanceof MenuButton){
					((MenuButton)x).clickable = (playerTurn);
				}
			}
		}
		enemyHealthCheck = ((EnemyShip)ents.get(0)).checkHealth();
	}

	@Override
	public Level getNextLevel() {
		return oldLevel;
	}

}
