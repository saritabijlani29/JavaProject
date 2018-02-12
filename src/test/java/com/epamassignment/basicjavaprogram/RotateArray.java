package test.java.com.epamassignment.basicjavaprogram;

public class RotateArray {

	private  void rotateLeft(int arr[], int rotateBy) {
		int i;
		for (i = 0; i < rotateBy; i++) {
			rotateLeftByOne(arr);
		}
	}

	private void rotateLeftByOne(int arr[]) {
		int i, temp;
		temp = arr[0];
		for (i = 0; i < arr.length - 1; i++)
			arr[i] = arr[i + 1];
		arr[i] = temp;
	}
	
	private  void printArray(int arr[]) {
		for (int value : arr) {
			//Reporter.log(value+ " ");
			System.out.print(value+ " ");
		}
	}
			
	public static void main(String[] args) {
		RotateArray rotate = new RotateArray();
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		rotate.rotateLeft(arr, 2);
		rotate.printArray(arr);
	}
}
