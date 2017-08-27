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
public class Bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a = scanner.nextInt();
        System.out.print("Nhap b: ");
        int b = scanner.nextInt();
        System.out.println("UCLN cua " + a + " va " + b + " la " + ucln(a, b));
        System.out.println("BCNN cua " + a + " va " + b + " la " + (a * b / ucln(a, b)));
    }
    
    public static int ucln(int a, int b) {
        if (b == 0)
            return a;
        return ucln(b, a % b);
    }
}
