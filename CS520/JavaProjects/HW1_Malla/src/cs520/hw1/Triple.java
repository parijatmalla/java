package cs520.hw1;

/*
 * @author Parijat Malla
 * Program to generate Pythagorean triple between numbers 1 to 100.
 */

public class Triple {

	public static void main(String[] args) {

		double z = 0;
		int sumOfSquares = 0;

		int i = 1;

		System.out.println("Count" + "\tx\ty\tz");
		for (int x = 1; x <= 100; x++) {

			// loop for y starting from x+1 so that duplicate combination of
			// pythagorean triples are avoided
			//reason for y=x+1 and not y=x is because when y=x, z is sqrt(2) *x and  is never a perfect integer 
			for (int y = x + 1; y <= 100; y++) {

				// calculate sum of squares of x and y
				sumOfSquares = x * x + y * y;

				// compute square root for sum of squares of x and y

				z = Math.sqrt(sumOfSquares);

				// check if sum of the squares of x and y is equal to square of
				// integer z
				if (sumOfSquares == (int) z * (int) z) {

					System.out.println(i + ")" + "\t" + x + "\t " + y + " \t"
							+ (int) z);
					i++;

				}
			}
		}

	}

}
