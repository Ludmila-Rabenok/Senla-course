package Task01;

public class Solution {

    public static void main(String[] args) {
        String s = "1111122222555...";
        System.out.println(numberOfTriplets(s));
    }

    public static int numberOfTriplets(String s){
        int n = 0;
        int i = 0;
        while (i < s.length()-2) {
            if (s.charAt(i) == s.charAt(i+1) && s.charAt(i) == s.charAt(i+2)){
                n++;
                i=i+2;
            }
            i++;
        }
        return n;
    }
}
