import java.util.Scanner;

public class E3Q5 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print ("Enter the first integer : ") ; 
            int x = Integer.valueOf( scanner.nextLine() );
            System.out.print ("Enter the second intege : ") ; 
            int y = Integer.valueOf( scanner.nextLine() );

            System.out.println ("Sum= " + (x+y)) ;
            System.out.println ("Difference = " + (x-y)) ;
            System.out.println ("Product = " + (x*y)) ;
            System.out.println ("Average = " + ((x+y)/2)) ;
            // System.out.println ("Distance = " + ( Math.sqrt(x^2 + y^2) )) ;
            System.out.println ("Distance = " + (x-y)) ;
        }
    }
}
