import java.util.Scanner;

public class E6Q3 {
    private static Scanner scanner ;

    public static void main(String[] args) {
        scanner = new Scanner(System.in) ;
        mainLoop () ;
    }

    private static void mainLoop() {
        String input = scanner.nextLine() ;
        System.out.println ( removeAs (input)) ;
    }

    private static String removeAs(String original) {
        String aRemoved = "" ;
        for (int i=0; i<original.length(); i++) {
            char currentChar = original.charAt (i) ;
            if ( currentChar == 'a' || currentChar == 'A' ) continue ;
            aRemoved = aRemoved + String.valueOf(currentChar) ;
        }

        return aRemoved ;
    }
}
