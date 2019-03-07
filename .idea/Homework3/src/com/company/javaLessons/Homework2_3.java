package com.company.javaLessons;

import java.util.Scanner;

public class Homework2_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number in pounds: ");
        double pounds = input.nextDouble();

        double grams = pounds*453.6;
        System.out.println(grams);

        int kilograms = (int)(grams/1000);
        System.out.println(kilograms);

        grams = grams - kilograms*1000;
        System.out.println(grams);

        System.out.print(pounds + " pounds are " + kilograms + " killograms" + " " + (int)grams + " grams");
    }
}