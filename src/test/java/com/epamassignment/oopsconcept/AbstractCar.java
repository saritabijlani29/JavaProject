package test.java.com.epamassignment.oopsconcept;

import org.testng.Reporter;

public abstract class AbstractCar {

	abstract void seater();

	protected void start() {
		System.out.println("Start car");
		// use reporter log if need to print message in report
		Reporter.log("Start car");
	}

	protected void stop() {
		System.out.println("Stop car");
		// use reporter log if need to print message in report
		Reporter.log("Stop car");
	}
}
