package cs520.hw4;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Legos1 extends JFrame {

	private int startX;
	private int startY;
	private int legoWidth;
	private int legoHeight;
	private int baseLength;

	public Legos1() {
		super("Malla's LEGOs"); // Window title;
		this.startX = 20;
		this.startY = 300;
		this.legoWidth = 50;
		this.legoHeight = 20;
		// by setting the baselength the height of the triangle can be changed
		this.baseLength = 10;
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		// loop to draw rectangles in vertical order
		for (int j = 0; j < baseLength; j++) {
			// to draw rectangles with alternate red-blue color in any
			// horizontal row
			// for first row there would be all the rectangles, but as we go up
			// in the legos the number of rectangles in a row decreases, so the
			// maximum value of i is set baseLength-j so that with increase in
			// height of lego, the number of rectangles in each row decreases
			g.setColor(Color.RED);
			for (int i = 0; i < baseLength - j; i++) {
				// Draw Filled rectangle and square
				// using arcwidth and archeight as 2
				g.fillRoundRect((startX + (legoWidth * i) + j * (legoWidth / 2)),
						startY - (legoHeight * j), legoWidth, legoHeight, 2, 2);
				g.setColor((g.getColor() == Color.RED) ? Color.BLUE : Color.RED);
			}
		}
	}

	public static void main(String[] args) {
		Legos1 lg = new Legos1();
		lg.setSize(550, 325);
		lg.setVisible(true);
		lg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
