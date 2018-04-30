package src.test.java.com.epamassignment.basicjavaprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindConsecutiveNumber {
	public static void main(String[] args) {
		int[] array = { 100, 4, 109, 0, 3, 2 };
		Arrays.sort(array);
		List<Integer> tempList = new ArrayList<Integer>();
		List<List<Integer>>  temp2 = new ArrayList<List<Integer>>();
		Arrays.sort(array);
		int temp = array[0]-1;
		for (int i = 0; i < array.length; i++) {
			if (temp + 1 == array[i]) {
				tempList.add(array[i]);
			}else{
				temp2.add(tempList);
				tempList = new ArrayList<Integer>();
				tempList.add(array[i]);
			}
			temp = array[i];
		}
		tempList = new ArrayList<Integer>();
		for (List<Integer> arr : temp2) {
			if(arr.size() > tempList.size()){
				tempList = arr;
			}
		}
		System.out.println(tempList);
	}
}
