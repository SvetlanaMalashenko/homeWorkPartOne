/**
 * Created by svetlana on 18.07.16
 * By using for loop write a program called Factorial which calculates n! and prints the result.
 */
public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        int factorial = 1;
        for(int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }
}
