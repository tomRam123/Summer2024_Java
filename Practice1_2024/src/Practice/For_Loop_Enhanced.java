package Practice;

public class For_Loop_Enhanced {
    public static void main(String[] args) {

        /**
         * Practice questions:\
         *
         * 1.print the values index even index-value
         * 2.print the values which starts with h or l
         * 3.print the values which has length more than 5
         * 4.print the values which has length greater than 5 and starts with l
         */
        String[] words = {"joy", "smile", "learning", "java", "laugh"};

        System.out.println("\nQuestion 1\n");

        for (int i = 0; i <= words.length - 1; i++) {
            if (i % 2 == 0) {
                System.out.println(words[i]);
            }
        }
        System.out.println("\nQuestion 2\n");

        for (int i = 0; i <= words.length - 1; i++) {
            if (words[i].startsWith("h") || words[i].startsWith("l")) {
                System.out.println(words[i]);
            }
        }
        System.out.println("\nQuestion 3\n");

        for (int i = 0; i <= words.length - 1; i++) {
            if (words[i].length() > 5) {
                System.out.println(words[i]);
            }
        }
        System.out.println("\nQuestion 4\n");

        for (int i = 0; i <= words.length - 1; i++) {
            if (words[i].length() > 5 && words[i].startsWith("l")) {
                System.out.println(words[i]);
            }
        }
        System.out.println("\nQuestion 5\n");
        int[] numbers = {90, 89, 78, 76, 35, 78,};
        int sumTotal = numbers[0];
        for (int i = 1; i <= numbers.length - 1; i++) {
            sumTotal += numbers[i];
        }
        System.out.println(sumTotal / numbers.length);


        double[] accountBalances = {2909.90, 98989, 989097.98, 78, 90689, 50};
        /*
        If account balance is less than 1000, print the index of the accountBalance and it's value
                              //Use:
                               1.for-loop
                               2.Enhanced for-loop
         */

        System.out.println("\nQuestion 6\n");

        System.out.println("for-loop");
        for (int i = 0; i <= accountBalances.length - 1; i++){
            if(accountBalances[i]<1000){
                System.out.println(accountBalances[i]);
                System.out.println(i);
            }
        }
        System.out.println("\nEnhanced for-loop");
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
