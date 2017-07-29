package Entities.PlanetModules;

import java.awt.Graphics;
import java.awt.Polygon;
import java.util.ArrayList;

import Entities.Entity;
import Entities.Menus.Menu;
import Entities.Menus.MenuSpawnable;
import Entities.Menus.OreMenu;

public class OrePatch extends Entity implements MenuSpawnable {
	
	String oreType;
	int amt;
	boolean menuOpened = false;
	boolean mined = false;
	
	public OrePatch(int x, int y, String img, String oreT) {
		super(x, y, 0,0,0, img);
		oreType = oreT;
		amt = (int)(Math.random()*50);
		int[] orex = {x,x+25,x+25,x};
		int[] orey = {y,y,y+amt/25,y+amt/25};
		bounds = new Polygon(orex,orey,4);
	}
	
	
	public OrePatch(int x, int y, int h, int w) {
		super(x, y, h, w);
		// TODO Auto-generated constructor stub
	}
	
	public String oreType(){
		return oreType;
	}
	
	public int amount(){
		return amt;
	}
	
	@Override
	public Menu spawnMenu() {
		// TODO Auto-generated method stub
		if(menuOpened){
			OreMenu m = new OreMenu(xCoord+200, yCoord-50, 
					350,207, new ArrayList<Entity>(),"",this);
			return m;
		}
		return null;
	}

	@Override
	public void draw(Graphics g) {
		int deltax=0,deltay=0;
		for(int i=0; i<=amt; i++){
			g.drawRect(xCoord+deltax, yCoord+deltay, 5, 5);
			deltax+=5;
			if(deltax==25){
				deltay+=5;
				deltax = (int)(Math.random()*10);
			}
		}

	}

	@Override
	public void whenClicked(int x, int y) {
		menuOpened = true;

	}
	
	public void mine(){
		mined = true;
	}
	
	public boolean mined(){
		return mined;
	}

}
