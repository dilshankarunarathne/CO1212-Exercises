import java.util.Scanner;

public class E3Q3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print ("Enter inches : ") ; 
            double in = Double.valueOf( scanner.nextLine() ) ;

            /*
                1 m = 39.3701 inch
                1 inch = (1 / 39.3701) m ~ 0.0254 m
            */
            System.out.println (in + " in meters : " + (in*0.0254)) ; 
        }
    }
}
