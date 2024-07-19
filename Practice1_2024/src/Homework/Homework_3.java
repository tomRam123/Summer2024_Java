package Homework;

public class Homework_3 {
    public static void main(String[] args) {
        /**
         * Q1
         * store a country name in a variable.
         * Print the nane of the country
         * Print the length of country name(NOTE: you cannot use length() from String class)
         */
        String country = "Mexico";
        System.out.println("\ncountry name --> " + country);
        System.out.println("country name length --> " + country.split("").length);

        String sentence1 = "Health was Earlier said to Be the ability of the body functioning WelL.";
        /**
         * Q2
         * Print the number of words in the sentence1-value
         */
        System.out.println("\nsentence1 --> " + sentence1);
        System.out.println("number of words in sentence1 --> " + sentence1.split(" ").length);

        /**
         * Q3
         * Create the abbreviation for 4-words
         *
         * make america great again
         * new york city
         * Los Angeles Police Department
         * talk to you later
         */

        String sentenceMAGA = "make america great again";
        String[] mAGASplit = sentenceMAGA.split(" ");
        String mAGAAbv = mAGASplit[0].substring(0,1).toUpperCase() + mAGASplit[1].substring(0,1).toUpperCase() +
                         mAGASplit[2].substring(0,1).toUpperCase() + mAGASplit[3].substring(0,1).toUpperCase();

        String sentenceNYC = "new york city";
        String[] nycSplit = sentenceNYC.split(" ");
        String nycAbv = nycSplit[0].substring(0,1).toUpperCase() + nycSplit[1].substring(0,1).toUpperCase() +
                        nycSplit[2].substring(0,1).toUpperCase();

        String sentenceLAPD = "Los Angeles Police Department";
        String[] lapdSplit = sentenceLAPD.split(" ");
        String lapdAbv = lapdSplit[0].substring(0,1).toUpperCase() + lapdSplit[1].substring(0,1).toUpperCase() +
                         lapdSplit[2].substring(0,1).toUpperCase() + lapdSplit[3].substring(0,1).toUpperCase();

        String sentenceTTYL = "talk to you later";
        String[] ttylSplit = sentenceTTYL.split(" ");
        String ttylAbv = ttylSplit[0].substring(0,1).toUpperCase() + ttylSplit[1].substring(0,1).toUpperCase() +
                         ttylSplit[2].substring(0,1).toUpperCase() + ttylSplit[3].substring(0,1).toUpperCase();

        System.out.println("\nmake america great again --> " + mAGAAbv);
        System.out.println("new york city --> " + nycAbv);
        System.out.println("Los Angeles Police Department --> " + lapdAbv);
        System.out.println("talk to you later --> " + ttylAbv);
    }
}
