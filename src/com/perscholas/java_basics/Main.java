package com.perscholas.java_basics;

import java.awt.*;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
	    // #1
        // Write a program that declares 2 integer variables, assigns an integer to each, and adds them together.
        // Assign the sum to a variable.
        int x1 = 4815;
        int y1 = 162342;
        int z = x1 + y1;
        // Print out the result.
        System.out.println("Question 1 " + z);


        // #2
        // Write a program that declares 2 double variables, assigns a number to each, and adds them together.
        // Assign the sum to a variable.
        double a = 4.20;
        double b = 8.08;
        double c = a + b;
        // Print out the result.
        System.out.println("Question 2 " + c);


        // #3
        // Write a program that declares an integer variable and a double variable, assigns numbers to each, and adds them together.
        // Assign the sum to a variable.
        int integer = 69;
        double dbl = 7.777;
        double addedTogether = integer + dbl;
        // Print out the result. What variable type must the sum be?
        System.out.println("Question 3 (must be a double)" + addedTogether);


        // #4
        // Write a program that declares 2 integer variables, assigns an integer to each, and divides the larger number by the smaller number.
        // Assign the result to a variable.
        int someInt = 88888;
        int anotherInt = 2;
        int dividedDouble = someInt / anotherInt;
        // Print out the result.
        System.out.println("Question 4 " + dividedDouble);
        // Now change the larger number to a decimal.
        // What happens? What corrections are needed?
        double someDouble = someInt;
        // I think it still wants me to divide them???
        double anotherDividedDouble = someDouble / anotherInt;
        System.out.println("Still Question 4 " + anotherDividedDouble);



        // #5
        // Write a program that declares 2 double variables, assigns a number to each, and divides the larger by the smaller.
        // Assign the result to a variable.
        double dis = 404;
        double dat = 503;
        double dot = dat / dis;
        // Print out the result.
        System.out.println("Question 5 " + dot);
        // Now, cast the result to an integer.
        int castedInt = (int) dot;
        // Print out the result again.
        System.out.println("Still Question 5 " + castedInt);



        // #6
        // Write a program that declares 2 integer variables, x, and y, and assign 5 to x and 6 to y.
        int x = 5;
        int y = 6;
        // Declare a variable q and assign y/x to it and print q.
        int q = y/x;
        System.out.println("Question 6 " + q);
        // Now, cast y to a double and assign to q. Print q again.
        System.out.println("Still Question 6 but I cannot figure the last part...");


        // #7
        // Write a program that declares a named constant and uses it in a calculation.
        final int xxx = 666;
        int calculation = xxx * xxx;
        // Print the result.
        System.out.println("Question 7 " + calculation);



        // #8
        // Write a program where you create 3 variables that represent products at a cafe.
        // The products could be beverages like coffee, cappuccino, espresso, green tea, etc.
        // Assign prices to each product.
        double coffee = 1.50;
        double pastry = 2.50;
        double espresso = 2.00;
        System.out.println("Question 8 " + "Coffee is " + coffee + " Pastry is " + pastry + " Espresso is " + espresso);
        // Create 2 more variables called subtotal and totalSale and complete an “order” for 3 items of the first product, 4 items of the second product, and 2 items of the third product.
        // Add them all together to calculate the subtotal.
        double total = coffee + pastry + espresso;
        System.out.println("Still Question 8 total = " + total);
        // Create a constant called SALES_TAX and add sales tax to the subtotal to obtain the totalSale amount.
        // Be sure to format the results to 2 decimal places.
        double SALES_TAX = .07;
        total = total + (total * SALES_TAX);
        System.out.println("Still Question 8 total plus tax " + total);
    }
}
