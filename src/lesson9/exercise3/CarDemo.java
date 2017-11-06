package lesson9.exercise3;

import lesson9.exercise3.com.company.details.Engine;
import lesson9.exercise3.com.company.professions.Driver;
import lesson9.exercise3.com.company.vehicles.Car;
import lesson9.exercise3.com.company.vehicles.Lorry;
import lesson9.exercise3.com.company.vehicles.SportCar;

public class CarDemo {
    public static void main(String[] args) {
        Driver driver = new Driver("Adam Smith", 35, 5);
        Engine engine = new Engine("117 л.с.", "MIVEC");
        Car car = new Car("Mitsubishi ASX", "K1", "1870 кг", driver, engine);

        Driver driverL = new Driver("Иванов Иван Иванович", 49, 30);
        Engine engineL = new Engine("316 л.с.", "M272");
        Lorry lorry = new Lorry("Mercedes-Benz Sprinter", "LCV", "3500 кг", driverL, engineL, 1500);

        Driver driverS = new Driver("Kate Smith", 26, 6);
        Engine engineS = new Engine("530 л.с.", "GTS");
        SportCar sportCar = new SportCar("Maserati Quattroporte", "F1", "1900 кг", driverS, engineS, 270);

        Car.printInfo(car, driver, engine);
        System.out.println();
        Lorry.printInfo(lorry, driverL, engineL);
        System.out.println();
        SportCar.printInfo(sportCar, driverS, engineS);

        System.out.println();
        car.start();
        car.turnRight();
        car.turnLeft();
        car.stop();
    }
}
