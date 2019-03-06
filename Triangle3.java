package com.company;

public class Triangle3 {
    public static void main(String[] args) {
        int s = 10;
        int i = 0;
        int n = 0;
        int i2 = 0;
        while (i < s) {
            i++;
            n = s - i;
            while (i2 < s) {
                if (n <= i2) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
                i2++;
            }
            i2 = 0;
            System.out.println();

        }

    }
}
