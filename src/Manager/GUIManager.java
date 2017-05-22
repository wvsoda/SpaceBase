package Manager;

import javax.swing.Timer;
import java.util.List;
import javax.swing.JFrame;

import Thread.GUIPane;
import Main.GameController;
import Entities.Entity;


public class GUIManager {
	
	GUIPane gui = new GUIPane();
	
	//public GU
	
	//@Override
	public Timer initTimer() {
		// TODO Auto-generated method stub
		return new Timer(50, gui);
	}
	
	public void initReftoGUIPane(GameController gc, List<Entity> ents){
		gui.initReftoGUIPane(gc, ents);
	}
	
	public void initReftoGUIPane(List<Entity> ents){
		gui.initReftoGUIPane(ents);
	}
	
	public GUIPane getThis(){
		return gui;
	}
	
	
}
