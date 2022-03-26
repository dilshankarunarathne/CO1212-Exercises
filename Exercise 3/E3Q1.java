import java.text.DecimalFormat;

public class E3Q1 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.00000");
        
        int x = 6 ;
        int y = 4 ;

        System.out.println ("x is " + x + ", y is " + y) ;
        System.out.println ("x + y = " + (x+y)) ;
        System.out.println ("x - y = " + (x-y)) ;
        System.out.println ("x / y = " + (x/y)) ;
        System.out.println ("x % y = " + (x%y)) ;

        float a = 12.5f ;
        int b = 7 ;

        System.out.println ("a is " + a + ", b is " + b) ;
        System.out.println ("a / b = " + df.format(a/b)) ;
    }
}
