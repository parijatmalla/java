package buTest;



public class BUTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findargslength(args);

		int[] anArray;
		anArray = new int[2];
		anArray[0] = 10;
		anArray[1] = 20;
		if (args.length!=0) {
			
		
			System.out.println("sum is:" + sumArray(args));
		}
		
			
		
	}

	public static int sumArray(int[] a) {
		int sum = 0;
		if (a.length <= 1) {

			System.out.println("Enough values for addition are not provided");

		}
		else {
		System.out.println("Sum of the nos:");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + ",");
			sum = sum + a[i];
		}
		}
		return sum;
	}
	public static int sumArray(String[] a) {
		int sum = 0;
		if (a.length <= 1) {

			System.out.println("Enough values for addition are not provided");

		}
		else {
		System.out.println("Sum of the nos:");
		for (int i = 0; i < a.length; i++) {

			
			System.out.println(Integer.parseInt(a[i]) + ",");
			sum = sum + Integer.parseInt(a[i]);
		
		}
		}
		return sum;
	}
	public static void findargslength(String[] args) {
		if (args.length == 0) {
			System.out.println("Args has zero element");
		} else {
			for (int i = 0; i < args.length; i++) {

				System.out.println("Args are:" + i + "=" + args[i]);
			}
		}

	}




}
