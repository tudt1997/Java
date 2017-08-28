package btvn1;

import java.util.Scanner;

/**
 *
 * @author Tu
 */
public class Bai19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double c = scanner.nextDouble();
        double pi = 0;
        int sign = 1;
        int i = 0;
        while (1.0 / (2 * i + 1) > c) {
            pi += (double) sign / (2 * i + 1);
            sign = -sign;
            i++;
        }
        pi *= 4;
        System.out.println(pi);
    }
}
