/**
 * Created by ronald on 19-9-2019.
 */

package com.mycompany.app;

import static org.junit.Assert.*;

public class CalculationAppTest {
    Calculations calculator = new Calculations();
    int a=10; // attribute of the calculations
    int b=14; // attribute of the calculations

    @org.junit.Test
    public void testProduct() {
        int result = calculator.product(a, b);
        assertTrue(result == 140);
        a=25;
    }

    @org.junit.Test
    public void testSum() {
        int result = calculator.sum(a, b);
        assertTrue(result == 24);
    }

    @org.junit.Test
    public void testSquare() {
        int result = calculator.square(a);
        assertTrue(result == 100);
    }
}