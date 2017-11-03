package lesson9.exercise3.com.company.vehicles;

import lesson9.exercise3.com.company.details.Engine;
import lesson9.exercise3.com.company.professions.Driver;

public class SportCar extends Car {
    private double speed;

    public SportCar(String model, String carClass, String weight, Driver driver, Engine engine, double speed) {
        super(model, carClass, weight, driver, engine);
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        SportCar sportCar = (SportCar) o;

        return Double.compare(sportCar.speed, speed) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(speed);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Спортивный автомобиль: " + "скорость - " + speed + ", " + super.toString();
    }
}
