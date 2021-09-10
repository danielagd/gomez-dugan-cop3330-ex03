package org.example;
import java.util.Scanner;

/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 *Copyright 2021 Daniela Gomez-Dugan
 */
public class Quote
{
    public static void main( String[] args )
    {
        // Asks user for a quote, who said it and outputs it as a statement
        Scanner input = new Scanner(System.in);

        System.out.print("What is the quote? ");
        String quote = input.nextLine();

        System.out.print("Who said it? ");
        String person = input.nextLine();

        System.out.println(person + " says, \"" + quote + "\"");
    }
}
