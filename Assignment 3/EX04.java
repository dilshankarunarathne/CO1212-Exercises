import java.util.Scanner;

/**
 * Important: Recommended to use Java 14 for this (because of the Switch Expression)
 */
public class EX04 {
    private static Scanner scanner = null ;

    public static void main(String[] args) {
        scanner = new Scanner (System.in) ;
        mainLoop () ;
    }

    private static void mainLoop() {
        int firstNumber = readNumber (1) ;
        int secondNumber = readNumber (2) ;
        char operator = readOperator () ;

        printResult (
                createExpression (firstNumber, secondNumber, operator),
                evaluate (firstNumber, secondNumber, operator)
        ) ;
    }

    private static String createExpression (int firstNumber, int secondNumber, char operator) {
        return firstNumber + " " + operator + " " + secondNumber ;
    }

    private static void printResult (String expression, double result) {
        System.out.println ("Result of " + expression + " is " + format (result) ) ;
    }

    private static String format(double result) {
        return ((result % 1 == 0) ? String.format("%.0f", result) : String.valueOf(result)) ;
    }

    private static double evaluate (int firstNumber, int secondNumber2, char operator) {
        return switch (operator) {
            case '+' -> firstNumber + secondNumber2;
            case '-' -> firstNumber - secondNumber2;
            case '/' -> (double) firstNumber / secondNumber2;
            case '*' -> firstNumber * secondNumber2;
            case '%' -> firstNumber % secondNumber2;
            default -> 0;
        };
    }

    private static char readOperator () {
        prompt ("operator") ;
        return takeInput().charAt(0) ;
    }

    private static int readNumber (int which) {
        prompt ( (which == 1 ? "first" : "second") + " number") ;
        return Integer.parseInt( takeInput() ) ;
    }

    private static void prompt (String string) {
        System.out.print ("Enter the " + string + ": ") ;
    }

    private static String takeInput () {
        return scanner.nextLine() ;
    }
}
