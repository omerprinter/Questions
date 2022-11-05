package sampleQuestions;

import java.util.Arrays;

public class Q04 {
    public static void main(String[] args) {
        /*
         * create a custom return type method accepts a name as parameter
         * and prints the name as a char array
         *
         * (do not use toCharArray() method)
         *
         * Input : John
         * Output : [J, o, h, n]
         */

        String name="John";
        lettersOfTheWord(name);

    }

    public static void lettersOfTheWord(String input) {

        char[] output=new char[input.length()];
        for (int i = 0; i < input.length(); i++) {
            output[i]=input.charAt(i);
        }
        System.out.println(Arrays.toString(output));
    }

}
