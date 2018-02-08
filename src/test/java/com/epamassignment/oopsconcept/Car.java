//Encapsulation 
package test.java.com.epamassignment.oopsconcept;

public class Car {
	private String manufacturer = "rrxc";
	private int speed = 150;
	private String model = "tttt";
	private int cost = 877655;

	 String getManufacturer() {
		return manufacturer;
	}

	 void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	 String getModel() {
		return model;
	}

	 void setModel(String model) {
		this.model = model;
	}

	 int getCost() {
		return cost;
	}

	 void setCost(int cost) {
		this.cost = cost;
	}

	 int getSpeed() {
		return speed;

	}

	 void setSpeed(int speed) {
		this.speed = speed;
	}
	 
    //can use constructor in place of setters 
	/*public Car(String manufacturer, int speed, String model, int cost) {
		super();
		this.manufacturer = manufacturer;
		this.speed = speed;
		this.model = model;
		this.cost = cost;
	}*/

	public static void main(String[] args) {
		Car car = new Car();
		System.out.println("Car cost::" + car.getCost());
		System.out.println("Car Speed::" + car.getSpeed());
		System.out.println("Car Model::" + car.getModel());
		System.out.println("Car Manufacturer::" + car.getManufacturer());
	}
}
