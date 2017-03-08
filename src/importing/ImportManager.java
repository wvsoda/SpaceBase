		package importing;

import java.awt.*;

import javax.swing.*;

public class ImportManager {
	public ClassLoader cldr;
	public static Image ship;
	//public static Location[][] grid;
	
	public ImportManager()
	{
		//grid = new Location[38][36];
		//cldr = this.getClass().getClassLoader();
		ImageIcon shipIcon = new ImageIcon("ship.png");
		ship = shipIcon.getImage();
		
	}
	
	public static Image getImage(String img){
		if(img.equals("ship"))
			return ship;
		else
			return null;
	}
	/*
	public Image squareHolder()
	{
		return squareHolder;
	}
*/	
}
