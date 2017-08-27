/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn1;

import java.util.Scanner;

/**
 *
 * @author Tu
 */
public class Bai13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so: ");
        int n = scanner.nextInt();
        phanTich(n);
    }

    public static void phanTich(int n) {
        System.out.print(n + " = ");
        int m = n;
        for (int i = 2; i <= n / 2; i++) {
            while (m % i == 0) {
                System.out.print(i + " * ");
                m /= i;
            }
        }
        System.out.printf("\b\b");
    }
}
