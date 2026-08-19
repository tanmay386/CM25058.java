class Car {

    String model = "BMW";

    static class Engine {
        String type = "Petrol";

        void displayEngine() {
            System.out.println("Engine Type: " + type);
        }
    }

    void displayCar() {
        System.out.println("Car Model: " + model);
    }
}

class CarDemo {
    public static void main(String[] args) {
        Car car = new Car();
        car.displayCar();

        // Creating static nested class object
        Car.Engine engine = new Car.Engine();
        engine.displayEngine();
    }
}