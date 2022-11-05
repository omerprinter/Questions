package sampleQuestions;

public class Q03 {
    public static void main(String[] args) {
        /*
         * Interview questions…
         *
         * write a return method to reverse number
         *
         * Input : 12345 Output : 54321
         */

        int input=12345;

        System.out.println(reverseNumber(input));


    }

    public static int reverseNumber(int input) {

        int reverseNum=0;

        while (input>0){
            reverseNum=input%10+(reverseNum*10);
            input/=10;

        }


        return reverseNum;
    }

}
