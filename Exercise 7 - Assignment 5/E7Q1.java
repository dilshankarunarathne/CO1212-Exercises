package me.karunarathne.CO1212.E7;

import java.util.Scanner;

public class E7Q1 {
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in) ;
        println ( findMin (
                inputNumber(), inputNumber(), inputNumber()
        )) ;
    }

    private static void println(double min) {
        System.out.println (format (min)) ;
    }

    private static double findMin(double num1, double num2, double num3) {
        return Math.min(Math.min(num1, num2), num3);
    }

    private static double inputNumber() {
        return scanner.nextDouble() ;
    }

    private static String format (double number) {
        if (Math.round(number) == number) return String.valueOf(Math.round(number)) ;
        return String.valueOf(number) ;
    }
}