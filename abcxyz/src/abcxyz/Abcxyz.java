/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abcxyz;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author hellonhp
 */
public class Abcxyz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ax+b=0 tim x
        int a;
        int b;
        int x;
        System.out.print("nhap vao gia tri cua a: ");
        Scanner keyboard = new Scanner(System.in);
        a = keyboard.nextInt();
        System.out.print("nhap vao gia tri cua b: ");  
        b = keyboard.nextInt();
        System.out.print("=>> x= ");
        x = -b/a;
        System.out.print (x);
    }

}
