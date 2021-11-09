package com.company;

import java.util.Scanner;

public class Main {

    public static int chickensMethod() {
        Scanner input = new Scanner(System.in);
        System.out.println("Type how many chickens you have");
        int chickens = input.nextInt();
        chickens = chickens * 2;
        return chickens;
    }

    public static int cowsMethod() {
        Scanner input = new Scanner(System.in);
        System.out.println("Type how many cows you have");
        int cows = input.nextInt();
        cows = cows * 2;
        return cows;
    }

    public static int pigsMethod() {
        Scanner input = new Scanner(System.in);
        System.out.println("Type how many pigs you have");
        int pigs = input.nextInt();
        pigs = pigs * 2;
        return pigs;
    }

    public static void main(String[] args) {
        int legs = chickensMethod() + cowsMethod() + pigsMethod();
        System.out.println(legs);
    }
}

