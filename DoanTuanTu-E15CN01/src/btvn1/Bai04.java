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
public class Bai04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cao = scanner.nextInt();
        in(cao);
    }
    
    public static void in(int cao) {
        for (int i = 1; i <= cao; i++) {
            for (int j = 0; j < cao - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.printf(j + " ");
            }
            for (int j = i - 1; j > 0; j--) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}
