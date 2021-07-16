package Task06;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scaner = new Scanner(System.in);
        String line = scaner.nextLine();
        scaner.close();
        char[] chars = line.toCharArray();

        for(int i = 0; i<chars.length; i++){
            System.out.println(doStars(chars[i]));
        }
    }

    public static String doStars(char i){

        String s = "";

        switch (i){
            case '0' -> s = "  ***  " +
                    "\n *   * "+
                    "\n*     *"+
                    "\n*     *"+
                    "\n*     *"+
                    "\n *   * "+
                    "\n  ***  ";
            case '1' -> s = "  *  "+
                    "\n **  "+
                    "\n  *  "+
                    "\n  *  "+
                    "\n  *  "+
                    "\n  *  "+
                    "\n *** ";
            case '2' -> s = " *** "+
                    "\n*   *"+
                    "\n*   *"+
                    "\n   * "+
                    "\n  *  "+
                    "\n *   "+
                    "\n*****";
            case '3' -> s = " *****"+
                    "\n*    *"+
                    "\n    * "+
                    "\n   *  "+
                    "\n    * "+
                    "\n*    *"+
                    "\n******";
            case '4' -> s ="   *  "+
                    "\n  **  "+
                    "\n * *  "+
                    "\n*  *  "+
                    "\n******"+
                    "\n   * "+
                    "\n   * ";
            case '5' -> s = " *****"+
                    "\n*    "+
                    "\n*     "+
                    "\n **** "+
                    "\n     *"+
                    "\n*    *"+
                    "\n **** ";
            case '6' -> s = "*****"+
                    "\n*   *"+
                    "\n*    "+
                    "\n*****"+
                    "\n*   *"+
                    "\n*   *"+
                    "\n*****";
            case '7' -> s =  "*****"+
                    "\n    *"+
                    "\n   * "+
                    "\n  *  "+
                    "\n *   "+
                    "\n *   "+
                    "\n *   ";
            case '8' -> s =" *** "+
                    "\n*   *"+
                    "\n*   *"+
                    "\n *** "+
                    "\n*   *"+
                    "\n*   *"+
                    "\n *** ";
            case '9' -> s =" ****"+
                    "\n*   *"+
                    "\n*   *"+
                    "\n ****"+
                    "\n    *"+
                    "\n    *"+
                    "\n    *";
        }
        return s;
    }
}


