package cs520.module5.L1_structures;

import java.util.ArrayDeque;

public class P03_DequeDemo {

	public static void main(String[] args) {
	
		ArrayDeque<String> myDeck;
		// Create an empty deque
		myDeck = new ArrayDeque<String>();
		
		// inserting elements
		myDeck.addLast("A1"); 
		System.out.println("Deque: " + myDeck);
		myDeck.offerLast("B1");
		System.out.println("Deque: " + myDeck);
		myDeck.addFirst("C1");
		System.out.println("Deque: " + myDeck);
		myDeck.offerFirst("D1");
		System.out.println("Deque: " + myDeck);
		
		// inspecting elements at the head of the deque
		String headElement = myDeck.getFirst();
		System.out.printf("Head using getFirst(): %s\n", headElement);		
		headElement = myDeck.peekFirst();
		System.out.printf("Head using peekFirst(): %s\n", headElement);
	
		// inspecting elements at the tail of the deque
		String tailElement = myDeck.getLast();
		System.out.printf("Tail using getLast(): %s\n", tailElement);		
		tailElement = myDeck.peekLast();
		System.out.printf("Tail using peekLast(): %s\n", tailElement);
	
		// removing elements
		String removedElement = myDeck.removeFirst();
		System.out.printf("#1 Removed Head Element: %s\n", 
				removedElement);
		System.out.println("Deque: " + myDeck);
		headElement = myDeck.peekFirst();
		System.out.printf("Head using peekFirst(): %s\n", 
				headElement);
		
		removedElement = myDeck.removeLast();
		System.out.printf("#2 Removed Tail Element: %s\n", 
				removedElement);
		System.out.println("Deque: " + myDeck);
		headElement = myDeck.peekLast();
		System.out.printf("Tail using peekLast(): %s\n", 
				headElement);
	}
}
