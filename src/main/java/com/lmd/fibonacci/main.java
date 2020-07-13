/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lmd.fibonacci;

import com.lmd.fibonacci.interfaces.IFibonacci;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class main {

    private IFibonacci Seriefibonacci;

    public static void main(String[] args) {
        IFibonacci.affichage();
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        switch (number) {
            case 1:
                afficheFibonacci();
                break;
            case 2:
                System.out.println(sontSuiteFibonacci());
                break;
            default:
                System.out.println("Au revoir");
        }

    }

    public static void afficheFibonacci() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre :");
        int number = sc.nextInt();
        for (int i = 1; i <= number; i++) {
            System.out.println(IFibonacci.fibonacci(i));
        }

    }

    public static int sontSuiteFibonacci() {
        int pgcd = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir 1er nombre :");
        int n1 = sc.nextInt();

        Scanner _sc = new Scanner(System.in);

        System.out.println("Veuillez saisir 2er nombre :");
        int n2 = sc.nextInt();

        for (int i = 1; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                pgcd = i;
            }
        }

        return (pgcd == 1 ? 1 : 0);

    }

}
