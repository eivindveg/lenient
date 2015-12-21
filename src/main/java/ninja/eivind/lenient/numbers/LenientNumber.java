package ninja.eivind.lenient.numbers;

import ninja.eivind.lenient.Lenient;

/**
 * {@link Lenient} that mixes in the {@link Number} class for numerical wrapping
 *
 * @param <T> The {@link Number} type for which this class is {@link Lenient}
 */
public abstract class LenientNumber<T extends Number> extends Number implements Lenient<Number> {

    @Override
    public abstract boolean equals(Object other);

    /**
     * Gets this number's numeric value in its generic type.
     * Usually either {@link Number#doubleValue()}, {@link Number#intValue()} or similar.
     * @return The value of this LenientNumber
     */
    public abstract T getValue();

    @Override
    public boolean lessThan(Number other) {
        return compareTo(other) < 0;
    }

    @Override
    public boolean lessThanOrEquals(Number other) {
        int compare = compareTo(other);
        return compare <= 0;
    }

    @Override
    public boolean greaterThan(Number other) {
        return compareTo(other) > 0;
    }

    @Override
    public boolean greaterThanOrEquals(Number other) {
        return compareTo(other) >= 0;
    }
}
