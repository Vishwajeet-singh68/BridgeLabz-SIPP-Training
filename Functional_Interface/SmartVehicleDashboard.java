
interface Vehicle {
    void displaySpeed();

    default void displayBattery() {
        System.out.println("Battery info not available.");
    }
}

class Car implements Vehicle {
    public void displaySpeed() {
        System.out.println("Car speed: 80 km/h");
    }
}

class ElectricCar implements Vehicle {
    public void displaySpeed() {
        System.out.println("Electric car speed: 100 km/h");
    }

    @Override
    public void displayBattery() {
        System.out.println("Battery at 85%");
    }
}

public class SmartVehicleDashboard {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle ecar = new ElectricCar();

        car.displaySpeed();
        ecar.displaySpeed();
        car.displayBattery();
        ecar.displayBattery();
    }
}
