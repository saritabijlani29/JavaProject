package src.test.java.com.epamassignment.basicjavaprogram;

import java.util.LinkedList;

@SuppressWarnings("all")
public class FindMiddleElementOfLinkedList {
	public static void main(String[] args) {
		LinkedList ls = new LinkedList();

		ls.add("hello");
		ls.add(1);
		ls.add("xyz");
		ls.add(2);
		ls.add("World");
		ls.add("3");
		System.out.println("size ::" + ls.size()/2 +1);
		if(ls.size()%2 == 0){
			int newSize = ls.size()/2 ;
			System.out.println(newSize);
			System.out.println("Middle Element:: "+ls.get(newSize-1));
			System.out.println("Middle Element:: "+ls.get(newSize));
		}else{
			System.out.println("Middle Element::: "+ls.get(ls.size()/2));
		}
	}
}
