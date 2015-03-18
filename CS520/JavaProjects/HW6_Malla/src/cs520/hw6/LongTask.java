/**
 * 
 */
package cs520.hw6;

/**
 * @author parijatMalla
 * 
 */
public class LongTask extends Thread {
	private SharedResults sharedData;
	private int start;
	private int end;

	public LongTask(SharedResults sharedData, int start, int end) {
		super("Thread_" + start + "_" + end);
		this.sharedData = sharedData;
		this.start = start;
		this.end = end;
	}

	@Override
	public void run() {
		int accumulatedSum = 0;
		long randomTimeUpTo10MilliSecs = 0;

		// add the integer numbers from start to end (both
		// inclusive) using a for loop
		for (int i = this.start; i <= this.end; i++) {
			accumulatedSum += i;
			// sleep for a random time (up to 10 milliseconds) in each iteration
			// of the loop
			randomTimeUpTo10MilliSecs = (long) (1 + Math.random() * 10);
			try {
				Thread.sleep(randomTimeUpTo10MilliSecs);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// After the loop, invoke the addToResult method
		// of the shared object and provide this accumulated sum.
		sharedData.addResult(accumulatedSum);

	}
}
