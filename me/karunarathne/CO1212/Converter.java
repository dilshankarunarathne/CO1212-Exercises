package me.karunarathne.CO1212;

import java.util.Scanner;

public class Converter {
    private static Scanner scanner ;

    public static void main(String[] args) {
        scanner = new Scanner(System.in) ;
        while (true) {
            if (! mainLoop()) break ;
        }
    }

    private static boolean mainLoop() {
        print ("Enter a decimal number > ") ;
        double input = readInput () ;
        print (input + " in binary is : " + toBinary (input)) ;
        return askAgain () ;
    }

    private static boolean askAgain() {
        print ("Would you like to convert another (Y/N) > ") ;
        return scanner.nextLine().equalsIgnoreCase("Y") ;
    }

    private static double toBinary(double input) {
        String binaryString = "" ;
        double x = input ;
        while (true) {
            if (x==0) break ;
            int rem = (int) (x%2);
            binaryString = rem + binaryString ;
            if (rem==1) {
                x -- ;
            }
            x /= 2 ;
        }

        return Double.parseDouble(binaryString) ;
    }

    private static double readInput() {
        return scanner.nextDouble() ;
    }

    private static void print(String s) {
        System.out.print (s) ;
    }
}