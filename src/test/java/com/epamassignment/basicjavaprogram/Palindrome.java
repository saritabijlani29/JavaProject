package test.java.com.epamassignment.basicjavaprogram;

public class Palindrome {

	private static void checkPalidromeString() {

		String s1 = "sarita", temp = "";
		for (int i = s1.length() - 1; i >= 0; i--) {
			temp = temp + s1.charAt(i);
		}
		if (s1 == temp) {
			System.out.println(s1 + ":: is a palindrome string");
		} else {
			System.out.println(s1 + ":: is not a palindrome string");
		}
	}

	private static void checkPalindromeNumber() {
		int num = 12321, reverseNum = 0, temp;
		temp = num;
		while (temp > 0) {
			reverseNum = reverseNum * 10 + temp % 10;
			temp = temp / 10;
		}
		if (num == reverseNum) {
			System.out.println(reverseNum + ":: is a palindrome number");
		} else {
			System.out.println(reverseNum + ":: is not a palindrome number");
		}
	}

	public static void main(String[] args) {
		checkPalidromeString();
		checkPalindromeNumber();
	}
}
