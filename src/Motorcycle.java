public class Motorcycle extends Vehicle {
    private boolean hassidecart;

    public Motorcycle(String brand, int year, Driver driver, boolean hassidecart) {
        super(brand, year, driver);
        this.hassidecart = hassidecart;
    }
    public void startEngine() {
        System.out.println("Motorcycle engine began");
    }
    public void stopEngine() {
        System.out.println("Motorcycle engine ended");
    }
}