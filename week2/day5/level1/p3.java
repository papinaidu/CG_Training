class vehicle {
	int maxSpeed;
	String fuelType;
	vehicle(int maxSpeed, String fuelType){
		this.maxSpeed = maxSpeed;
		this.fuelType = fuelType;
	}
	void displayInfo(){
		System.out.println("maxSpeed " + maxSpeed);
		System.out.println("fuelType " + fuelType );
	}
	
}
class Car {
	int seatCapacity;
	Car(int maxSpeed, String fuelType, int seatCapacity){
		super(maxSpeed, fuelType);
		this.seatCapacity = seatCapacity;
	}
	 void displayInfo(){
		super.displayInfo();
		System.out.println("seatCapacity " + seatCapacity)
	}
}
class Truck {
	int size;
	Truck(int maxSpeed, String fuelType, int size){
		super(maxSpeed, fuelType);
		this.size = size;
	}
	void displayInfo(){
		super.displayInfo();
	System.out.println("size " + size);
	}
}
class Motorcycle {
	int mileage;
	Motorcycle(int maxSpeed, String fuelType, int mileage){
		super(maxSpeed, fuelType);
		this.mileage = mileage;
	}
	super.displayInfo();
	System.out.println("size " + size);
}
class vehicleMain {
	public static void main(String[] args){
		Car c = new Car(150, "petrol", 5);
		Truck t = new Truck(120, "diesel", 1345);
		Motorcycle m = new Motorcycle(120, "diesel", 45);
		t.displayInfo();
		m..displayInfo();
	}
}