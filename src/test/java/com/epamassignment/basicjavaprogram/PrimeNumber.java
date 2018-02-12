package test.java.com.epamassignment.basicjavaprogram;

import org.testng.Reporter;
 
public class PrimeNumber {

	private void checkNumberisPrimeOrNot(int num) {
		boolean flag = false;
		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0) {
				flag = true;
				break;
			}
		}
		if(flag==true){
			Reporter.log(num + " -- is not a prime number");
		}else{
			Reporter.log(num + " -- is a prime number");
		}
	}

	public static void main(String[] args) {
		PrimeNumber prime = new PrimeNumber();
		prime.checkNumberisPrimeOrNot(12);
		prime.checkNumberisPrimeOrNot(3);
	}
}
