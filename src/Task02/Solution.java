package Task02;

public class Solution {

    public static void main(String[] args) {

        String s = "88ikfaj12";
        System.out.println(sumOfNumbers(s));
    }

    public static int sumOfNumbers(String s) {

        int summ = 0;
        int temp = 0;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                temp = (10 * temp) + Character.getNumericValue(s.charAt(i));
            } else {
                summ += temp;
                temp = 0;
            }
        }
        return summ += temp;
    }
}
