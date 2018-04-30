package src.test.java.com.epamassignment.basicjavaprogram;

public class FindLargestSumOfContinousArray {
	public static void main(String[] args) {
		int[] value = {-2, -3, 4, -1, -2, 1, 5, -3};
		int tempSum = 0;
		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < value.length; i++) {
			tempSum = tempSum + value[i];
			if (maxSum < tempSum) {
				maxSum = tempSum;
			}
			if(tempSum<0){
				tempSum =0;
			}
		}
		System.out.println(maxSum);
	}
}
