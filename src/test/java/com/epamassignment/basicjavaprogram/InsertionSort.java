package test.java.com.epamassignment.basicjavaprogram;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] value = { 3, 4, 1, 8, 9 ,5};

		for (int j = 1; j < value.length; j++) {
               int key = value[j];
               int i = j-1;
               
               while((i>-1) && (value[i]>key)){
            	   System.out.println("kk");
            	   value[i+1] = value[i] ;
            	   i--;
            	   System.out.println("inside while:: "+Arrays.toString(value));
               }
               value[i+1] = key;
		}
		System.out.println(Arrays.toString(value));
	}
}
