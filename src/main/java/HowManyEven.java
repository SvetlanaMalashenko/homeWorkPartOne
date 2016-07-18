/**
 * Created by svetlana on 18.07.16
 Write a program called HowManyEven which prints how many even digits number n has (Assumption: n>0).
 For example - per given 254698 number the program should print 4
 */
public class HowManyEven {
    public static void main(String[] args) {

        int n = 254698;
        int count = 0;
        int digit = 0;

        do {
            digit = n % 10;
            if (digit % 2 == 0) {
               count++;
            }

            n = n / 10;
        } while (n > 0);

        System.out.println(count);
    }
}
