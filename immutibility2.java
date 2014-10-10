public class Dollars {
    private double value;

    public Dollars(double value) {
        this.value = value;
    }

    public double getValue() {
        return this.value;
    }

    public void add_mutable(double value) {
        this.value += value;
    }

    public Dollars add_immutable(double value) {
        return new Dollars(this.value + value);
    }
}
