/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lmd.fibonacci.interfaces;

/**
 *
 * @author HP
 */
public interface IFibonacci {

   public  static  void  affichage() {

        System.out.println("Bienvenue à la serie de fibonacci et  au nombre d'or");
        System.out.println("1- Pour afficher la serie de fibonacci");
        System.out.println("2- Pour déterminer si deux nombres sont de suites fibonacci");


    }

    public static int fibonacci(int number) {

        if (number <= 1)  return number;
        
        return fibonacci(number - 1) + fibonacci(number - 2);

    }

}
