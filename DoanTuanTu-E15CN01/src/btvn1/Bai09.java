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
public class Bai09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = scanner.nextInt();
        tinh(n);
    }
    
    public static void tinh(int n) {
        int count = 0;
        System.out.println("Cac uoc cua " + n + ":");
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                System.out.print(i + ", ");
                count++;
            }
        }
        System.out.println(n);
        count++;
        System.out.println(n + " co " + count + " uoc");
    }
}
