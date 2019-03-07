package com.company.javaLessons;

import java.util.Scanner;

public class Homework2_4 {
    public static void main (String args[])
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Principle (amount):  ");
        double principle = in.nextDouble();

        System.out.print("Enter Rate:  ");
        double rate = in.nextDouble();

        System.out.print("Enter month quantity:  ");
        double month = in.nextDouble();

        double time = 12/month;

        double interest  = principle *
                (Math.pow((rate / 100), time));

        System.out.println("Interest is "+ interest);
    }
}
