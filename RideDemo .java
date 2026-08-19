class Driver {
    String name;
    String status;

    Driver(String name) {
        this.name = name;
        status = "Available";
    }
}

class Booking {
    Driver driver;

    Booking(Driver driver) {
        this.driver = driver;
    }

    void showStatus() {
        System.out.println(driver.name + " - " + driver.status);
    }
}

class RideDemo {
    public static void main(String[] args) {
        Driver d = new Driver("Raj");

        Booking b1 = new Booking(d);
        Booking b2 = new Booking(d);

        b1.showStatus();
        b2.showStatus();

        // Change through first booking
        b1.driver.status = "Busy";

        System.out.println("\nAfter changing status:");
        b1.showStatus();
        b2.showStatus();
    }
}