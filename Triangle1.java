package com.company;

public class Triangle1 {
    public static void main(String[] args) {
        int s  = 10;
        int k = 0;
        int m = 0;
        while (k < s) {
            k++;
            m = s - k;
            while (m < s) {
                System.out.print("*");
                m++;
            }
            System.out.println();
        }
        int i = 0;
        int n = 0;
        while (i < s) {
            i++;
            n = i;
                    while (n < s) {
                        System.out.print("*");
                        n++;
                    }
            System.out.println();
        }
    }
}
