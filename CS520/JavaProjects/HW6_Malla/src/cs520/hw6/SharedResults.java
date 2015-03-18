/*shared result.
a. The instance (or member) private variable – result (int).
b. A void addToResult method which takes the given integer argument and
adds it to the shared result. This method then prints to the console the
name of the current thread, the value it added, and the cumulative
result. Handle the synchronization issue with this method.
c. The getResult method with no arguments which returns the shared
 */

package cs520.hw6;

/**
 * @author parijatMalla
 * 
 */
public class SharedResults {
	private int result;

	/**
	 * @param numToAdd
	 */
	public synchronized void addResult(int numToAdd) {
		result += numToAdd;
		// get current threads name
		String threadName = Thread.currentThread().getName();

		// TODO: use proper formatting to print the result
		System.out.println(threadName + " is adding " + result
				+ ", Cumulative Result is " + numToAdd);
	}

	public synchronized int getResult() {
		return result;
	}
}
