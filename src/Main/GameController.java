package Main;
import importing.ImportManager;


import java.util.*;

import Entities.*;
import Levels.*;

import javax.swing.JFrame;
import javax.swing.Timer;

import Manager.*;
//import 
import Thread.GUIPane;
import Levels.*
;
public class GameController {
	GUIManager gui;// = new GUIManager();
	boolean menuOpen;
	List<Entity> ents;
	public Level currentLevel;
	public GameController (){
		/*gui = new GUIManager();
		Timer t = gui.initTimer();
		t.start();
		ents = ImportManager.initLevel();
		//int x, int y, int h, int w, double angel, String img
		gui.initReftoGUIPane(this, ents);
		JFrame realGui = gui.getThis();
		
		realGui.setVisible(true);*/

		currentLevel = new StartLevel();
		gui = new GUIManager();
		Timer t = gui.initTimer();
		t.start();
		ents = currentLevel.getEnts();
		//int x, int y, int h, int w, double angel, String img
		gui.initReftoGUIPane(this, ents);
		JFrame realGui = gui.getThis();
		
		realGui.setVisible(true);
		//ImportManager.soundControl("music", "loop");
	}
	
	public void run() {
		gui.initTimer();
	}
	
	
	
	public void play() {
		GUIPane g = gui.getThis();
		g.repaint();
		if(currentLevel.objectiveMet()){
			try{
				currentLevel = currentLevel.getNextLevel();
				currentLevel.initialize();
				g.closeMenu();
				g.initReftoGUIPane(currentLevel.getEnts());
			}
			catch(NullPointerException e){
				System.out.println("your shirts null boi");
				g.dispose();
			}
		}
	}
}
