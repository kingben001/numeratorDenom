package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        double numerator;
        double denominator;
        System.out.println("What is your numerator?");
        numerator = keyboard.nextDouble();

        do {
            System.out.println("What is your denominator");
            denominator = keyboard.nextDouble();

         if (denominator == 0.0) {
            System.out.println("Please enter a number besides 0");
                                 }
           } while (denominator == 0);

        double total = numerator/denominator;
        System.out.println(total);

        }


        }



