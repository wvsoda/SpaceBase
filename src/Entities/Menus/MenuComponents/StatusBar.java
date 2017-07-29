package Entities.Menus.MenuComponents;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

import Entities.Entity;

public class StatusBar extends Entity {
	String label;
	public int maxValue;
	public int minValue;
	public double currentValue;
	double currentPercent;
	Color barColor;
	boolean verticalBar;
	int labelPositionTop;
	boolean showMaxMin;
	Polygon currentbar;
	boolean changeColor;
	
	public StatusBar(int x, int y, int h, int w, double angel, Color c,boolean vert, int labelposup, String labe, boolean showMax, 
			int min, int max, double value, boolean changeColors) {
		super(x, y, h, w, angel, "noimage");
		barColor = c;
		verticalBar = vert;
		labelPositionTop = labelposup;
		showMaxMin = showMax;
		minValue = min;
		maxValue = max;
		currentValue = value;
		label = labe;
		changeColor = changeColors;
	}


	@Override
	public void draw(Graphics g) {
		g.setColor(Color.black);
		g.drawPolygon(bounds);
		int max = maxValue - minValue;
		int current = (int) (currentValue - minValue);
		if (!verticalBar){
			currentPercent = current*width/max;
			currentPercent /= width;
			int polyx[] = {xCoord,(int) (xCoord+(currentPercent*width)),(int) (xCoord+(currentPercent*width)), xCoord};
			int polyy[] = {yCoord,yCoord,yCoord+height,yCoord+height};
			currentbar = new Polygon(polyx,polyy, polyx.length);
		}else{
			currentPercent = current*height/max;
			currentPercent /= height;
			int polyy[] = {yCoord+height,(int) (yCoord+(currentPercent*height)),(int)(yCoord+(currentPercent*height)),yCoord+height};
			int polyx[] = {xCoord,xCoord,xCoord+width,xCoord+width};
			currentbar = new Polygon(polyx,polyy, polyx.length);
		}
		if (changeColor){
			if (currentPercent >= .5){
				g.setColor(Color.GREEN);
			}else if ((currentPercent > .25) && (currentPercent < .5)){
				g.setColor(Color.YELLOW);
			}else if (currentPercent < .25){
				g.setColor(Color.RED);
			}
		}else{
			g.setColor(barColor);
		}
		g.fillPolygon(currentbar);
		g.setColor(Color.black);
		if (labelPositionTop == 1 && !verticalBar){
			g.drawString(label, (xCoord+width/2) - (label.length()*4), yCoord-5);
			if (showMaxMin){
				g.drawString(Integer.toString(maxValue), (xCoord+width-20), yCoord-5);
				g.drawString(Integer.toString(minValue), xCoord, yCoord-5);
			}
		}else if (!verticalBar && labelPositionTop == -1){
			g.drawString(label, (xCoord+width/2) - (label.length()*4), yCoord+height+15);
			if (showMaxMin){
				g.drawString(Integer.toString(maxValue), (xCoord+width-20), yCoord+height+15);
				g.drawString(Integer.toString(minValue), xCoord, yCoord+height+15);
			}
		}else if (labelPositionTop == 0 && !verticalBar){
			g.drawString(label, (xCoord+width/2) - (label.length()*4), (yCoord+height/2)+5);
			if (showMaxMin){
				g.drawString(Integer.toString(maxValue), (xCoord+width-20), (yCoord+height/2)+5);
				g.drawString(Integer.toString(minValue), xCoord, (yCoord+height/2)+5);
			}
		}else if (verticalBar){
			g.drawString(label, (xCoord+width/2)-(label.length()*4), yCoord +height+15);
			if (showMaxMin){
				g.drawString(Integer.toString(maxValue), xCoord, yCoord+height-5);
				g.drawString(Integer.toString(minValue), xCoord, yCoord+15);
			}
		}
	}

	@Override
	public void whenClicked(int x, int y) {
		// TODO Auto-generated method stub
	}

}
