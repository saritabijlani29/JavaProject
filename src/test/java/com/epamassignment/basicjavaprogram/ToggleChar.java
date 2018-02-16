package test.java.com.epamassignment.basicjavaprogram;

public class ToggleChar {
	public static void main(String[] args) {
		/*String[] str = "HeLlo WorlD".split("");
		for (int i = 0; i < str.length; i++) {
			if(str[i].toLowerCase() == str[i]){
				System.out.print(str[i].toUpperCase());
			}else{
				System.out.print(str[i].toLowerCase());
			}
		}*/

		String str = "HeLlo WorlD";
		for (int i = 0; i < str.length(); i++) {
			if (Character.toLowerCase(str.charAt(i)) == str.charAt(i)) {
				System.out.print(Character.toUpperCase(str.charAt(i)));
			} else {
				System.out.print(Character.toLowerCase(str.charAt(i)));
			}
		}

	}
}