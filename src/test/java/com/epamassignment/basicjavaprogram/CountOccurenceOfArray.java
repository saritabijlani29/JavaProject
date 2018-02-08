package test.java.com.epamassignment.basicjavaprogram;

public class CountOccurenceOfArray {
	
	public static void main(String[] args) {
		CountOccurenceOfArray count = new CountOccurenceOfArray();
		char arr[] = { 'a', 'b', 'c', 'b', 'b', 'a' };
		count.countArrayChar(arr);
	}
	
	 void countArrayChar(char[] arr) {
		String temp = "";
		
		for (int i = 0; i < arr.length; i++) {
			char c = arr[i];
			int count = 0;

			for (int j = 0; j < arr.length; j++) {
				if (c == arr[j] && temp.indexOf(c) == -1) {
					count++;
				}
			}
			if (temp.indexOf(c) == -1) {
				temp = temp + c;
				System.out.println(c + "=" + count);
			}
		}
	}
}
