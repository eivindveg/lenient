package ninja.eivind.lenient.numbers;

public class LenientDouble extends LenientNumber<Double> {

    private final Double value;
    private double variance;

    public LenientDouble(Double value, double variance) {
        super();
        if (value == null) {
            throw new NullPointerException("Value cannot be null.");
        }
        setVariance(variance);
        this.value = value;
    }

    public LenientDouble(Double value) {
        this(value, value * 0.10d);
    }

    public double getVariance() {
        return variance;

    }

    public void setVariance(double variance) {
        this.variance = Math.abs(variance);
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
        double diff = Math.abs(value - o.doubleValue());

        if(diff <= variance) {
            return 0;
        }

        return value.compareTo(o.doubleValue());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if(!(o instanceof Number)) return false;

        Number that = (Number) o;

        return compareTo(that) == 0 || value.equals(that.doubleValue());

    }

    @Override
    public Double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value.toString() + "(+/-)" + variance;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
}
