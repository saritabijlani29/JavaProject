package src.test.java.com.epamassignment.basicjavaprogram;

public class FindSubarraySumEqualToZero {
	public static void main(String[] args) {
		int[] array = { 15, -2, 2, -8, 1, 7, 10, 23 };
		String temp = "";
		for (int i = 0; i < array.length; i++) {
			int currSum = 0;
			for (int j = i; j < array.length; j++) {
				currSum = currSum + array[j];
				temp = temp + array[j] + ",";
				if (currSum == 0) {
					System.out.println(temp);
				}
			}
			temp ="";
		}
	}
}