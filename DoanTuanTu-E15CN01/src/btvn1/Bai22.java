/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn1;

/**
 *
 * @author Tu
 */
public class Bai22 {
    public static void main(String[] args) {
        for (int i = 100; i <= 999; i++) {
            if (i % 10 != 0 && kt(i)) {
                System.out.print(i);
                System.out.println(dao(i));
            }
        }
    }

    public static int dao(int n) {
        int s = 0;
        while (n > 0) {
            s = s * 10 + n % 10;
            n /= 10;
        }
        return s;
    }

    public static boolean kt(int n) {
        int s;
        while (n > 0) {
            s = n % 10;
            if (s % 2 == 0)
                return false;
            n /= 10;
        }
        return true;
    }
}
