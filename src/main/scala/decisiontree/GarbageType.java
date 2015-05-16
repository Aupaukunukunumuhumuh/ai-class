package decisiontree;

/**
 * Created by azranel on 16.05.15.
 */
public enum GarbageType {
    NONE(0.0),
    GENERAL(1.0),
    WASTEPAPER(2.0),
    GLASS(3.0),
    PLASTIC(4.0);

    public double getValue() {
        return value;
    }

    private double value;
    private GarbageType(double v) {
        this.value = v;
    }
}
