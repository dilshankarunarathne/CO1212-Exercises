import java.util.Scanner;
import java.lang.Math;

public class E3Q4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print ("Enter a floating point number : ") ; 
            float c = Float.valueOf( scanner.nextLine() ) ;

            System.out.println (c + " rounded to integer " + (Math.round(c))) ; 
        }
    }
}
