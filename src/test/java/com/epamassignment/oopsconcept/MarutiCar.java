package src.test.java.com.epamassignment.oopsconcept;

import org.testng.Reporter;

public class MarutiCar extends AbstractCar {

	@Override
	 void seater() {
		System.out.println("6 seater car");
		// use reporter log if need to print message in report
		Reporter.log("6 seater car");
	}

	  void seater(String seat) {
		System.out.println(seat + "::::seater car");
		// use reporter log if need to print message in report
		Reporter.log(seat + "::::seater car");
	}

	public static void main(String[] args) {
		MarutiCar car = new MarutiCar();
		car.seater();
		car.start();
		car.seater("5");
	}
}
