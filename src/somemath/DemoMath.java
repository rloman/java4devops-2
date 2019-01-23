package somemath;

public class DemoMath {

    public static void main(String[] args) {

        for(int i = 0;i<5000;i++) {
            int thrown = (int) (1 + Math.random() * 6);
            System.out.println(thrown);
        }


        System.out.println(Math.PI);

        System.out.println(Math.pow(2,3));

        System.out.println(Math.sqrt(2));

        long afronding = Math.round(3.5);

        System.out.println(afronding);

    }
}
