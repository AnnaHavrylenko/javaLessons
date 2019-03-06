package com.company;

public class Triangle2 {
    public static void main(String[] args) {
        int s = 10;
        int i = 0;
        int n = 0;
        int i2 = 0;
        while (i < s) {
            i++;
            n = i;
                while (i2 < s) {
                    i2++;
                    if (n <= i2) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }

            }
            i2 = 0;
            System.out.println();

        }

    }
}
