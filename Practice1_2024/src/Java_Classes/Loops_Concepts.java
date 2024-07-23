package Java_Classes;

public class Loops_Concepts {
    public static void main(String[] args) {

        /**
         * Loops:
         * 1. for-loop
         * 2. Enhanced for loop
         * 3. while loop
         * 4.do-while loop
         */

        /**
         * syntax for-loop
         *
         * for (initialization ; condition ; increment ) {
         *      // code inside
         *      // for-loop
         * }
         */

        String[] words = {"joy", "smile", "learning", "java", "laugh", "health", "six", "7"};

        for (int i = 1; i <= words.length; i++) {
            System.out.println(words[words.length - i]);
        }
        System.out.println("\nreverse order again\n");

        for (int i = words.length - 1; i >= 0; i--) {
            System.out.println(words[i]);
        }

        /**
         * Enhanced for-loop (with Array/Collections)
         *
         * Syntax:
         * for(datatype varName : arrName){
         *     //code inside the for-loop
         * }
         **/
        //String[] words = {"joy", "smile", "learning", "java", "laugh"};

        for (String word : words) {
            if (word.length() > 5 && word.startsWith("l")) {
                System.out.println(word);
            }
        }
        double[] accountBalances = {2909.90, 98989, 989097.98, 78, 90689, 50};
        /*
        If account balance is less than 1000, print the index of the accountBalance and it's value
                              //Use:
                               1.for-loop
                               2.Enhanced for-loop
         */

        System.out.println("\ndown\n");

        System.out.println("for-loop");
        for (int i = 0; i <= accountBalances.length - 1; i++){
            if(accountBalances[i]<1000){
                System.out.println(accountBalances[i]);
                System.out.println(i);
            }
        }
        System.out.println("Enhanced for-loop");
        int accountBalanceAtIndex = 0;
        for (double balance : accountBalances){
            if (balance<1000){
                System.out.println(balance);
                System.out.println(accountBalanceAtIndex);
            }
            accountBalanceAtIndex++;
        }


    }
}






