package Java_Classes;

public class String_Concept {
    public static void main(String[] args) {


        String cityName = "New York City";
        /**
         * To find the length of a String
         * method: length()
         * return: int
         */
        int cityNameLength = cityName.length();
        System.out.println("\ncity name --> " + cityName);
        System.out.println("\nlength of city name --> " + cityNameLength);

        /**
         * To convert String value into lowerCase
         * method: toLowerCase()
         * return: String
         */
        String cityNameToLowerCase = cityName.toLowerCase();
        System.out.println("city name to lower case --> " + cityNameToLowerCase);
        System.out.println(cityName);

        /**
         * To convert String value into UpperCase
         * method: toUpperCase()
         * return: String
         */
        String cityNameToUpperCase = cityName.toUpperCase();
        System.out.println("\ncity name to upper case --> " + cityNameToUpperCase);
        System.out.println(cityName);




    }
}
