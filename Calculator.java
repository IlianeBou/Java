/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculator;

import java.util.Scanner;

/**
 *
 * BOURAÏ Iliane, BDML1, Calculator, 22/09/2026
 */
public class Calculator {

    public static void main(String[] args) {
        // EXERCICE 2 : Lignes de code qui permettent de choisir l'opérateur.
        System.out.println("Please enter the operator");
        System.out.println("1) add");
        System.out.println("2) substract");
        System.out.println("3) multiply");
        System.out.println("4) divide");
        System.out.println("5) modulo");
        
        // EXERCICE 3 : Saisie de l'entier correspondant à l'opérateur par l'utilisateur.
        Scanner sc = new Scanner(System.in);
        int operateur;
        operateur = sc.nextInt();
        
        // EXERCICE 8 : On vérifie ici que l'entier saisi correspond bien à un opérateur proposé.
        if (operateur < 1 || operateur > 5) {
            System.out.println("Please choose an operator between 1 and 5");
            System.exit(0);
        }
        
        // EXERCICE 4 & 5 : On demande à l'utilisateur de choisir les deux entriers correspondants.
        System.out.println("Please enter the first number :");
        int operande1;
        operande1 = sc.nextInt();
        
        System.out.println("Please enter the second number :");
        int operande2;
        operande2 = sc.nextInt();
        
        int resultat = 0;

        // EXERCICE 6 : Calcul du résultat selon l'opérateur choisi.
        switch (operateur) {
            case 1:
                resultat = operande1 + operande2;
                break;
            case 2:
                resultat = operande1 - operande2;
                break;
            case 3:
                resultat = operande1 * operande2;
                break;
            case 4:
                resultat = operande1 / operande2;
                break;
            case 5:
                resultat = operande1 % operande2;
                break;
            default:
                // EXERCICE 7 : Affiche un message d'erreur si l'entier saisi n'est pas compris entre 1 et 5.
                System.out.println("Please choose an operator between 1 and 5");
                System.exit(0);
                break;                   
        }
        
        System.out.println("The result is : " + resultat);
    }
}
