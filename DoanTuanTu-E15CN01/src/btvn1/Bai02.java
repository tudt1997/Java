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
public class Bai02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chieu rong: ");
        int rong = scanner.nextInt();
        System.out.print("Nhap chieu cao: ");
        int cao = scanner.nextInt();
        in(cao, rong);
        
    }
    
    public static void in(int cao, int rong) {
        for (int i = 0; i < cao; i++) {
            for (int j = 0; j < rong; j++) {
                if (i == 0 || i == cao - 1 || j == 0 || j == rong - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
