package cs520.hw6;

public class TestHW6 {

	public static void main(String[] args) {
		// Create the SharedResults object and assign it to a variable.
		SharedResults sharedData = new SharedResults();

		// Create five LongTask objects by passing the above shared
		// object and the start and end values for each as (1, 100), (101, 200),
		// (201, 300), (301, 400), and (401, 500) respectively.
		// Start each thread as it is created.
		LongTask longTask1 = new LongTask(sharedData, 1, 100);
		longTask1.start();
		LongTask longTask2 = new LongTask(sharedData, 101, 200);
		longTask2.start();
		LongTask longTask3 = new LongTask(sharedData, 201, 300);
		longTask3.start();
		LongTask longTask4 = new LongTask(sharedData, 301, 400);
		longTask4.start();
		LongTask longTask5 = new LongTask(sharedData, 401, 500);
		longTask5.start();

		// Wait for all the threads to complete using the join method.
		try {
			longTask1.join();
			longTask2.join();
			longTask3.join();
			longTask4.join();
			longTask5.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			//Print the result from the shared object.
			System.out.println("Result = "+sharedData.getResult());
		}

	}

}
