package Java_Classes;

import java.util.Arrays;

public class Array_Concept {
    public static void main(String[] args) {

        /**
         *Array: It is a non-primitive datatype, which can store multiple values of the SAME datatype
         */

        //Store top 5 profit making companies of 2024

        String[] top5Companies2024 = new String[5];
        top5Companies2024[0] = "Tesla";
        top5Companies2024[3] = "Apple";
        top5Companies2024[1] = "Google";
        top5Companies2024[4] = "Meta";
        top5Companies2024[2] = "Technosoft";

        //print all top 5 companies
        System.out.println(Arrays.toString(top5Companies2024));

        //print top company
        System.out.println(top5Companies2024[0]);

        //Print true if the most profitable company is Tesla.
        boolean mostProfitableComp = top5Companies2024[0].equalsIgnoreCase("Tesla");
        System.out.println("\nIs Tesla the most profitable company -->" + mostProfitableComp);


        double[] bills = {100.00,90.92,60,65.98,231.78,67.09};
        int numOfBills = bills.length;
        double totalBill = bills[0]+bills[1]+bills[2]+bills[3]+bills[4]+bills[5];
        System.out.println("\ntotal bill amount --> " + totalBill);

        //Store value in index 2 from bills in a new variable(Dunkin)
        double dunkin = bills[2];
        System.out.println("\nDunkin --> " + dunkin);

        //Find the average of all bills
        double averageBills = totalBill/numOfBills;
        System.out.println("\nAverage of total bills --> " + averageBills);





    }
}
