public class Truck extends Vehicle {
    private double capacity;
    private int axles;

    public Truck(String brand, int year,Driver driver, double capacity, int axles) {
        super(brand, year, driver);
        this.capacity = capacity;
        this.axles = axles;
    }
    public void startEngine() {
        System.out.println("Truck engine began");
    }
    public void stopEngine() {
        System.out.println("Truck engine ended");
    }
}