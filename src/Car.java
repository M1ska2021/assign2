public class Car extends Vehicle {
    private int doors;
    private String fueltype;

    public Car(String brand, int year, Driver driver, int doors, String fueltype) {
        super(brand, year, driver);
        this.doors = doors;
        this.fueltype = fueltype;
    }
    public void startEngine() {
        System.out.println("Car engine began");
    }
    public void stopEngine() {
        System.out.println("Car engine ended");
    }
}