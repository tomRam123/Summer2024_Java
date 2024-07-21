package Homework;

public class Homework_4 {
    public static void main(String[] args) {
        /**
         * create an int variable and store any value in it.
         * if the number is divisible by 5, print "divisible by 5"
         * if the number is divisible by 3, print" divisible by 3"
         * if the number is divisible by 5 and by 3, print "divisible by 5 and 3"
         * if the number id NOT divisible by 5,3 or 15, print the value int-variable
         *
         * int num = 45;
         */
        
        int num = 8;
        
        if(num % 5 == 0){
            System.out.println("divisible by 5");
        } else if (num % 3 == 0) {
            System.out.println(" divisible by 3");
        } else if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("divisible by 5 and 3");
        }else {
            System.out.println("number value -> " + num);
        }


        /**
         * create two variable, one to store student-score and another to store the max-score.
         * If student-score is NOT valid, print error statement, "Invalid student score entered"
         *
         * based on the student scoring percentage, print the grade.
         *
         * Grade-A: 91-100%
         * Grade-b: 81-90.99%
         * Grade-A: 71-80.99%
         * Grade-A: 70.00%
         */

        double myScore = 75;
        int maxScore = 100;
        double myPrecentage = (myScore/maxScore) * 100;

        if (myPrecentage >= 91 && myPrecentage <=100){
            System.out.println("Grade-A");
        } else if (myPrecentage >= 81 && myPrecentage <=90.99) {
            System.out.println("Grade-B");
        } else if (myPrecentage >= 71 && myPrecentage <=80.99) {
            System.out.println("Grade-C");
        } else if (myPrecentage >= 61 && myPrecentage <=70.99) {
            System.out.println("Grade-D");
        } else if (myPrecentage < 61) {
            System.out.println("Less than 61");

        }
    }
}
