package Task04;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scaner = new Scanner(System.in);

        if (scaner.hasNextInt()){
            int a = scaner.nextInt();
            factors(a);
            scaner.close();
        }
        else {
            System.out.println("Было введено не целое число");
        }
    }

    public static void factors(int a){
        int t = 2;
        while (a > 1) {
            if (a % t == 0) {
                a = a / t;
                System.out.println(t);
            } else {
                t++;
            }
        }
    }
}
