		package importing;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

import Entities.Entity;
import Entities.Ship;
//import javafx.scene.*;
import Entities.*;
public class ImportManager {
	public ClassLoader cldr;
	public static Image ship, tomShip, noimage, blank, menu;
	
	//public Polygon rightMod;
	//public static Location[][] grid;
	
	public ImportManager()
	{
		//grid = new Location[38][36];
		//cldr = this.getClass().getClassLoader();
		//Media hi;
		ImageIcon shipIcon = new ImageIcon("ship.png");
		ImageIcon tomShipIcon = new ImageIcon("tomShip.png");
		ImageIcon noImgIcon = new ImageIcon("noimage.png");
		ImageIcon blankImgIcon = new ImageIcon("blankimg.png");
		ImageIcon menuImgIcon = new ImageIcon("menuImg.png");
		ship = shipIcon.getImage();
		tomShip = tomShipIcon.getImage();
		noimage = noImgIcon.getImage();
		blank = blankImgIcon.getImage();
		menu = menuImgIcon.getImage();
		
		
		
	}
	
	public static ArrayList<Entity> initEnts(){
		Ship e = new Ship(200,100,390,500,0); 
		ArrayList<Entity> ents = new ArrayList<Entity>();

		ents.add(e);
		
		return ents;
	}
	
	public static Image getImage(String img){
		if(img.equals("ship"))
			return ship;
		else if(img.equals("tomShip"))
			return tomShip;
		else if(img.equals("blankimg"))
			return blank;
		else if(img.equals("menu"))
			return menu;
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
