package btvn1;

import java.util.Scanner;

/**
 *
 * @author Tu
 */
public class Bai20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double c = scanner.nextDouble();
        double x = scanner.nextDouble();
        double ePowX = 1;
        double exponent = x;
        int factorial = 1;
        int i = 2;
        while (Math.abs(exponent / factorial) > c) {
            ePowX += exponent / factorial;
            exponent *= x;
            factorial *= i;
            i++;
        }
        System.out.println(ePowX);
    }
}
