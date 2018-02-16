package test.java.com.epamassignment.basicjavaprogram;

public class FindSumOfNumberEqualToPair {
	public static void main(String[] args) {
        int[] value = {1, 4, 45, 6, 10, -8};
        for (int i = 0; i < value.length; i++) {
        	for (int j = i+1; j < value.length; j++) {
        		if(value[i] + value[j] == 16){
    				System.out.println(value[i]);
    				System.out.println(value[j]);
    				System.out.println(value[i] + value[j]);
    				break;
    			}
			}
		}
	}
}
