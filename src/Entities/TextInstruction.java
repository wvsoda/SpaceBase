package Entities;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class TextInstruction extends Entity {

	public String text;
	int textSize;
	public TextInstruction(int x, int y, double angel, String img, String txt, int txtsize) {
		super(x, y, 0, 0, angel, img);
		text = txt;
		textSize = txtsize;
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
