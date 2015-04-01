/**
 * 
 */
package cs520.hw4;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

/**
 * @author Parijat Malla
 * 
 */
public class Legos1 extends JFrame {
	private static final long serialVersionUID = 1L;
	private int startX, startY, legoWidth, legoHeight, baseLength;

	public Legos1() {
		// set title
		super("Malla's LEGOs");
		// initialize variables
		startX = 20;
		startY = 300;
		legoWidth = 50;
		legoHeight = 20;
		baseLength = 10;

	}

	@Override
	public void paint(Graphics g) {
		int arcWidth = 2, arcHeight = 2;
		Color strokeColor = Color.RED;

		for (int row = 0; row <= baseLength; row++) {
			strokeColor = Color.RED;

			for (int col = 0; col <= (baseLength - row); col++) {

				g.setColor(strokeColor);
				g.fillRoundRect(startX + (col * legoWidth)
						+ (row * legoWidth / 2), startY - (row * legoHeight),
						legoWidth, legoHeight, arcWidth, arcHeight);

				// switch color
				if (strokeColor == Color.RED) {
					strokeColor = Color.BLUE;
				} else {
					strokeColor = Color.RED;
				}

			}

		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Legos1 lg = new Legos1();
		lg.setSize(550, 325);
		lg.setVisible(true);
	}

}
