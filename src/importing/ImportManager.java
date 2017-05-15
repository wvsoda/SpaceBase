package importing;

import java.applet.AudioClip;
import javafx.scene.media.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import javax.sound.sampled.Clip;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;

import Entities.*;
import Levels.*;
public class ImportManager {
	public ClassLoader cldr;
	public static Image ship, noimage, blank, menu;
	public static Clip clip, clip2;
	//public Polygon rightMod;
	//public static Location[][] grid;
	
	public ImportManager()
	{
		//grid = new Location[38][36];
		//cldr = this.getClass().getClassLoader();
		//Media hi;
		ImageIcon tomShipIcon = new ImageIcon("tomShip.png");
		ImageIcon noImgIcon = new ImageIcon("noimage.png");
		ImageIcon blankImgIcon = new ImageIcon("blankimg.png");
		ImageIcon menuImgIcon = new ImageIcon("menuImg.png");
		ship = tomShipIcon.getImage();
		noimage = noImgIcon.getImage();
		blank = blankImgIcon.getImage();
		menu = menuImgIcon.getImage();
		
		try {
            File file = new File("RickAstley.wav");
            if (file.exists()) {
                AudioInputStream sound = AudioSystem.getAudioInputStream(file);
             // load the sound into memory (a Clip)
                clip = AudioSystem.getClip();
                clip.open(sound);
            }
            else {
                throw new RuntimeException("Sound: file not found: RickAstley.wav");
            }
        }
        catch (MalformedURLException e) {
            e.printStackTrace();
            throw new RuntimeException("Sound: Malformed URL: " + e);
        }
        catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
            throw new RuntimeException("Sound: Unsupported Audio File: " + e);
        }
        catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Sound: Input/Output Error: " + e);
        }
        catch (LineUnavailableException e) {
            e.printStackTrace();
            throw new RuntimeException("Sound: Line Unavailable Exception Error: " + e);
        }
		
    // play, stop, loop the sound clip
    }
    public static void playSound(){
        clip.setFramePosition(0);  // Must always rewind!
        clip.start();
    }
    public static void loop(){
        clip.loop(Clip.LOOP_CONTINUOUSLY);
    }
    public static void stop(){
            clip.stop();
        }
		/*File file = new File("RickAstley.wav");
		try {
            // Open a sound file stored in the project folder
            clip.open(AudioSystem.getAudioInputStream(file));
            // Play the audio clip with the audioplayer class
            clip.start();
            // Create a sleep time of 2 seconds to prevent any action from occuring for the first
            // 2 seconds of the sound playing
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("InterruptedException");
            System.exit(-1);
        } catch (UnsupportedAudioFileException e){
        	System.out.println("UnsupportedAudio");
            System.exit(-1);
        } catch (LineUnavailableException e){
        	System.out.println("LineUnavailableException");
            System.exit(-1);
        } catch (IOException e){
        	System.out.println("IOException");
            System.exit(-1);
        }
		return new String("RickAstly.wav");
	}
	 public static void stop() {
	        // clip.stop() will only pause the sound and still leave the sound in the line
	        // waiting to be continued. It does not actually clear the line so a new action could be performed.
	        clip.stop();
	        // clip.close(); will clear out the line and allow a new sound to play. clip.flush() was not 
	        // used because it can only flush out a line of data already performed.
	        clip.close();
	    }*/
	
	public static ArrayList<Level> initLevels(){
		StartMenu e = new StartMenu();
		IdleLevel i = new IdleLevel();
		ArrayList<Level> lvls = new ArrayList<Level>();
		
		lvls.add(e);
		lvls.add(i);
		return lvls;
	}
	
	public static Image getImage(String img){
		if(img.equals("ship"))
			return ship;
		else if(img.equals("blank"))
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
