package test.java.com.epamassignment.basicjavaprogram;

import java.util.LinkedList;
import java.util.Queue;

public class Stack {

	Queue<Integer> queue = new LinkedList<Integer>();

	 void pushElement(int val) {
		int size = queue.size();
		queue.add(val);
		for (int i = 0; i < size; i++) {
			int x = queue.remove();
			queue.add(x);
		}
	}

	 int popElement() {
		if (queue.isEmpty()) {
			System.out.println("No elements");
			return -1;
		}
		int x = queue.remove();
		return x;
	}

	 int topElement() {
		if (queue.isEmpty()) {
			return -1;
		}
		return queue.peek();
	}

	public static void main(String[] args) {
		Stack s = new Stack();
		s.pushElement(10);
		s.pushElement(20);
		System.out.println("Top element::" + s.topElement());
		System.out.println("Pop ::" + s.popElement());
		s.pushElement(25);
		System.out.println("Pop ::" + s.popElement());
		System.out.println("Top element::" + s.topElement());

	}

}
