/**
 * Created by svetlana on 18.07.16
 * Write a method that gets a number from 1-10 and return the roman number sign
 */
public class RomanNumberSign {
    public static void main(String[] args) {
        int number = 10;


        System.out.println(getRomanNumber(number));
    }

    public static String getRomanNumber(int number) {
        String romanNumber;
        switch (number) {
            case 1:
                romanNumber = "I";
                break;
            case 2:
                romanNumber = "II";
                break;
            case 3:
                romanNumber = "III";
                break;
            case 4:
                romanNumber = "IV";
                break;
            case 5:
                romanNumber = "V";
                break;
            case 6:
                romanNumber = "VI";
                break;
            case 7:
                romanNumber = "VII";
                break;
            case 8:
                romanNumber = "VIII";
                break;
            case 9:
                romanNumber = "IX";
                break;
            case 10:
                romanNumber = "X";
                break;
            default:
                romanNumber = "Invalid romanNumber";
                break;
        }

        return romanNumber;
    }
}
