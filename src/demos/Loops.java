package demos;

public class Loops {

    public static void main(String[] args) {


        //for loop
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        int altijd = Integer.MAX_VALUE - 100;
        /*
        for(;;) {
            System.out.println(altijd);
            altijd++;
        }
        */

        // while
        int teller = 0;
        while (teller < 10) {
            System.out.println(teller++);
        }

        /*
        while(true) {
            // eeuwige loop ... zelfde als for(;;)
        }
        */

        // do while

        int aantal = 99;

        System.out.println("Starting the do ... while");

        do {
            System.out.println(aantal++);
        }
        while (aantal < 20);

        for (int i = 0; i < 20; i++) {
            if (isEven(i)) {
                System.out.println(i + " is een even getal");
            } else {
                System.out.println(i + " is een oneven getal");
            }
            /// oook wat hier onder komt...
        }

        // break gaat hier verder!

        System.out.println("Einde loops ... ");
    }

    public static boolean isEven(int n) {
        return (n % 2 == 0);
    }

}
