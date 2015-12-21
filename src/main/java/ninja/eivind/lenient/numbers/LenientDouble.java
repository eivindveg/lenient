package ninja.eivind.lenient.numbers;

public class LenientDouble extends LenientNumber<Double> {

    private final Double value;
    private double variance;

    public LenientDouble(Double value, double variance) {
        super();
        if (value == null) {
            throw new NullPointerException("Value cannot be null.");
        }
        this.variance = variance;
        this.value = value;
    }

    public LenientDouble(Double value) {
        this(value, 0.5d);
    }

    public double getVariance() {
        return variance;

    }

    public void setVariance(double variance) {
        this.variance = variance;
    }

    @Override
    public int intValue() {
        return value.intValue();
    }

    @Override
    public long longValue() {
        return value.longValue();
    }

    @Override
    public float floatValue() {
        return value.floatValue();
    }

    @Override
    public double doubleValue() {
        return value;
    }

    @Override
    public int compareTo(Number o) {
        double diff = value - o.doubleValue();

        if(Math.abs(diff) < variance) {
            return 0;
        }

        return value.compareTo(o.doubleValue());
    }
}
