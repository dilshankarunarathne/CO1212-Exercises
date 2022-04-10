import java.util.InputMismatchException;
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
        String input = readInput () ;
        print (
                input + " in binary is : " +
                toBinary(
                        Double.parseDouble(input), 6
                )
        ) ;
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
        char type = '0' ;
        String dec = String.valueOf(input) ;

        if (dec.matches("^0+\\.\\d+$")) type = '1' ; // 0.56
        else if (dec.matches("^\\d+$")) type = '2' ; // 48
        else if (dec.matches("^[123456789]+\\d*\\.*0*$")) type = '2' ; // 48.0
        else if (dec.matches("^[123456789]+\\.\\d*[123456789]\\d*$")) type = '3' ; // 75.68
        else throw new InputMismatchException("unidentified input") ;

        return switch (type) {
            case '1' ->     // 0.88
                    "0" + decimalPartToBinary(
                            pickApartDecimal(String.valueOf(input)), toDecimalPlaces
                    );
            case '2' ->     // 56
                    wholePartToBinary(input);
            case '3' ->     // 63.78
                    wholePartToBinary(input) + decimalPartToBinary(
                            pickApartDecimal(String.valueOf(input)), toDecimalPlaces
                    );
            default -> throw new IllegalStateException("Unexpected value ");
        };
    }

    private static String wholePartToBinary (double input) {
        StringBuilder binaryString = new StringBuilder();
        while (!(input < 1)) {
            int rem = (int) (input % 2);
            binaryString.insert(0, rem);
            if (rem == 1) {
                input--;
            }
            input /= 2;
        }
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

    private static String readInput() {
        print ("Enter a decimal number > ") ;
        return scanner.nextLine() ;
    }

    private static void print(String s) {
        System.out.print (s) ;
    }
}
