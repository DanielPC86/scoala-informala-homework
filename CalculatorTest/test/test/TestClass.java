package test;

import calculator.Calculator;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestClass {

    //testing method getMax
    @Test
    void getMax() {

        Calculator c = new Calculator(1, 2, 3);
        Integer max = c.getMax();
        assertEquals(max.intValue(), 3);
    }

    @Test
    void getMaxWithNegative() {

        Calculator c = new Calculator(1, 2, -3);
        Integer max = c.getMax();
        assertEquals(max.intValue(), 2);
    }

    @Test
    void getMaxWithNull() {

        Calculator c = new Calculator(1, 2, null);
        Integer max = c.getMax();
        assertEquals(max.intValue(), 2);
    }

    //testing method getMin
    @Test
    void getMin() {

        Calculator c = new Calculator(1, 5, 7);
        Integer min = c.getMin();
        assertEquals(min.intValue(), 1);
    }

    @Test
    void getMinWithNegative() {

        Calculator c = new Calculator(1, -2, 7);
        Integer min = c.getMin();
        assertEquals(min.intValue(), -2);
    }

    @Test
    void getMinWithNull() {

        Calculator c = new Calculator(1, 4, null);
        Integer min = c.getMin();
        assertEquals(min.intValue(), 1);
    }

    //testing method getSum
    @Test
    void getSum() {

        Calculator c = new Calculator(2, 3, 7);
        Integer sum = c.getSum();
        assertEquals(sum.intValue(), 12);
    }

    @Test
    void getSumWithNegative() {

        Calculator c = new Calculator(-2, 0, 7);
        Integer sum = c.getSum();
        assertEquals(sum.intValue(), 5);
    }

    @Test
    void getSumWithNull() {

        Calculator c = new Calculator(-2, null, 7);
        Integer sum = c.getSum();
        assertEquals(sum.intValue(), 5);
    }

    //testing method getAvg
    @Test
    void getAvg() {

        Calculator c = new Calculator(3, 3, 6);
        double avg = c.getAvg();
        assertEquals(avg, 4);
    }

    @Test
    void getAvgWithNegative() {

        Calculator c = new Calculator(-4, 1, 6);
        double avg = c.getAvg();
        assertEquals(avg, 1);
    }

    @Test
    void getAvgWithNull() {

        Calculator c = new Calculator(-4, null, 13);
        double avg = c.getAvg();
        assertEquals(avg, 3);
    }

    //testing method areAllPositive
    @Test
    void areAllPositive() {

        Calculator c = new Calculator(2, 5, 3);
        Boolean positive = c.areAllPositive();
        assertTrue(positive);
    }

    @Test
    void oneNotPositive() {

        Calculator c = new Calculator(-2, 3, 3);
        Boolean positive = c.areAllPositive();
        assertFalse(positive);
    }

    @Test
    void oneNull() {

        Calculator c = new Calculator(null, 0, 3);
        Boolean positive = c.areAllPositive();
        assertFalse(positive);
    }

    //testing method isAEven
    @Test
    void isAEven() {

        Calculator b = new Calculator(4, 3, 5);
        Boolean even = b.isAEven();
        assertTrue(even);
    }

    @Test
    void isAEvenWithNegative() {

        Calculator b = new Calculator(-4, 3, 5);
        Boolean even = b.isAEven();
        assertTrue(even);
    }

    @Test
    void isANotEven() {

        Calculator b = new Calculator(3, 3, 5);
        Boolean even = b.isAEven();
        assertFalse(even);
    }
}
