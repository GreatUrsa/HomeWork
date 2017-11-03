package lesson9.exercise3.com.company.details;

public class Engine {
    private String power;
    private String manufacturer;

    public Engine(String power, String manufacturer) {
        this.power = power;
        this.manufacturer = manufacturer;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Engine engine = (Engine) o;

        if (power != null ? !power.equals(engine.power) : engine.power != null) return false;
        return manufacturer != null ? manufacturer.equals(engine.manufacturer) : engine.manufacturer == null;
    }

    @Override
    public int hashCode() {
        int result = power != null ? power.hashCode() : 0;
        result = 31 * result + (manufacturer != null ? manufacturer.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Двигатель: " + "мощность - " + power + ", производитель - " + manufacturer + ".";
    }
}
