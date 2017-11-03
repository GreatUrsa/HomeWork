package lesson9.exercise3;

import lesson9.exercise3.com.company.details.Engine;
import lesson9.exercise3.com.company.professions.Driver;
import lesson9.exercise3.com.company.vehicles.Car;

public class CarDemo {
    public static void main(String[] args) {
        Driver driver = new Driver("Adam Smith", 5);
        Engine engine = new Engine("117 л.с.", "MIVEC");
        Car car = new Car("Mitsubishi ASX", "K1", "1870 кг", driver, engine);

        Car.printInfo(car, driver, engine);

        System.out.println();
        car.start();
        car.turnRight();
        car.turnLeft();
        car.stop();
    }
}
