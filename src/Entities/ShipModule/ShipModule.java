package Entities.ShipModule;

import java.awt.Graphics;
import java.awt.Polygon;
import java.util.ArrayList;

import Entities.Entity;
import Entities.Menus.EnemyModuleMenu;
import Entities.Menus.Menu;
import Entities.Menus.MenuSpawnable;
import Entities.Menus.ShipModuleMenu;

public abstract class ShipModule extends Entity implements MenuSpawnable{

	ArrayList<Entity> resources;
	String moduleType;
	int relX, relY;
	boolean menuOpened;
	public boolean nextLevel=false;
	int modLevel;
	public int health;
	public int maxHealth;
	public int clickCount;
	public ShipModule(Polygon b, String modType, int topX, int topY, int maxHealths) {
		super(topX,topY,0,0, 0.0, "");
		maxHealth = maxHealths;
		health = maxHealth;
		moduleType = modType;
		bounds = b;
		resources = new ArrayList<Entity>();
		menuOpened = false;
		modLevel = 1;
		clickCount = 0;
	}

	@Override
	public void whenClicked(int x, int y){
		clickCount++;
	}
	
	public Menu spawnEnemyMenu(){
		return new EnemyModuleMenu(xCoord+200,yCoord-50, 182, 207, new ArrayList<Entity>(), moduleType, this);
	};
		
	
	@Override
	public abstract Menu spawnMenu();
	
	public String getModType(){
		return moduleType;
	}
	
	public int getLevel(){
		return modLevel;
	}
	
	public void upgrade(){
		modLevel++;
	}

	public abstract void draw(Graphics g);
	
	public ArrayList<Entity> getResources(){
		return resources;
	}
	
	public void setNextLevelPoss(){
		nextLevel = true;
	}

}

