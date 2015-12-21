package ninja.eivind.lenient;

/**
 * This interface denotes that the implementation is @{link Comparable} to an extent that allows a difference to be
 * equal
 * @param <T> The type for which this {@link Comparable} is lenient
 */
public interface Lenient<T> extends Comparable<T> {

}
