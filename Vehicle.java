public class Vehicle {
    private String brand;
    private String model;

    static {
        System.out.println("Static blook .....01");
    }

    {
        System.out.println("NonStatic block.....02");
    }

    public Vehicle() {
        System.out.println("Constructor .....01");
        brand = "Unknown";
    }

    public Vehicle(String brand, String model) {
        System.out.println("Constructor..... 02");
        this.brand = brand;
        this.model = model;
    }

    public void honk() {
        System.out.println("Method honk with no perameter......01");
    }

    public void honk(String sound) {
        System.out.println("Method honk with  perameter......02");
    }

    static {
        System.out.println("Static block....03");
    }

    public void info() {
        System.out.println("Method info.........###");
    }

    public static void main(String[] args) {
        Vehicle defaultVehicle = new Vehicle();
        defaultVehicle.honk();
        defaultVehicle.info();
        Vehicle truck = new Vehicle("Ford", "F150");
        truck.honk("Loud horn sound");
        truck.info();
    }
}