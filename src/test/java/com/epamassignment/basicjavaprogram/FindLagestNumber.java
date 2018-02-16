package test.java.com.epamassignment.basicjavaprogram;

public class FindLagestNumber {

	public static void main(String[] args) {
		int[] value = { 8, 5, 10, 3, 2, 9,200,99};
		int temp = 0;
		for (int i = 0; i < value.length; i++) {
				temp = value[i];
			for (int j = 1; j < value.length; j++) {
				if (temp <= value[j]) {
					temp = value[j];
				}
			}
		}
		System.out.println(temp);
	}
}
