/**
 * Created by ronald on 19-9-2019.
 */
 
package com.mycompany.app;

public class CalculationApp {
    public static void main(String argv[]) {
        Calculations cocker = new Calculations(); // according to Edward Cocker
        System.out.println(cocker.product(4, 7));
        System.out.println(cocker.sum(12, 33));
        System.out.println(cocker.square(23));
    }
}
