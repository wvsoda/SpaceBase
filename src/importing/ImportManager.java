package importing;

import java.applet.AudioClip;






import javafx.scene.media.*;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
//import java.util.logging.Level;

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
	public static Image ship, noimage, blank, menu, button, masked,grid,rock,gold,uni,space, scrap,travelShip, enemyShip;
	public static Clip rick, equip,unequip,click,music,shoot;
	public AudioInputStream sound;
	//public Polygon rightMod;
	//public static Location[][] grid;
	
	public ImportManager()
	{
		//grid = new Location[38][36];
		//cldr = this.getClass().getClassLoader();
		//Media hi;
		ImageIcon noImgIcon = new ImageIcon("img/noimage.png");
		noimage = noImgIcon.getImage();
		ImageIcon blankImgIcon = new ImageIcon("img/blankimg.png");
		blank = blankImgIcon.getImage();
		ImageIcon menuImgIcon = new ImageIcon("img/menuImg.png");
		menu = menuImgIcon.getImage();
		ImageIcon menuButtIcon = new ImageIcon("img/button1.png");
		button = menuButtIcon.getImage();
		ImageIcon shipIcon = new ImageIcon("img/tomShip.png");
		ship = shipIcon.getImage();
		ImageIcon grayIcon = new ImageIcon("img/grayed.png");
		masked = grayIcon.getImage();
		ImageIcon gridIcon = new ImageIcon("img/grid.png");
		grid = gridIcon.getImage();
		ImageIcon rockIcon = new ImageIcon("img/rock.png");
		rock = rockIcon.getImage();
		ImageIcon goldIcon = new ImageIcon("img/gold.png");
		gold = goldIcon.getImage();
		ImageIcon uniIcon = new ImageIcon("img/unicorn.png");
		uni = uniIcon.getImage();
		ImageIcon spaceIcon = new ImageIcon("img/space.gif");
		space = spaceIcon.getImage();
		ImageIcon scrapIcon = new ImageIcon("img/scrap.png");
		scrap = scrapIcon.getImage();
		ImageIcon travelShipIcon = new ImageIcon("img/shipRight.png");
		travelShip = travelShipIcon.getImage();
		ImageIcon enemyShipIcon = new ImageIcon("img/enemyShip.png");
		enemyShip = enemyShipIcon.getImage();
		
		
		
		///////////////////////////////////////////////////////////////////////////SOUND//////////////////////
		
		try {
            File file1 = new File("sound/equip.wav");
            if (file1.exists()) {
                sound = AudioSystem.getAudioInputStream(file1);
             // load the sound into memory (a Clip)
                equip = AudioSystem.getClip();
                equip.open(sound);
            }
            else {
                throw new RuntimeException("Sound: file not found: equip.wav");
            }
            File file2 = new File("sound/unequip.wav");
            if (file2.exists()) {
                sound = AudioSystem.getAudioInputStream(file2);
             // load the sound into memory (a Clip)
                unequip = AudioSystem.getClip();
                unequip.open(sound);
            }
            else {
                throw new RuntimeException("Sound: file not found: unequip.wav");
            }
            File file3 = new File("sound/menuclick1.wav");
            if (file3.exists()) {
                sound = AudioSystem.getAudioInputStream(file3);
             // load the sound into memory (a Clip)
                click = AudioSystem.getClip();
                click.open(sound);
            }
            else {
                throw new RuntimeException("Sound: file not found: menuclick1.wav");
            }
            File file4 = new File("sound/RickAstley.wav");
            if (file4.exists()) {
                sound = AudioSystem.getAudioInputStream(file4);
             // load the sound into memory (a Clip)
                rick = AudioSystem.getClip();
                rick.open(sound);
            }
            else {
                throw new RuntimeException("Sound: file not found: RickAstley.wav");
            }
            File file5 = new File("sound/music.wav");
            if (file5.exists()) {
                sound = AudioSystem.getAudioInputStream(file5);
             // load the sound into memory (a Clip)
                music = AudioSystem.getClip();
                music.open(sound);
            }
            else {
                throw new RuntimeException("Sound: file not found: music.wav");
            }
            File file6 = new File("sound/pew.wav");
            if (file5.exists()) {
                sound = AudioSystem.getAudioInputStream(file6);   ////// TODO: pew.wav isn't supported -- need to reduce bitrate when I have wifi 
             // load the sound into memory (a Clip)
                shoot = AudioSystem.getClip();
                shoot.open(sound);
            }
            else {
                throw new RuntimeException("Sound: file not found: music.wav");
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
	
	
    public static void soundControl(String clipName, String action){
    	Clip clip = null;
    	switch (clipName){
    		case "click" : clip = click;
    		break;
    		case "equip" : clip = equip;
    		break;
    		case "unequip" : clip = unequip;
    		break;
    		case "RickAstley" : clip = rick;
    		System.out.println("what the hell");
    		break;
    		case "music" : clip = music;
    		break;
    		case "shoot" : clip = shoot;
    		break;
    		default:
    			clip = unequip;
    			break;
    	}
    	switch (action){
    	case "play" :  
    		clip.setFramePosition(0);  // Must always rewind!
    		clip.start();
    		break;
    	case "loop" :
    		clip.loop(Clip.LOOP_CONTINUOUSLY);
    		break;
    	case "stop" :
    		clip.stop();
    		break;
    	default :
    		System.out.println("soundControl Error: Invalid action");
    	}
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
		
    
    ///////////////////////////////////////////////////////////////////////////////////////////////////LEVELS/////////////
	
	
	public static ArrayList<Level> initLevels(){
		//Ship e = new Ship(200,100,390,500,0); 
		//Entity m = new MenuButton(300,300,"fuck");
//		Level start = new StartLevel(), tutorial = new TutorialLevel(), gameOver = new GameOverLevel(), travel = new Travel(100, 10, 0.0);
//		
		ArrayList<Level> lvls = new ArrayList<Level>();
//
//		lvls.add(start);
//		lvls.add(tutorial);
//		lvls.add(travel);
//		lvls.add(gameOver);
//		//ents.add(m);
//		
		return lvls;
	}
	
	/////////////////////////////////////////////////////////////////////////////////IMAGES////////////////////////////////
	
	public static Image getImage(String img){
		if(img.equals("ship"))
			return ship;
		else if(img.equals("blank"))
			return blank;
		else if(img.equals("menu"))
			return menu;
		else if(img.equals("button"))
			return button;
		else if (img.equals("grid"))
			return grid;
		else if (img.equals("rock"))
			return rock;
		else if (img.equals("gold"))
			return gold;
		else if (img.equals("unicorn"))
			return uni;
		else if (img.equals("space"))
			return space;
		else if (img.equals("scrap"))
			return scrap;
		else if (img.equals("travelShip"))
			return travelShip;
		else if (img.equals("enemyShip"))
			return enemyShip;
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
