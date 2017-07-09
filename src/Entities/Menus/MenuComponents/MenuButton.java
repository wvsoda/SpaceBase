package Entities.Menus.MenuComponents;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Polygon;

import Entities.Entity;
import Entities.Menus.*;
import importing.ImportManager;

public class MenuButton extends Entity{
	String label;
	boolean clicked;
	String soundOption;
	Entity cont;
	String buttonAction;
	public boolean clickable;
	public MenuButton(int topX, int topY, int h, int w, String labe, String sound, String action, Entity container, boolean clicko) {
		super(topX, topY, h,w);
		cont = container;
		soundOption = sound;
		label = labe;
		clicked = false;
		buttonAction = action;
		clickable = clicko;
	}
	
	public MenuButton(int topX, int topY, String labe, String sound, String action, Entity container, boolean clicko){
		super(topX,topY,50,162);
		cont = container;
		soundOption = sound;
		label = labe;
		clicked = false;
		buttonAction = action;
		clickable = clicko;
	}


	@Override
	public void draw(Graphics g) {
		g.drawImage(ImportManager.button, xCoord, yCoord, width, height, null);
		//g.setFont(Font.getFont(""));
		g.drawString(label, (xCoord+width/2) - (label.length()*4), yCoord+height/2);
		g.drawString("\n"+xCoord+" "+yCoord, 100, 100);
		if (!clickable){
			g.drawImage(ImportManager.masked, xCoord, yCoord, width, height, null);
		}
		
	}

	@Override
	public void whenClicked(int x, int y) {
		//System.out.println(option + "clicked");
		if (clickable){
			clicked = true;
			if (cont instanceof Menu){
				((Entities.Menus.Menu)cont).buttonClick(buttonAction);	
			}
			ImportManager.soundControl(soundOption, "play");
		}
	}
	public boolean clicked(){
		return clicked;
	}
	
	public void removeMaskIf(boolean remove){
		if(remove)
			clickable = true;
	}
}
