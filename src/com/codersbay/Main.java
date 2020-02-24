package com.codersbay;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Primzahl-Checker --not my solution!
        System.out.println("Enter a number:");
        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();
        boolean isPrimeNumber = false;

        for (int i = 2; i <= number/2; i++) {

            if (number % i == 0) {
                isPrimeNumber = true;
                break;
            }
        }

        if (!isPrimeNumber) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        //Römische Zahlen unvollständig
        System.out.println("Enter a number between 1 and 100:");
        Scanner sc = new Scanner(System.in);
        int romanNumeral = sc.nextInt();

        if (romanNumeral < 0 || romanNumeral > 100) {
            System.out.println("Please enter a valid number");
        } else {

        }

    }
}
