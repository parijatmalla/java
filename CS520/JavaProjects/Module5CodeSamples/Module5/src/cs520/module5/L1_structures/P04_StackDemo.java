package cs520.module5.L1_structures;

import java.util.Stack;

public class P04_StackDemo {

	public static void main(String[] args) {
	
		Stack<String> myStack;
		// Create an empty stack
		myStack = new Stack<String>();
		
		// inserting elements
		myStack.push("A1"); 
		System.out.println("Stack: " + myStack);
		myStack.push("B1");
		System.out.println("Stack: " + myStack);
		myStack.push("C1");
		System.out.println("Stack: " + myStack);
		myStack.push("D1");
		System.out.println("Stack: " + myStack);
		
		// inspecting elements at the top of the stack
		String topElement = myStack.peek();
		System.out.printf("Top using peek(): %s\n", topElement);		
		
		// removing elements
		String removedElement = myStack.pop();
		System.out.printf("#1 Removed Element: %s\n", removedElement);
		System.out.println("Stack: " + myStack);
		topElement = myStack.peek();
		System.out.printf("Top using peek(): %s\n", topElement);
		
		removedElement = myStack.pop();
		System.out.printf("#2 Removed Element: %s\n", removedElement);
		System.out.println("Stack: " + myStack);
		topElement = myStack.peek();
		System.out.printf("Top using peek(): %s\n", topElement);		
	}
}
