package sampleQuestions;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        /*
         * Write a Java program that asks to user 2 questions Question
         * 1 = how many tea do you drink in a day? Question
         * 2 = how many sugar do you use for a glass of tea?
         *
         * Calculate how many sugar does user use as kilogram in a year and in 40 years
         * then print it on the console
         * If user doesn’t use sugar print “Good Job, less sugar more health”
         *
         * (Hint 1 sugar = 2.7 gr)
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("How many tea do you drink in a day ?");
        int tea=scan.nextInt();
        System.out.println("How many sugar do you use for a glass of tea ?");
        int sugar=scan.nextInt();

        double sugarinaYearKG=tea*sugar*365*2.77/1000;
        double sugarin40YearsKG=sugarinaYearKG*40;
        if (sugar==0){
            System.out.println("Good Job, less sugar more health :)");
        }else {
            System.out.println("Totally you use sugar in a year : "+sugarinaYearKG+" kg"+
                    "\nSugar using for 40 years : "+sugarin40YearsKG+" kg.");
        }


    }
}
