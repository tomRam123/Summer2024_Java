package Java_Classes;

public class ConditionalCode_2 {
    public static void main(String[] args) {
        /**
         * Conditional Code (Conditional Loops /Conditional Blocks)
         * 1. if-else block
         * 2. switch block
         */
        /*
        number is divisible by 2 and number < 10
                sout(number x 10)
                sout("number is divisible by 2")
        number is divisible by 5 or number is divisible by 7
                sout("number is divisible by 5 or 7")
                sout(number x 20)
        number < 20
                sout("number is less than 20")
         */

        int number = 33;

        if(number%2==0 && number < 10){
            System.out.println(number +" x 10 = " + number * 10);
            System.out.println(number + " is divisible by 2");
        } else if (number % 5 == 0 || number % 7 == 0) {
            System.out.println(number + " x 20 = " + number * 20);
            System.out.println(number + " is divisible by 5 or 7");
        } else if (number < 20) {
            System.out.println(number + " is less than 20");
        }else {
            System.out.println("All above conditions failed" );
        }
        /**
         *switch block
         *
         * 1.all conditions ate related to one variable
         * 2. all conditions ate checking the equals-check
         * 3. for every block there is one condition and that should and that should be checking equals
         *
         * syntax
         *
         * switch (variable) {
         *      case value1:
         *          // do this
         *          // code to execute when variable-value1 is equal?identical to value1
         *          break;
         *      case value2:
         *          // do this
         *          // code to execute when variable-value1 is equal?identical to value2
         *          break;
         *      case value2:
         *          // do this
         *          // code to execute when variable-value1 is equal?identical to value3
         *          break;
         *      default:
         *          // do this
         *          // code to execute when variable-value is NOT equals/identical to above mentioned values
         **/
        int num = 05;

        switch (num){
            case 2:
                System.out.println("num is two");
                break;
            case 5:
                System.out.println("num is five");
                break;
            case 15:
                System.out.println("num is fifteen");
                break;
            case 10:
                System.out.println("num is ten");
                break;
            case 20:
                System.out.println("num is twenty");
                break;
        }

        /*
        day

        if day is Mon or Wed oe Fri -> print ("Today is the technosoft class")
        if day is tus, Thu -> ("Today is self learning day")
        if day is sat -> print -> ("Today is lab session day")
        if day is sin -> print -> ("No study day")
        Note: if the day value day-name is any form, Mon or Monday or MONDAY MoN
        */

        String day = "mon";

        switch(day.toLowerCase()){
            case "mon":
            case "monday":
            case "wed":
            case "wednesday":
            case "fri":
            case "friday":
                System.out.println("Today is the technosoft class");
                break;
            case "tues":
            case "tuesday":
            case "thu":
            case "thursday":
                System.out.println("Today is self learning day");
                break;
            case "sun":
            case "sunday":
                System.out.println("Today is lab session day");
                break;
            default:
                System.out.println("Entered day-value is not valid");

        }






         }
}
