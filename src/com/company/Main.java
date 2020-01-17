package com.company;

public class Main {

    public static void main(String[] args) {
        char[] ABS = new char[33];
        int a = 1072, ya = 1103, counter = 0, space = 2;

        for (int i = a; i <= ya; i++) {
            ABS[counter] = (char)i;
            System.out.printf("  " + ABS[counter] + "  ");
            counter++;
        }

        System.out.printf("\n");

        for (int i = a; i <= ya; i++) {
            System.out.printf(i + " ");
        }
    }
}
