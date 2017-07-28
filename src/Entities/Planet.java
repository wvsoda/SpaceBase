package Entities;

import java.awt.Graphics;
import java.awt.Polygon;
import java.util.ArrayList;

import Entities.Menus.Menu;
import Entities.Menus.MenuSpawnable;
import Entities.PlanetModules.OrePatch;
import Entities.ShipModule.ShipModule;

public class Planet extends PolyEntity implements MenuSpawnable {

	public Planet(int x, int y, int h, int w, String img) {
		super(x, y, h, w, 0, img, null);
		OrePatch o = new OrePatch(160,160,"blank","Pure Solid Gold");
		int[] planetx = {0,600,600,0};
		int[] planety = {0,0,600,600};
		this.setBounds(new Polygon(planetx,planety,4));
		components = new ArrayList<Entity>();
		components.add(o);
		moveTo(x,y,0);
	}
	
	@Override
	public Menu spawnMenu() {
		// TODO Auto-generated method stub
		try{
			return ((OrePatch)clicked).spawnMenu();
		}
	    catch(NullPointerException e){
	    	System.out.println("Your shit's null boi");
	    	return null;
	    }
	}
	
	@Override
	public void draw(Graphics g){
		super.draw(g);
		for(int i=0; i<components.size(); i++){//Entity o : components){
			OrePatch o = ((OrePatch)components.get(i));
			if(o.mined()){
				components.remove(i);
				i--;
			}
		}
	}
	
}
