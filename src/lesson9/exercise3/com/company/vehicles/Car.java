package lesson9.exercise3.com.company.vehicles;

import lesson9.exercise3.com.company.details.Engine;
import lesson9.exercise3.com.company.professions.Driver;

public class Car {
    private String model;
    private String carClass;
    private String weight;
    private Driver driver;
    private Engine engine;

    public Car(String model, String carClass, String weight, Driver driver, Engine engine) {
        this.model = model;
        this.carClass = carClass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public static void start() {
        System.out.println("Поехали");
    }

    public static void stop() {
        System.out.println("Останавливаемся");
    }

    public static void turnRight() {
        System.out.println("Поворот направо");
    }

    public static void turnLeft() {
        System.out.println("Поворот налево");
    }

    public static void printInfo(Car car, Driver driver, Engine engine) {
        System.out.println(car);
        System.out.println(driver);
        System.out.println(engine);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (model != null ? !model.equals(car.model) : car.model != null) return false;
        if (carClass != null ? !carClass.equals(car.carClass) : car.carClass != null) return false;
        if (weight != null ? !weight.equals(car.weight) : car.weight != null) return false;
        if (driver != null ? !driver.equals(car.driver) : car.driver != null) return false;
        return engine != null ? engine.equals(car.engine) : car.engine == null;
    }

    @Override
    public int hashCode() {
        int result = model != null ? model.hashCode() : 0;
        result = 31 * result + (carClass != null ? carClass.hashCode() : 0);
        result = 31 * result + (weight != null ? weight.hashCode() : 0);
        result = 31 * result + (driver != null ? driver.hashCode() : 0);
        result = 31 * result + (engine != null ? engine.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Автомобиль: " + "модель - " + model + ", класс автомобиля - " + carClass +
                ", вес - " + weight + ".";
    }
}
