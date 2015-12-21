package ninja.eivind.lenient;

/**
 * This interface denotes that the implementation is @{link Comparable} to an extent that allows a difference to be
 * equal
 * @param <T> The type for which this {@link Comparable} is lenient
 */
public interface Lenient<T> extends Comparable<T> {

    /**
     * Replacement method for '&lt;' operator
     * @param other the object to compare to
     * @return true if this object is less than the other, false if not
     */
    boolean lessThan(T other);

    /**
     * Replacement method for '&lt;=' operator
     * @param other the object to compare to
     * @return true if this object is less than or equal to the other, false if greater than
     */
    boolean lessThanOrEquals(T other);

    /**
     * Replacement method for '&gt;' operator
     * @param other the object to compare to
     * @return true if this object is greater than the other, false if not
     */
    boolean greaterThan(T other);

    /**
     * Replacement method for '&gt;=' operator
     * @param other the object to compare to
     * @return true if this object is greater than or equal to the other, false if less than.
     */
    boolean greaterThanOrEquals(T other);
}
