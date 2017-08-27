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
public class Bai07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = scanner.nextInt();
        int s = tinh(n);
        System.out.println("S = " + s);
    }

    public static int tinh(int n) {
        int s = 0;
        if (n % 2 == 0) {
            for (int i = 2; i <= n; i += 2) {
                s += i;
            }
        } else {
            for (int i = 1; i <= n; i += 2) {
                s += i;
            }
        }
        return s;
    }
}
