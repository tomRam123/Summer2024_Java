package Java_Classes;

public class Loops_Concept2 {
    public static void main(String[] args) {


        /**
         * while loop
         * syntax:
         * initialization
         * while (condition) {
         *     //until the code inside loop
         *     //run the code inside the loop
         *     increment/decrement
         * }double[] accountBalances = {2909.90, 98989, 989097.98, 78, 90689, 50};
         */
        double[] accountBalances = {2909.90, 98989, 989097.98, 78, 90689};
        System.out.println("\n---while loop---");

        int index = 0;
        while (index <= accountBalances.length-1) {
            if (accountBalances[index] < 1000) {
                System.out.println("Balnace amount -> " + accountBalances[index]);
            }index++;
        }
        /**
         * do-while loop
         *
         * initialization
         * do {
         *      //until the condition is true
         *      //run the code inside the loop
         *      increment/decrement
         * } while (condition)
         *
         */
        //double[] accountBalances = {2909.90, 98989, 989097.98, 78, 90689};
        System.out.println("\n---do while loop---");

        int doIndex = 0;
        do {
            if (accountBalances[doIndex] < 1000) {
                System.out.println("Balnace amount -> " + accountBalances[doIndex]);
            }
            doIndex++;
        }while (doIndex <= accountBalances.length-1);


    }

}
