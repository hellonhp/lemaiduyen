/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aloha;

import java.util.Scanner;

/**
 *
 * @author hellonhp
 */
public class Aloha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic //here//ax+b=c
        int a;
        int b;
        int c;
        int x;
        System.out.println("nhap vao gia tri cua a: ");
        Scanner xyz = new Scanner(System.in);
        a = xyz.nextInt();
        System.out.println("nhap vao gia tri cua b: ");
        b = xyz.nextInt();
        System.out.println("nhap vao gia tri cua c: ");
        c = xyz.nextInt();
        System.out.println("gia tri cua x la: ");
        x =(c-b)/a;
        System.out.println(x);
    }
    
}
