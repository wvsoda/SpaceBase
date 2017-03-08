		package importing;

import java.awt.*;

import javax.swing.*;

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
	/*
	public Image squareHolder()
	{
		return squareHolder;
	}
*/	
}
