package Homework;

public class Homework_5 {
    public static void main(String[] args) {
        /**
         * Q1:
         * Create the abbreviation for the sentence
         *
         * make america great again --> MAGA
         * good morning --> GM
         *
         */
        System.out.println("\nCreate the abbreviation for the sentence");
        String preWord = "make america great again";
        String[] wordSpit = preWord.split(" ");
        String wordAbv = "";

        for (int i = 0 ; i <= wordSpit.length-1 ; i++){
            wordAbv += wordSpit[i].substring(0,1).toUpperCase();
        }
        System.out.println("sentence \"" + preWord + "\" abbreviation --> " + wordAbv );



        /**
         * Q2:
         * Change the given sentence in titlecase
         *
         * gooD moRniNG --> Good Morning
         * tHanK yOu --> Thank You
         *
         */
        System.out.println("\nChange the given sentence in titlecase");

        String wordPreFixed = "gooD moRniNG";
        String[] wordPFSplit = wordPreFixed.split(" ");
        String wordTitleCase = "";

        for (int i = 0 ; i <= wordPFSplit.length-1 ; i++) {
            wordTitleCase += " " + wordPFSplit[i].substring(0,1).toUpperCase() + wordPFSplit[i].substring(1).toLowerCase();
        }
        System.out.println("senteence \"" + wordPreFixed + "\" in titlecase --> " + wordTitleCase);

        /**
         * Q3:
         * Reverse a String
         *
         * Learn More --> More Learn
         * happy birthday to you --> you to birthday happy
         *
         */

        System.out.println("\nReverse a String");

        String sentence = "happy birthday to you";
        String[] sentSplit = sentence.split(" ");
        String sentRevered = "";

        for (int i = 1 ; i <= sentSplit.length ; i++){
            sentRevered += " " + sentSplit[sentSplit.length-i];
        }
        System.out.println("senteence \"" + sentence + "\" reversed --> " + sentRevered);



    }
}
