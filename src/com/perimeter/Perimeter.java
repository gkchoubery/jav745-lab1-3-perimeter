package com.perimeter;

import java.util.Scanner;

public class Perimeter {

    public static void main(String[] args) {
        System.out.println("Welcome user. Let's start calculating the perimeter of a rectangle!");
        System.out.println("Formula: 2(L + W)");

        // Declare and init scanner object
        Scanner scanner = new Scanner(System.in);

        // Get user inputs
        System.out.println("Enter length of rectangle");
        final double length = scanner.nextDouble();

        System.out.println("Enter width of rectangle");
        final double width = scanner.nextDouble();

        // Calculate the perimeter
        final double perimeterOfRectangle = 2 * (length + width);

        // Output
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Perimeter of rectangle: " + perimeterOfRectangle);

    }
}
