
// Multi-Vehicle Rental System Example
interface Rentable {
    void rent();
    void returnVehicle();
}

class Car implements Rentable {
    public void rent() { System.out.println("Car rented"); }
    public void returnVehicle() { System.out.println("Car returned"); }
}

class Bike implements Rentable {
    public void rent() { System.out.println("Bike rented"); }
    public void returnVehicle() { System.out.println("Bike returned"); }
}

class Bus implements Rentable {
    public void rent() { System.out.println("Bus rented"); }
    public void returnVehicle() { System.out.println("Bus returned"); }
}

public class MultiVehicleRentalSystem {
    public static void main(String[] args) {
        Rentable car = new Car();
        Rentable bike = new Bike();
        Rentable bus = new Bus();

        car.rent();
        bike.rent();
        bus.rent();
        car.returnVehicle();
        bike.returnVehicle();
        bus.returnVehicle();
    }
}
