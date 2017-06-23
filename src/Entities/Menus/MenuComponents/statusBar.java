package Entities.Menus.MenuComponents;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

import Entities.Entity;

public class statusBar extends Entity {
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
	
	public statusBar(int x, int y, int h, int w, double angel, Color c,boolean vert, int labelposup, String labe, boolean showMax, int min, int max, double value) {
		super(x, y, h, w, angel, "noimage");
		barColor = c;
		verticalBar = vert;
		labelPositionTop = labelposup;
		showMaxMin = showMax;
		minValue = min;
		maxValue = max;
		currentValue = value;
		label = labe;
	}


	@Override
	public void draw(Graphics g) {
		g.setColor(Color.black);
		g.drawPolygon(bounds);
		int max = maxValue - minValue;
		int current = (int) (currentValue - minValue);
		currentPercent = current*100/max;
		currentPercent /= 100.0;
		if (!verticalBar){
			int polyx[] = {xCoord,(int) (xCoord+(currentPercent*width)),(int) (xCoord+(currentPercent*width)), xCoord};
			int polyy[] = {yCoord,yCoord,yCoord+height,yCoord+height};
			currentbar = new Polygon(polyx,polyy, polyx.length);
		}else{
			int polyy[] = {yCoord+height,(int) (yCoord+(currentPercent*height)),(int)(yCoord+(currentPercent*height)),yCoord+height};
			int polyx[] = {xCoord,xCoord,xCoord+width,xCoord+width};
			currentbar = new Polygon(polyx,polyy, polyx.length);
		}
		g.setColor(barColor);
		g.fillPolygon(currentbar);
		g.setColor(Color.black);
		if (labelPositionTop == 1 && !verticalBar){
			g.drawString(label, (xCoord+width/2) - (label.length()*4), yCoord-5);
		}else if (!verticalBar && labelPositionTop == -1){
			g.drawString(label, (xCoord+width/2) - (label.length()*4), yCoord+height+15);
		}else if (labelPositionTop == 0 && !verticalBar){
			g.drawString(label, (xCoord+width/2) - (label.length()*4), (yCoord+height/2)+5);
		}else if (verticalBar){
			g.drawString(label, (xCoord+width/2)-(label.length()*4), yCoord +height+15);
		}
	}

	@Override
	public void whenClicked(int x, int y) {
		// TODO Auto-generated method stub
	}

}
