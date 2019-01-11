public class Decision {

    public static void main(String[] args) {
        int a = 3;
        int b = 5;

        if (a > b) {
            System.out.println("a is groter dan b");
        } else {
            System.out.println("a is niet groter dan b");
        }

        if ((b != 0 || a > 5) && a > b) {
            System.out.println(" ... ");
        }
        System.out.println(a / b);

        if (a > b) {
            System.out.println("Ja");
        } else if (a != 0) {

        } else {

        }

        /*

        0-4 => Peuter
        5-6 => Kleuter
        7-12 => Schoolkind
        13-18 => Student
        19+ => Bier

         */

        int age = 7;
        String label = null;
        switch (age) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                label = "Peuter";
                break;
            case 5:
            case 6:
                label = "Kleuter";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                label = "Schoolkind";
                break;
            default:
                label = "Onbekend";
                break;

        }
        // => Hier spring ik heen na de break
        System.out.println(label);

        int b2 = 5;
        double c = Math.pow(b2, 2);

        System.out.println(Math.sqrt(2));


    }
}
