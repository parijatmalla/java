package cs520.hw4;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

import java.util.Random;

public class Legos2 extends JFrame {
	private int startX;
	private int startY;
	private int legoWidth;
	private int legoHeight;
	private int baseLength;

	public Legos2() {
		super("Malla's LEGOs 2"); // Window title;
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

		Color[] colorArray = { Color.red, Color.blue, Color.yellow,
				Color.green, Color.pink, Color.black, Color.magenta,
				Color.orange, Color.cyan };
		int colorElement;

		Random randomColor = new Random();

		// to store color of previous rectangle
		int previousColor = 0;

		// loop to draw rectangles in vertical order
		for (int j = 0; j < baseLength; j++) {

			// to draw rectangles with alternate red-blue color in any
			// horizontal row
			// for first row there would be all the rectangles, but as we go up
			// in the legos the number of rectangles in a row decreases, so the
			// maximum value of i is set baseLength-j so that with increase in
			// height of lego, the number of rectangles in each row decreases

			// int k=colorArray.length;
			for (int i = 0; i < baseLength - j; i++) {
				// do-while loop to keep generating random number if color of
				// previous rectangle is same as new color
				do {
					// generate color randomly
					colorElement = randomColor.nextInt(colorArray.length);
				} while (previousColor == colorElement);
				g.setColor(colorArray[colorElement]);
				// store previous color
				previousColor = colorElement;
				// Draw Filled rectangle and square
				// using arcwidth and archeight as 2
				g.fillRoundRect(
						(startX + (legoWidth * i) + j * (legoWidth / 2)),
						startY - (legoHeight * j), legoWidth, legoHeight, 2, 2);
			}
		}
	}

	public static void main(String[] args) {
		Legos2 lg = new Legos2();
		lg.setSize(550, 325);
		lg.setVisible(true);
		lg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
