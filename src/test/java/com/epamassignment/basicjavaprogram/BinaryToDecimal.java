package test.java.com.epamassignment.basicjavaprogram;

public class BinaryToDecimal {

	private void getDecimalFromBinary(int binary) {
		int power = 0;
		int decimal = 0;
		if (checkNumberIsBinary(binary)) {
			while (binary != 0) {
				int temp = binary % 10;
				decimal = (int) (decimal + temp * Math.pow(2, power));
				binary = binary / 10;
				power++;
			}
			System.out.println("decimal value of " + binary + " is ::::" +decimal );
		}else
			System.out.println(binary +" -- is not a binary number");
	}

	private void getDecimalValue(String binaryString) {
		try {
			System.out.println("decimal value of " + binaryString + " is ::::"
					+ Integer.parseInt(binaryString, 2));
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private boolean checkNumberIsBinary(int number) {
		int copyOfInput = number;
		while (copyOfInput != 0) {
			if (copyOfInput % 10 > 1) {
				return false;
			}
			copyOfInput = copyOfInput / 10;
		}
		return true;
	}

	public static void main(String[] args) {
		BinaryToDecimal bin = new BinaryToDecimal();
		bin.getDecimalValue("1100");
		bin.getDecimalFromBinary(1100);

	}
}
