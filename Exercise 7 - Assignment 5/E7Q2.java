package me.karunarathne.CO1212.E7;

import java.util.Scanner;

public class E7Q2 {
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in) ;
        println (findSquare ()) ;
    }

    private static void println(double square) {
        System.out.println (format (square)) ;
    }

    private static String format (double number) {
        if (Math.round(number) == number) return String.valueOf(Math.round(number)) ;
        return String.valueOf(number) ;
    }

    private static double findSquare() {
        double input = scanner.nextDouble() ;
        return input * input ;
    }
}
