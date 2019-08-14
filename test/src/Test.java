/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author hellonhp
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Hello World");
        int a = 5;
        int p = 6;
        char b = 'c';
        String c = "Le Duc Thang";
        float d = 3.15f;
        double e = 3.15;
        boolean f = false;

        //
        //+ - * / %
        System.out.println("Le DUc Thang "+ a);
        int g;
        Scanner thang = new Scanner(System.in);
        System.out.println("nhap vao gia tri cua G:");
        g = thang.nextInt();
        System.out.println("Gia tri vua nhap la :"+ g);

    }

}
