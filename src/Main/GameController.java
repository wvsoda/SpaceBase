package Main;
import java.util.*;

import Entities.*;

import javax.swing.JFrame;
import javax.swing.Timer;

import Manager.*;
//import 
import Thread.GUIPane;
import importing.ImportManager;

public class GameController {
	GUIManager gui;// = new GUIManager();
	boolean menuOpen;
	List<Entity> ents;
	
	public GameController (){
		gui = new GUIManager();
		Timer t = gui.initTimer();
		t.start();
		ents = ImportManager.InitEnts();
		//int x, int y, int h, int w, double angel, String img
		gui.initReftoGUIPane(this, ents);
		JFrame realGui = gui.getThis();
		
		realGui.setVisible(true);
		
	}
	
	public void run() {
		gui.initTimer();
	}
	
	
	
	public void play() {
		GUIPane g = gui.getThis();
		g.changeTestString(g.getClickedX()+" "+g.getClickedY());
		
		g.repaint();
	}
}
