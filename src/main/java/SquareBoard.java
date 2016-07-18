/**
 * Created by svetlana on 18.07.16
 Write a program called SquareBoard that displays the following n×n (n=5) pattern using two nested for loops.
 Your program should use only two output statements,one EACH of the followings:
 System.out.print("# "); // print # and a space, without newline
 System.out.println(); // print a newline

 Output should look like:
 # # # # #
 # # # # #
 # # # # #
 # # # # #
 # # # # #
  */
public class SquareBoard {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                System.out.print("#" + " ");
            }
            System.out.println();
        }
    }
}
