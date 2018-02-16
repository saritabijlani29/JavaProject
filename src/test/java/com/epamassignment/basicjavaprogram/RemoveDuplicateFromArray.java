package test.java.com.epamassignment.basicjavaprogram;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateFromArray {
	public static void removeDuplicate() {
		char[] value = { 'a', 'b', 'h', 'a', 'h', 'a' };
		List<Character> ls = new ArrayList<Character>();
		for (int i = 0; i < value.length; i++) {
			if (!ls.contains(value[i])) {
				ls.add(value[i]);
			}
		}
		System.out.println(ls);
	}

	public static void findDuplicate() {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 8, 8, 9, 10, 11, 12, 13, 14, 15, 16, 16, 17, 18, 19, 20, 21, 22, 23 };

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					System.out.println(array[i]);
				}
			}
		}

	}
	public static void main(String[] args) {
		removeDuplicate();
		findDuplicate();
	}
}