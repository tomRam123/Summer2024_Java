package Java_Classes;

public class ConditionalCode {
    public static void main(String[] args) {
        /**
         * Conditional Code (Conditional Loops /Conditional Blocks)
         * 1. if-else block
         * 2. switch block
         *
         * Syntax:
         *      if-else
         *
         * if(condition(s)) {
         *      // if blocks
         *      // code will execute if condition(s) is/are true
         * }
         *
         */
        String name = "United STATES OF AMERICA";
        // if the value in name-variable contains "state", print the value of name-variable
        if(name.toLowerCase().contains("state")) {
            System.out.println(name);
        }

        /**
         * Conditional Code (Conditional Loops /Conditional Blocks)
         * 1. if-else block
         * 2. switch block
         *
         * Syntax:
         *      if-else
         *
         * if(condition(s)) {
         *      // if blocks
         *      // code will execute if condition(s) is/are true
         * } else {
         *      //else-block
         *      //code will execute if all above if/else-if condition(s) are false
         * }
         *
         */
        // if the value in name-variable contains "state", print the value of name-variable
        // otherwise print "country doesn't contain state"
        if(name.toLowerCase().contains("state")) {
            System.out.println(name);
        }else {
            System.out.println("country doesn't contain state");
        }


    }
}
