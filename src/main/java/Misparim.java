/**
 * Created by svetlana on 18.07.16
 *
 Write a program called Misparim which prints the numbers 1 to 20 as follows:
 First row - all the numbers which are multiples of 2
 Second row - all the numbers which are multiples of 3
 Third row - all the numbers which are multiples of 4
 */
public class Misparim {
    public static void main(String[] args) {

        for (int i = 1; i < 20; i++) {
            if (i % 2 == 0) {

                System.out.print(i + " ");

            }
        }

        System.out.println();

        for (int i = 1; i < 20; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }

        }

        System.out.println();

        for (int i = 1; i < 20; i++) {
            if (i % 4 == 0) {
                System.out.print(i + " ");
            }
        }
    }

}
