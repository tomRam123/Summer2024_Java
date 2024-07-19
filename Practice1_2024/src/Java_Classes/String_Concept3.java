package Java_Classes;

import java.util.Arrays;

public class String_Concept3 {
    public static void main(String[] args) {
        /**
         * To fetch a portion of String from given String using index value
         * method: subString()
         * return type: String
         */
        String myString ="Health was Earlier said to Be the ability of the body functioning WelL. Health was Earlier said to Be..";
        String myString1TO5 = myString.substring(1,5);
        String myStingFrom_2 = myString.substring(2);
        System.out.println("\nmy string --> " + myString);
        System.out.println("my String 1-5--> " + myString1TO5);
        System.out.println("my string from 2--> " + myStingFrom_2);

        /**
         * To split a String from a specific point multiple String values
         * method: split()
         * return type: String[]
         */

        String healthString = "Health was Earlier said to Be the ability of the body functioning WelL.";
        String[] healthStringSplit = healthString.split(" ");
        System.out.println("healthString --> " + healthString );
        System.out.println("healthString split --> " + Arrays.toString(healthStringSplit));




    }
}
