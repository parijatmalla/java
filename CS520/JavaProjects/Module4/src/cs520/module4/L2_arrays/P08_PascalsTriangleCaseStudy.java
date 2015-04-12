package cs520.module4.L2_arrays;
import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class P08_PascalsTriangleCaseStudy extends JFrame {

	// instance variable to hold the data
	private int[][] data;
	
	public P08_PascalsTriangleCaseStudy() {
		super("Pascal's Triange");
		String input = 
			JOptionPane.showInputDialog("Enter number of rows");
		int n = Integer.parseInt(input);
		data = createDataArray(n);
	}
	
	// create the irregular array and compute the values
	private  int[][] createDataArray(int n) {
		int [][] values = new int[n][];
		for (int row = 0; row < n; row++)
		{
			values[row] = new int[row+1];
			values[row][0] = 1;
			values[row][row] = 1;
			for (int col = 1; col < row; col++)
			{
				/* each interior value is the sum of the 
				two values in the previous row
				*/
				values[row][col] = 
					values[row-1][col-1] + values[row-1][col];
			}
		}
		return values;
	}

	// The drawings in the graphics context
	public void paint( Graphics g ) 
	{
		
		super.paint(g);	
		
		int startX = 200;
		int yPos = 100;
		
		for (int row = 0; row < data.length; row++)
		{
			for (int col = 0; col < data[row].length; col++)
			{
				int xPos = startX + col * 30;
				g.drawString(Integer.toString(data[row][col]), 
						xPos, yPos);
			}
			startX -= 15;
			yPos += 20;
		}
	}
	
	public static void main(String[] args) {
	
		P08_PascalsTriangleCaseStudy app = 
			new P08_PascalsTriangleCaseStudy();
		app.setSize(500, 500);
		app.setVisible(true);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
