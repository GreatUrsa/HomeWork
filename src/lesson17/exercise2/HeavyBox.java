package lesson17.exercise2;

public class HeavyBox extends Box6 implements Comparable<HeavyBox> {
    int weight; // вес коробки

    public HeavyBox() {
    }

    public HeavyBox(int width, int height, int depth, int weight) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(HeavyBox heavyBox) {
        int heavyBoxWeight = heavyBox.getWeight();
        return this.weight - heavyBoxWeight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HeavyBox)) return false;

        HeavyBox heavyBox = (HeavyBox) o;

        return getWeight() == heavyBox.getWeight();
    }

    @Override
    public int hashCode() {
        return getWeight();
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "weight=" + weight +
                "} " + super.toString();
    }
}
