package src.test.java.com.epamassignment.oopsconcept;

public class HondaCar extends Car implements CarInterface  {
	
	 public void changeGear(int gear) {
		gear = gear + 2;
		System.out.println("Change Gear value::"+ gear);
	}

	public void speedUp(int increment) {
		increment = increment+2;
		System.out.println("Speed ::"+ increment);
	}

	public void applyBrakes(int decrement) {
		decrement = decrement-2;
		System.out.println("Applied Brakes::"+ decrement);
	}
	
	 public void colour() {
		System.out.println("car colour");
	}
	public static void main(String[] args) {
		HondaCar car = new HondaCar();
		System.out.println("Car cost::" + car.getCost());
		System.out.println("Car Speed::" + car.getSpeed());
		car.setModel("Honda");
		car.speedUp(5);
		System.out.println("Car Model::"+ car.getModel());
	}

}
