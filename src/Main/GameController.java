package Main;
import java.util.*;

import Entities.*;

import javax.swing.JFrame;
import javax.swing.Timer;

import Manager.*;
//import 
import Thread.GUIPane;

public class GameController {
	GUIManager gui;// = new GUIManager();
	boolean menuOpen;
	List<Entity> ents;
	
	public GameController (){
		gui = new GUIManager();
		Timer t = gui.initTimer();
		t.start();
		Ship e = new Ship(0,0,100,100,0); 
		int polyx[] = {0,50,100};
		int polyy[] = {0,50,0};
		TestingPolygon c = new TestingPolygon(150,200,100,50,0,"red.png",polyx,polyy);
		int polyxx[] = {0,150,300};
		int polyyy[] = {0,150,0};
		TestingPolygon d = new TestingPolygon(50,100,300,150,0,"blue.png",polyxx,polyyy);
		ents = new ArrayList<Entity>();

		ents.add(e);
		ents.add(d);
		ents.add(c);
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
