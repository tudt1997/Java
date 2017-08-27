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
public class Bai11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a = scanner.nextInt();
        System.out.print("Nhap b: ");
        int b = scanner.nextInt();
        System.out.println("Cac cap nguyen to cung nhau trong khoang " + a + " den " + b + ": ");
        for (int i = a; i < b; i++) {
            for (int j = i + 1; j <= b; j++) {
                if (ucln(i, j) == 1)
                    System.out.println(i + ", " + j);
            }
        }
    }

    public static int ucln(int a, int b) {
        if (b == 0)
            return a;
        return ucln(b, a % b);
    }
}
