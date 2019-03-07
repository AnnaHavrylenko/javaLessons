package com.company.javaLessons;

public class Homework3 {

    public static void main(String[] args) {
            int row = 1;
            while (row < 10) {
                int number = row;
                while (number > 0) {
                    System.out.print(number);
                    number--;
                }
                row++;
                System.out.println();
            }
    }
}
