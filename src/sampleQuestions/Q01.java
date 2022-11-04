package sampleQuestions;

public class Q01 {
    public static void main(String[] args) {

        /*
         * write a method which accepts a String as parameter
         * and prints the sum of the digits, present in the given string
         *
         * Input : a7de1r4d3
         * Output : 1+4+3 = 8
         *
         * Use Character.isDigit() karakter rakamsa
         *     Integer.valueOf()  icine string gelmeli
         */

        String str="a7de1r4d3";
        sumOfDigits(str);

    }
    public static void sumOfDigits(String input){
        int sum=0;

        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))){
                sum+=Integer.valueOf(""+input.charAt(i));
            }

        }
        System.out.println(sum);

    }
}
