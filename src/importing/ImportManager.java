		package importing;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

import Entities.Entity;
import Entities.Ship;
import Entities.TestingPolygon;

public class ImportManager {
	public ClassLoader cldr;
	public static Image ship;
	public static Image red;
	public static Image blue;
	//public static Location[][] grid;
	
	public ImportManager()
	{
		//grid = new Location[38][36];
		//cldr = this.getClass().getClassLoader();
		ImageIcon shipIcon = new ImageIcon("ship.png");
		ship = shipIcon.getImage();
		
		
		ImageIcon redIcon = new ImageIcon("red.png");
		red = redIcon.getImage();
		
		ImageIcon blueIcon = new ImageIcon ("blue.png");
		blue = blueIcon.getImage();
	}
	
	
	public static List<Entity> InitEnts(){
		List<Entity> ents;
		Ship e = new Ship(0,0,100,100,0); 
		int polyx[] = {0,50,100};
		int polyy[] = {0,50,0};
		TestingPolygon c = new TestingPolygon(150,200,100,50,0,"red.png",polyx,polyy);
		int polyxx[] = {0,150,300};
		int polyyy[] = {0,150,0};
		TestingPolygon d = new TestingPolygon(50,100,300,150,0,"blue.png",polyxx,polyyy);
		ents = new ArrayList<Entity>();

		ents.add(e);
		ents.add(d);
		ents.add(c);
		
		return ents;
	}
	/*
	public Image squareHolder()
	{
		return squareHolder;
	}
*/	
}
