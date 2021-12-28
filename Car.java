public class Car implements Vehicle {
	String licensePlate = "6TRJ244";

	public void start() {
		System.out.println("Starting Engine...");
	}

	public void stop() {
		System.out.println("Stopping Engine...");
	}

	public static void main(String[] args) {
		Car tesla = new Car();
		tesla.start();
		System.out.println("Car Number Plate: " + tesla.licensePlate);
		tesla.blowHorn();
		tesla.stop();
	}
}