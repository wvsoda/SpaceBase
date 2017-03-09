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
		// initialize entities
		Ship shipImg = new Ship(300,50,300,300,0); 

		int polyx[] = {0,0,30,30};
		int polyy[] = {100,0,0,100};
		TestingPolygon engineLeft = new TestingPolygon(385,210,30,100,0,"blue.png",polyx,polyy,3);
		TestingPolygon engineRight = new TestingPolygon(485,210,30,100,0,"blue.png",polyx,polyy,3);
		int polyxx[] = {0,0,50,50};
		int polyyy[] = {125,0,0,125};
		TestingPolygon chassis = new TestingPolygon(425,125,50,125,0,"blue.png",polyxx,polyyy,2);
		int polyxxx[] = {0,25,50};
		int polyyyy[] = {50,0,50};
		TestingPolygon cockpit = new TestingPolygon(425,75,50,50,0,"blue.png",polyxxx,polyyyy,1);
		
		
		//create and add entities to list
		List<Entity> ents;
		ents = new ArrayList<Entity>();

		ents.add(shipImg);
		ents.add(engineLeft);
		ents.add(engineRight);
		ents.add(chassis);
		ents.add(cockpit);
		
		return ents;
	}
	/*
	public Image squareHolder()
	{
		return squareHolder;
	}
*/	
}
