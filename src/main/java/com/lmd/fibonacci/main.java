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
        accueil();

    }

    public static void accueil() {

        IFibonacci.affichage();
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre :");
        int number = sc.nextInt();
        for (int i = 1; i <= number; i++) {
            System.out.println(IFibonacci.fibonacci(i));
        }

    }

}
