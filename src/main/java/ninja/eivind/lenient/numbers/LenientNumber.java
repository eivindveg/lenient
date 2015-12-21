package ninja.eivind.lenient.numbers;

import ninja.eivind.lenient.Lenient;

/**
 * {@link Lenient} that mixes in the {@link Number} class for numerical wrapping
 * @param <T> The {@link Number} type for which this class is {@link Lenient}
 */
public abstract class LenientNumber<T extends Number> extends Number implements Lenient<Number> {

    public abstract boolean equals(Object other);
}
