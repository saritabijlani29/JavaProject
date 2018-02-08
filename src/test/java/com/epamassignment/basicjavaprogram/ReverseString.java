package test.java.com.epamassignment.basicjavaprogram;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.testng.Reporter;

@SuppressWarnings("all")
public class ReverseString {
	
	 void stringReverse(String str) {
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			char c = str.charAt(i);
			reverse = reverse + c;
		}
		Reporter.log("Reversed String is :::" + reverse);
	}
	
	 void findOccurenceOfCharUsingMap(String str) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);	
			} else {
				map.put(c, 1);
			}
		}
		System.out.println(map);
	}
	
	 void findOccurenceOfChar(String str) {
		String temp = "";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			int count = 0;

			for (int j = 0; j < str.length(); j++) {
				if (c == str.charAt(j) && temp.indexOf(c) == -1) {
					count++;
				}
			}
			if (temp.indexOf(c) == -1) {
				temp = temp + c;
				Reporter.log("char--" + str.charAt(i) + " occur--"
						+ count);
			}
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*System.out.println("Enter string for reverse:::::");
		String str = scan.nextLine();*/
		String str = "sarita";
		ReverseString rev = new ReverseString();
		rev.findOccurenceOfCharUsingMap(str);
	}
}
