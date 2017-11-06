package lesson9.exercise3.com.company.vehicles;

import lesson9.exercise3.com.company.details.Engine;
import lesson9.exercise3.com.company.professions.Driver;

public class Lorry extends Car {
    private int carrying;

    public Lorry(String model, String carClass, String weight, Driver driver, Engine engine, int carrying) {
        super(model, carClass, weight, driver, engine);
        this.carrying = carrying;
    }

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Lorry lorry = (Lorry) o;

        return carrying == lorry.carrying;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + carrying;
        return result;
    }

    @Override
    public String toString() {
        return super.toString() + " Грузоподъёмность кузова - " + carrying + " кг.";
    }
}
