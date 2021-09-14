/**
 * UCF COP3330 Fall 2021 Assignment 20 Solution
 * Copyright 2021 Emily Radney
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scnr = new Scanner(System.in);
        String state, county;
        double order, stateTax, countyTax, totalTax, taxAmt, total;

        System.out.print("What is the order amount? ");
        order = scnr.nextDouble();
        System.out.print("What state do you live in? ");
        state = scnr.next();

        if(state.equalsIgnoreCase("Wisconsin") || state.equalsIgnoreCase("WI")) {
            stateTax = .05;

            System.out.print("What county do you live in? ");
            county = scnr.next();

            if(county.equalsIgnoreCase("Eau Claire")) {
                countyTax = .005;
            }
            else if (county.equalsIgnoreCase("Dunn")) {
                countyTax = .004;
            }
            else {
                countyTax = 0;
            }

            totalTax = stateTax + countyTax;
        }
        else if (state.equalsIgnoreCase("Illinois") || state.equalsIgnoreCase("IL")) {
            totalTax = .08;
        }
        else {
            System.out.printf("The total is $%.2f.\n", order);
            return;
        }

        taxAmt = order * totalTax;
        total = order + taxAmt;

        System.out.printf("The tax is $%.2f.\n", taxAmt);
        System.out.printf("The total is $%.2f.\n", total);
    }
}
