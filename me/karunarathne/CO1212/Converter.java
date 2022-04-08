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
        double input = readInput () ;
        print (input + " in binary is : " + toBinary(input, 6) ) ;
        return askAgain () ;
    }

    private static boolean askAgain() {
        print ("\nWould you like to convert another (Y/N) > ") ;
        return scanner.nextLine().equalsIgnoreCase("Y") ;
    }

    private static String pickApartDecimal (String input) {
        return input.split("\\.") [1] ;
    }

    private static String toBinary(double input, int toDecimalPlaces) {
        StringBuilder binaryString = new StringBuilder();
        double x = input ;
        while (!(x < 1)) {
            int rem = (int) (x % 2);
            binaryString.insert(0, rem);
            if (rem == 1) {
                x--;
            }
            x /= 2;
        }
        if (x==0) return binaryString.toString();

        binaryString.append(decimalPartToBinary(
                pickApartDecimal(String.valueOf(input)), toDecimalPlaces
        ));
        return binaryString.toString();
    }

    private static String decimalPartToBinary (String input, int toDecimalPlaces) {
        double x = Double.parseDouble("0." + input) ;
        StringBuilder binaryString = new StringBuilder(".");
        int count = 0 ;
        while (x != 0 && count <= toDecimalPlaces) {
            x *= 2;
            if (x >= 1) {
                binaryString.append("1");
                x--;
            } else {
                binaryString.append("0");
            }
            count++;
        }
        return binaryString.toString();
    }

    private static double readInput() {
        print ("Enter a decimal number > ") ;
        return Double.parseDouble(scanner.nextLine()) ;
    }

    private static void print(String s) {
        System.out.print (s) ;
    }
}
