package Main;
import importing.ImportManager;


import java.util.*;
import java.util.logging.Level;

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
	public List<Level> levels;
	List<Entity> ents;
<<<<<<< HEAD
	List<level> levels;
	int currentLevel;
	public GameController (){
=======
	public int currentLevel;
	public GameController (){
		/*gui = new GUIManager();
		Timer t = gui.initTimer();
		t.start();
		ents = ImportManager.initLevel();
		//int x, int y, int h, int w, double angel, String img
		gui.initReftoGUIPane(this, ents);
		JFrame realGui = gui.getThis();
		
		realGui.setVisible(true);*/
>>>>>>> 9896681c5f4e4510ef9fa9730fe356eb4648b462
		currentLevel = 0;
		gui = new GUIManager();
		Timer t = gui.initTimer();
		t.start();
		levels = ImportManager.initLevels();
		ents = levels.get(currentLevel).getEnts();
		//int x, int y, int h, int w, double angel, String img
		gui.initReftoGUIPane(this, ents);
		JFrame realGui = gui.getThis();
		
		realGui.setVisible(true);
		
	}
	
	public void run() {
		gui.initTimer();
	}
	
	
	
	public void play() {
		/*GUIPane g = gui.getThis();
		g.changeTestString(g.getClickedX()+" "+g.getClickedY());
		g.repaint();
		*/
		GUIPane g = gui.getThis();
		g.changeTestString(g.getClickedX()+" "+g.getClickedY());
		g.repaint();
		if(levels.get(currentLevel).objectiveMet()){
			try{
			currentLevel++;
			g.initReftoGUIPane(levels.get(currentLevel).getEnts());
			}
			catch(IndexOutOfBoundsException e){
				g.dispose();
			}
		}
	}
}
