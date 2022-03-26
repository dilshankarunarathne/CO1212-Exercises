import java.util.Scanner;

public class EX05 {
    private static Scanner scanner = null ;

    public static void main(String[] args) {
        scanner = new Scanner (System.in) ;
        mainLoop () ;
    }

    private static void mainLoop() {
        double sum = 0 ;
        for (int i=0; i<5; i++) {
            sum += takeInput () ;
        }
        System.out.println ("Sum = " + sum) ;
    }

    private static double takeInput () {
        System.out.print ("Enter a number: ") ;
        double input = scanner.nextDouble() ;
        if (input > 0) return input ;
        return 0 ;
    }

}
