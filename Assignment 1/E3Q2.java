import java.util.Scanner;

public class E3Q2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print ("Enter the temperature in Celsius : ") ;
            double c = Double.valueOf( scanner.nextLine() );

            System.out.println("Temperature in Fahrenheit \t= " + ((9.0d/5.0d) * c + 32 ));
        }
    }
}
