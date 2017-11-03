package lesson9.exercise3.com.company.professions;

public class Driver {
    private String name;
    private int drivingExperience;

    public Driver(String name, int drivingExperience) {
        this.name = name;
        this.drivingExperience = drivingExperience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(int drivingExperience) {
        this.drivingExperience = drivingExperience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Driver driver = (Driver) o;

        if (drivingExperience != driver.drivingExperience) return false;
        return name != null ? name.equals(driver.name) : driver.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + drivingExperience;
        return result;
    }

    @Override
    public String toString() {
        return "Водитель: " + "имя - " + name + ", водительский стаж - " + drivingExperience + " лет.";
    }
}
