/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn1;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Tu
 */
public class Bai16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = scanner.nextInt();
        in(n);
    }
    
    public static void in(int n) {
        long a = 0;
        long b = 1;
        long c = 1;
        for (int i = 0; i < n; i++) {
            System.out.println(c);
            c = a + b;
            a = b;
            b = c;
        }
    }
}
