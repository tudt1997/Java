package btvn1;

import java.util.Scanner;

/**
 *
 * @author Tu
 */
public class Bai18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int a = (int) Math.ceil(Math.sqrt(m));
        int b = (int) Math.sqrt(n);
        for (int i = a; i <= b; i++) {
            System.out.println(i * i);
        }
    }
}
