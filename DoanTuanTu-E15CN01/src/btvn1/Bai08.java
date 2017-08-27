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
public class Bai08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = scanner.nextInt();
    }
    
    public static void tinh(int n) {
        double s = 0;
        for (int i = 1; i <= n; i++) {
            s += 1.0 / i;
        }
        System.out.println("s = " + s);
    }
}
