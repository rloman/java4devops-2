package demos;

public class Arrays {

    public static void main(String[] args) {

        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 15;


        System.out.println(numbers[0]);
        System.out.println(numbers[2]);

        int[] andereNumbers = new int[]{0,1,1,2,3,5,8,13,21,34,55,89,144};

        System.out.println(andereNumbers[12]);
//        System.out.println(andereNumbers[13]);

        // analoog aan dit met Strings

        String[] names = new String[]{"Wyte Jan", "Arnoud", "Anne-Dirk"};

        System.out.println(names[2]);

        System.out.println(names.length);

        loop1();
        loop2();
    }

    public static void loop1() {

        // declaratie    vulling met 0
        int[] numbers = new int[5];



        // hier vul ik de Array met kwadraten
        for(int i = 0;i<numbers.length;i++) {
            numbers[i] = i * i;
        }


        // hier print ik de inhoud van de array
        for(int i = 0;i<numbers.length;i++) {
            System.out.println(numbers[i]);
        }
    }

    public static void loop2() {
        String[] names = new String[]{"Joop", "Victorien", "Klaske"};

        //foreach ... enhanced for
        for(String eenNaam: names){
            System.out.println(eenNaam);
        }
    }


}
