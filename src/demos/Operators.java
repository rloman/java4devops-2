package demos;

import java.time.LocalDateTime;

public class Operators {

    public static void main(String[] args) {

        System.out.print("Hello world!");
        int leeftijd = 50;

        leeftijd = leeftijd + 1;

        leeftijd = leeftijd / 2;

        leeftijd = leeftijd + 1;
        leeftijd++;
        ++leeftijd;

        leeftijd = 25;

        System.out.println(leeftijd++);
        // leeftijd is hier 26

        System.out.println(++leeftijd);
        // print 27
        // verhoogt hem eerst, en dan print ie

        System.out.println(leeftijd);
        leeftijd++;
        leeftijd = -leeftijd;
        String label = leeftijd < 50 ? "Junior" : "Senior";
        System.out.println(label);

        leeftijd = leeftijd + 3;
        leeftijd = leeftijd + 4;

        leeftijd += 4;
        leeftijd -= 4;
        leeftijd /= 4;
        leeftijd *= 4;

        System.out.println(leeftijd);

        // for Leontine
        LocalDateTime now = LocalDateTime.now();

        int minutes = now.getMinute();
        int hours = now.getHour();

        System.out.println(hours);
        System.out.println(minutes);

        System.out.println(hours * 60 + minutes);

        System.out.printf("Het is dan: %02d:%02d%n", hours, minutes);




    }
}
