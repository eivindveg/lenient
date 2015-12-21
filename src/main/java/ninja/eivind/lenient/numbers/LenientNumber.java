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

    public abstract T getValue();

    public boolean lessThan(Number other) {
        return compareTo(other) < 0;
    }

    public boolean lessThanOrEquals(Number other) {
        return compareTo(other) <= 0;
    }

    public boolean greaterThan(Number other) {
        return compareTo(other) > 0;
    }

    public boolean greaterThanOrEquals(Number other) {
        return compareTo(other) >= 0;
    }
}
