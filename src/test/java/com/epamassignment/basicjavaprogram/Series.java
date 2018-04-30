package src.test.java.com.epamassignment.basicjavaprogram;

public class Series {

	private void inLinePattern(int limit) {
		int series = 0,i;
		for (i = 1; i <= limit; i++) {
			series = series * 10 + i;
			System.out.print(series);
			if (limit != i) {
				System.out.print(",");
			}
		}
	}

	public static void main(String[] args) {
		Series series = new Series();
		series.inLinePattern(5);
	}
}
