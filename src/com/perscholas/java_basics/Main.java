package com.perscholas.java_basics;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
	    // #1
        // Write a program that declares 2 integer variables, assigns an integer to each, and adds them together.
        // Assign the sum to a variable.
        int x = 4815;
        int y = 162342;
        int z = x + y;
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
    }
}
