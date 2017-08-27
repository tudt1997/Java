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
public class Bai12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so: ");
        int n = scanner.nextInt();
        int s = tinh(n);
        System.out.println("Tong cac chu so cua " + n + " la " + s);
    }
    
    public static int tinh(int n) {
        int m = n;
        int s = 0;
        while (m > 0) {
            s += m % 10;
            m /= 10;
        }
        return s;
    }
}
