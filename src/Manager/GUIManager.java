package Manager;

import javax.swing.Timer;
import java.util.List;
import javax.swing.JFrame;

import Thread.GUIPane;
import Main.GameController;
import Entities.Entity;


public class GUIManager implements TimerInterface {
	
	GUIPane gui = new GUIPane();
	
	@Override
	public Timer initTimer() {
		// TODO Auto-generated method stub
		return new Timer(50, gui);
	}
	
	public void initReftoGUIPane(GameController gc, List<Entity> ents){
		gui.initReftoGUIPane(gc, ents);
	}
	
	public JFrame getThis(){
		return gui;
	}
	
	
}
