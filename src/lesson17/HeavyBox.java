package lesson17;

public class HeavyBox extends Box implements Comparable<HeavyBox> {
    private int weight;

    public HeavyBox() {
    }

    public HeavyBox(int width, int height, int depth, int weight) {
        super(width, height, depth);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(HeavyBox box) {
        int result = this.width - box.getWidth();
        if (result != 0) {
            return result;
        }
        return this.weight - box.getWeight();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HeavyBox heavyBox = (HeavyBox) o;

        return weight == heavyBox.weight;
    }

    @Override
    public int hashCode() {
        return weight;
    }

    @Override
    public String toString() {
        return "HeavyBox weight=" + weight + ", " + super.toString();
    }
}
