package org.example;
import java.util.Scanner;

/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 *Copyright 2021 daniela gomez-dugan
 */
public class Quote
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the quote?");
        String quote = input.nextLine();
        System.out.println("Who said it?");
        String person = input.nextLine();
        System.out.println(person + " says, \"" + quote + "\"");
    }
}
