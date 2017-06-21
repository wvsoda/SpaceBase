package Entities;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class textInstruction extends Entity {

	String text;
	int textSize;
	public textInstruction(int x, int y, int h, int w, double angel, String img, String txt, int txtsize) {
		super(x, y, h, w, angel, img);
		text = txt;
		textSize = txtsize;
	}

	public textInstruction(int x, int y, int h, int w) {
		super(x, y, h, w);
	}

	@Override
	public void draw(Graphics g) {
		Font def = g.getFont();
		Font f = new Font("serif", Font.PLAIN, textSize);
		g.setColor(Color.BLACK);
		g.setFont(f);
		g.drawString(text, xCoord, yCoord);
		g.setFont(def);

	}

	@Override
	public void whenClicked(int x, int y) {
		

	}

}
