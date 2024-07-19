package Homework;

public class Homework_2 {
    public static void main(String[] args) {
        String sentence1 ="Hello dear, how are you doing";
        int result1 = 0;
        /**
         * Store 100 in result1 if the length of sentence1 is greater than or equal to 10
         * else store 150 in result1.0
         */
        //int sentence1Length = sentence1.length();
        result1 = sentence1.length() >= 10?100:150;
        System.out.println("\nsentence1 --> Hello dear, how are you doing");
        System.out.println("if sentence1 is greater than or equal to 10 store 100 in result1 else store 150.");
        System.out.println("result1 = " + result1);


        String sentence2 = "Health was Earlier said tto Be the ability of the body functioning WEiL.";
        /**
         * replace all instances of a/A with Z
         */
        String sent2Replace_Aa_Z = sentence2.toLowerCase().replace("a","Z");
        System.out.println("\nreplace all instances of a/A with Z in sentence2");
        System.out.println("result --> " + sent2Replace_Aa_Z);

        String sentence3 = "Health was Earlier said tto Be the ability of the body functioning WEiL.";
        /**
         * Print
         * 1. The length of the sentence3-value.
         * 2. result if the sentence3 starts with "health"(ignore cases)
         * 3. result if the sentences3 contains "Body" (ignore cases)
         * 4. index of "Body" in sentence3
         */
        int sentLength = sentence3.length();
        boolean sent3Starts_HealthIgnore = sentence3.toLowerCase().startsWith("health");
        boolean sent3Contains_BodyIgnore = sentence3.toLowerCase().contains("Body");
        int sent3Index_Body = sentence3.indexOf("body".toLowerCase());

        System.out.println("\nLength of sentence3 --> " + sentLength);
        System.out.println("does sentence3 start with \"health\"? " + sent3Starts_HealthIgnore);
        System.out.println("does sentence3 contains \"Body\" ignoring cases ? " + sent3Contains_BodyIgnore);
        System.out.println("index of \"Body\" in sentence3 --> " + sent3Index_Body);





    }
}
