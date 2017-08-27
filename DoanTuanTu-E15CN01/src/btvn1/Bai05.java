/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn1;

/**
 *
 * @author Tu
 */
public class Bai05 {
    public static void main(String[] args) {
        in();
    }
    
    public static void in() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%d x %d = %d\t", j, i, i * j);
            }
            System.out.println();
        }
    }
}
