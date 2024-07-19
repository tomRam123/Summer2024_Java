package Java_Classes;

public class String_Concept2 {
    public static void main(String[] args) {

        /**
         * For comparison, when we need to verify if two strings are IDENTICAL.
         * method: equals()
         * return: boolean
         */
        String cityName = "New York City";
        String cityName2 = "nEW yORK cIty";
        boolean isEqual = cityName.equals(cityName2);
        System.out.println("\nis " + cityName + " equal to " + cityName2 + "--> " + isEqual);

        /**
         * For comparison, when we need to verify if two strings are having same value (ignoring cases)
         * method: equalsIgnoreCase()
         * return: boolean
         */

        boolean isEqualIgnoreCase = cityName.equalsIgnoreCase(cityName2);
        System.out.println("\nis " + cityName + " equal to " + cityName2 + " ignoring cases --> " + isEqualIgnoreCase);

        /**
         * To find a particular sequence is EXACTLY in a given string
         * method: contains()
         * return: boolean
         */

        boolean containsNew = cityName.contains("new");
        System.out.println("\nDoes " + cityName + "contains the word new " + "--> " + containsNew );

        /**
         * verify if cityName contains "new" ignoring cases
         */

        String checkFor = "new";
        boolean containsNewIgnoringCases = cityName.toLowerCase().contains(checkFor.toLowerCase());

        System.out.println("\nDoes cityName contains \"new\" ignoring cases --> " + containsNewIgnoringCases);

        /**
         * To replace a String in a given String
         * method: replace()
         * return: String
         */
        String news = "Health was Earlier said to Be the ability of the body functioning WelL. Health was Earlier said to Be..";
        //Replace all e with XXX
        String newsReplace_e_XXX = news.replace("e", "XXX");
        System.out.println("\nNew string after replacing all e with XXX --> " + newsReplace_e_XXX);

        /**
         * replace all instances of e/E with XXX (ignore cases)
         */

        String newsReplace_e_XXXIgnoreCases = news.toLowerCase().replace("e","XXX");
        System.out.println("\nOriginal news -->" + news);
        System.out.println("After replacing all e with XXX (ignoring cases --> " + newsReplace_e_XXXIgnoreCases);

        /**
         * To find the char present at a particular index
         * method: charAt()
         * input: int\return type: char
         */

        //String cityName = "New York City";
        char charAtIndex4= cityName.charAt(4);
        System.out.println("\nchar at index-4 in " + cityName + "is --> " + charAtIndex4);

        /**
         *To find the index of FIRST OCCURRENCE of a string in the given string
         * method; indexOf()
         * input; String
         * return type; int
         */
        String healthString = "the body functioning WelL.";
        int indexOf_b = healthString.indexOf("body");
        System.out.println("\nindex of \"b\" in " + healthString + "is --> " + indexOf_b);

        /**
         *To find the index of LAST OCCURRENCE of a string in the given string
         * method; lastIndexOf()
         * input; String
         * return type; int
         */
        int lastIndexOf_ing = healthString.lastIndexOf("ing");
        System.out.println("\nlast index of \"b\" in " + healthString + "is --> " + lastIndexOf_ing);

        /**
         * To find if the String starts with a given string value
         * method: startWith()
         * input: String
         * return type: boolean
         */
        // String cityName = "New York City";
        boolean startsWith_new = cityName.startsWith("new");
        System.out.println("\nDoes cityName starts with \"new\" --> " + startsWith_new);

        /**
         * To find if the String ends with a given string value
         * method: endsWith()
         * input: String
         * return type: boolean
         */
        boolean endsWith_ity = cityName.endsWith("ity");
        System.out.println("\nDoes cityName ends with \"ity\" --> " + endsWith_ity);

        /**
         * To remove spaces fron the beginning and from the end
         * method: trim()
         * return type: String
         */
        String city = "    Los Angeles  ";
        String cityTrim = city.trim();
        System.out.println(cityTrim);












    }
}
