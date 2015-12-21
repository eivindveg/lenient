package ninja.eivind.lenient.numbers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class LenientDoubleTest {

    @Test
    public void testEquals() {
        LenientDouble base = new LenientDouble(1.5, 1);
        Number other = 2.5;

        assertEquals(base, other);
    }

    @Test
    public void testCompareTo() {
        LenientDouble base = new LenientDouble(1.5, 1.1);
        Number other = 2.4;

        assertSame(base.compareTo(other), 0);
    }
}
