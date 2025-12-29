public class Main {
    public static void main(String[] args) {
        Driver driver1 = new Driver("Cristiano Ronaldo", "SIUU570");
        Driver driver2 = new Driver("Oleksandr Kostyliev", "NAVI924");

        Vehicle car = new Car("Changan", 2020, driver1, 4, "Petrol");
        Vehicle motorcycle = new Motorcycle("Ural", 1980, driver2, true);
        Vehicle truck = new Truck("Mercedes", 2023, driver1, 15, 10);

        Vehicle[] vehicles = {car, motorcycle, truck};
        for (Vehicle v : vehicles) {
            v.startEngine();
            v.displayInfo();
            v.getDriver().Driverinformation();
            v.stopEngine();
            System.out.println("=======================");
        }
    }
}