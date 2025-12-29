public class Driver {
    private String name;
    private String licensenum;

    public Driver(String name, String licensenumber) {
        this.name = name;
        this.licensenum = licensenumber;
    }
    public void Driverinformation() {
        System.out.println("Driver-"+name+", License-"+licensenum);
    }
}