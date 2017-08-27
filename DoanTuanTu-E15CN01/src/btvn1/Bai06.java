/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn1;

import java.util.*;

/**
 *
 * @author Tu
 */
public class Bai06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so nguyen: ");
        int n = scanner.nextInt();
        sinh(n);
    }
    
    public static void sinh(int n) {
        Random random = new Random();
        int num, soBuoc = 0;
        do {
            num = random.nextInt(90) + 10;
            System.out.println("So ngau nhien la " + num);
            soBuoc++;
        }
        while (num != n);
        System.out.println("So buoc phai thuc hien: " + soBuoc);
    }
}
