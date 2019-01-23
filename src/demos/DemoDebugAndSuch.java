package demos;

public class DemoDebugAndSuch {

    public static void main(String[] args) {

        int[] getallen = new int[]{5, 10,20};

        int sum = 0;
        for(int i = 0;i<getallen.length;i++) {
            sum += getallen[i];
        }

        System.out.println(sum);

    }
}
