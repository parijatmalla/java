package cs520.module6.L1_threads;

	public class P01_HelloThread extends Thread {
	
		// Default constructor
		public P01_HelloThread() {
			
		}
		
		// Constructor with a name argument
		public P01_HelloThread(String name) {
			super(name);
		}
		
		// executed when the thread is started
		public void run() {
			for (int i = 1; i <= 5; i++) {
				System.out.printf("Hello %d from %s\n", 
						i, this.getName());			
			}
		}
		
		// create and start the threads
		public static void main(String[] args) {
			Thread t1 = new P01_HelloThread("Thread1");
			Thread t2 = new P01_HelloThread("Thread2");
			t1.start();
			t2.start();
		}
	}
	
