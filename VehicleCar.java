class VehicleCar {
    private String make;
    private String model;
    static final int ab = 5;

    public VehicleCar(String make, String model) {

        this.make = make;
        this.model = model;
    }

    public void start() {
        System.out.println("[Vehicle] The vehicle is starting.");
    }

    public void stop() {
        System.out.println("[Vehicle] The vehicle is stopping.");
    }

    public void drive(int a) {
        System.out.println("[Vehicle] The vehicle is moving.");
    }
}

class Car extends VehicleCar {
    private int numberOfDoors;

    Car(String make, String model, int numberOfDoors) {
        super(make, model);
        this.numberOfDoors = numberOfDoors;
    }

    public void drive() {
        //super.drive();
        System.out.println("[Car] The car is moving.");
    }

    public void drive(int a) {
        //super.drive();
        System.out.println("[Car####] The car is moving.");
    }

    public void honk() {
        System.out.println("[Car] Honk! Honk!");
    }
}

class Main {
    public static void main(String[] args) {
        VehicleCar car1 = new Car("make001", "model001", 4);
        car1.drive(1);
        //car1.honk();
    }
}
