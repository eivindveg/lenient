package ninja.eivind.lenient.numbers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LenientDoubleTest {

    private LenientNumber<Double> base;

    @Before
    public void setUp() {
        base = new LenientDouble(1.5, 1);
    }

    @Test
    public void testEquals() {
        Number other = 2.5;

        assertEquals(base, other);
    }

    @Test
    public void testCompareTo() {
        Number other = 2.4;

        assertSame(base.compareTo(other), 0);
    }

    @Test
    public void testLessThan() {
        Number other = 2.4;

        assertFalse(base.lessThan(other));
        other = 3.4;
        assertTrue(base.lessThan(other));
    }

    @Test
    public void testGreaterThan() {
        Number other = 1.1;
        assertFalse(base.greaterThan(other));
        other = -1.5;
        assertTrue(base.greaterThan(other));
    }

    @Test
    public void testLessThanOrEquals() {
        Number other = 0.3;
        assertFalse(base.lessThanOrEquals(other));
        other = 0.5;
        assertTrue(base.lessThanOrEquals(other));
        other = 2.6;
        assertTrue(base.lessThanOrEquals(other));
    }

    @Test
    public void testGreaterThanOrEquals() {
        Number other = 2.6;
        assertFalse(base.greaterThanOrEquals(other));
        other = 1.6;
        assertTrue(base.greaterThanOrEquals(other));
        other = 0.4;
        assertTrue(base.greaterThanOrEquals(other));
    }
}
