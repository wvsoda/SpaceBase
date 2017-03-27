		package importing;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

import Entities.Entity;
import Entities.Ship;

import Entities.*;
public class ImportManager {
	public ClassLoader cldr;
	public static Image ship, tomShip, noimage;
	//public Polygon rightMod;
	//public static Location[][] grid;
	
	public ImportManager()
	{
		//grid = new Location[38][36];
		//cldr = this.getClass().getClassLoader();
		ImageIcon shipIcon = new ImageIcon("ship.png");
		ImageIcon tomShipIcon = new ImageIcon("tomShip.png");
		ImageIcon noImgIcon = new ImageIcon("noimage.png");
		ship = shipIcon.getImage();
		tomShip = tomShipIcon.getImage();
		noimage = noImgIcon.getImage();
		
		
	}
	
	public static ArrayList<Entity> initEnts(){
		Ship e = new Ship(100,80,390,500,0); 
		ArrayList<Entity> ents = new ArrayList<Entity>();

		ents.add(e);
		
		return ents;
	}
	
	public static Image getImage(String img){
		if(img.equals("ship"))
			return ship;
		else if(img.equals("tomShip"))
			return tomShip;
		else
			return noimage;
	}
	/*
	public Image squareHolder()
	{
		return squareHolder;
	}
*/	
}
