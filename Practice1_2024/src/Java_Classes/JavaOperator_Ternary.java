package Java_Classes;

public class JavaOperator_Ternary {

    /**
     * Syntax --> variable = condition(s) ? valIfTrue : valIfFalse
     *
     */

    public static void main(String[] args) {
        int creditScore = 600;
        double mortgageRate =creditScore>700?1.5:2.5 ;


        System.out.println("\nMy mortgage rate would be " + mortgageRate + " if my credit score is " + creditScore);




    }
}
