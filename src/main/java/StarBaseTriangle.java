/**
 * Created by svetlana on 18.07.16
 * Write a program called StarBaseTriangle that displays a triangle with ‘n’ star base.
 for example per n=5 triangle pattern should look like:
 *
 **
 ***
 ****
 *****
 */
public class StarBaseTriangle {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < i + 1; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
