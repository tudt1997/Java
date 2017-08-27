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
public class Bai03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cao = scanner.nextInt();
        in(cao);
    }
    
    public static void in(int cao) {
        for (int i = 0; i < cao; i++) {
            for (int j = 0; j < cao - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
