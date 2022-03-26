public class E6Q2 {
    public static void main (String[] args) {
        printNumbers () ;
    }

    private static void printNumbers () {
        techniqueOne () ;
        printLines ();
        techniqueTwo ();
        printLines ();
        techniqueThree ();
    }

    private static void techniqueThree() {
        int i = 10 ;
        while (true) {
            if (i > 20) break ;
            if (i == 16) {
                i ++ ;
                continue ;
            }
            if (i % 2 == 0) println (i) ;
            i ++ ;
        }
    }

    private static void techniqueTwo() {
        for (int i=10; i<=20; i+=2) {
            if (i == 16) continue ;
            if (i % 2 == 0) println (i) ;
        }
    }

    private static void techniqueOne () {
        for (int i=10; i<=20; i+=2) {
            if (i == 16) continue ;
            println (i) ;
        }
    }

    private static void println (int number) {
        System.out.println (number) ;
    }

    private static void printLines() {
        System.out.println ("--------------------------------") ;
    }
}
