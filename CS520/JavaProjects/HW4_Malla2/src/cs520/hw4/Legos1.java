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
		// by setting the baselength the height of the lego can be changed
		this.baseLength = 10;
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		int X, Y;
		X = startX;
		Y = startY;

		// loop to draw rectangles in vertical order
		for (int j = 1; j <= baseLength; j++) {
			boolean colorRed = true;
			// to draw rectangles with alternate red-blue color in any
			// horizontal row
			// for first row there would be all the rectangles, but as we go up
			// in the legos the number of rectangles in a row decreases, so the
			// maximum value of i is set baseLength-1-j so that with increase in
			// height of lego, the number of rectangles in each row decreases
			for (int i = 1; i <= baseLength + 1 - j; i++) {

				if (colorRed == true) {

					g.setColor(Color.RED);
					// to change the color of rectangle to blue
					colorRed = false;
				} else {
					g.setColor(Color.BLUE);
					// if color of rectangle has been changed to blue, for next
					// rectangle it needs to be changed to red so colorRed is
					// set to true
					colorRed = true;
				}

				// Draw Filled rectangle and square
				//using arcwidth and archeight as 2
				g.fillRoundRect(X, Y, legoWidth, legoHeight, 2, 2);
				X = X + legoWidth;// move X to new X position

			}
			// move Y to new position to draw rectangles in next row
			Y = Y - legoHeight;

			// move X to new position to start drawing the rectangles from the
			// center of first rectangle in previous row
			X = startX + (j) * legoWidth / 2;
			// startX=X;
		}
	}

	public static void main(String[] args) {
		Legos1 lg = new Legos1();

		lg.setSize(550, 325);
		lg.setVisible(true);

		lg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
