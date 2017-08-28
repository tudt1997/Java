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
public class Bai21 {
    public static void main(String[] args) {
        for (int i = 100; i <= 999; i++) {
            if (tong(i) % 5 == 0) {
                System.out.print(i);
                if (i % 10 == 0)
                    System.out.print('0');
                if (i % 100 == 0)
                    System.out.print('0');
                System.out.println(dao(i));
            }
        }
    }

    private static int dao(int n) {
        int s = 0;
        while (n > 0) {
            s = s * 10 + n % 10;
            n /= 10;
        }
        return s;
    }

    private static int tong(int n) {
        int s = 0;
        while (n > 0) {
            s += n % 10;
            n /= 10;
        }
        return s;
    }
}
