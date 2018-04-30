package src.test.java.com.epamassignment.basicjavaprogram;

import java.util.Arrays;

public class ReverseArray {
	
	private void revArray() {
		int data[] = { 1, 2, 3, 4, 5,6};
		for (int i = 0; i < data.length / 2; i++) {
			int temp = data[i];
			data[i] = data[data.length - i - 1];
			data[data.length - i - 1] = temp;
		}
		//Reporter.log(Arrays.toString(data));
		System.out.println(Arrays.toString(data));
	}
	 
	 public static void main(String[] args) {
		 ReverseArray rev = new ReverseArray();
		 rev.revArray();
	}
}