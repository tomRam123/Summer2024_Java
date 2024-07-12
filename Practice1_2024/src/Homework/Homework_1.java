package Homework;

public class Homework_1 {
    /**
     * Fahrenheit to Celsius = (F - 32) × 5/9
     * Fahrenheit to Kelvin = (F + 459.67)× 5/9
     *
     * Celsius to Fahrenheit = C × 9/5 + 32
     * Celsius to Kelvin = C + 273.15
     *
     * Kelvin to Celsius = K - 273.15
     * Kelvin to Fahrenheit = K × 9/5 - 459.67
     */



    public static void main(String[] args) {

        double fTemp = 65;
        double cTemp = 20;
        double kTemp = 300;

        double fTempToCels = (fTemp - 32) * 5/9;
        double fTempToKelv = (fTemp + 459.67)* 5/9;
        double cTempToFah = cTemp * 9/5 + 32;
        double cTempToKelv = cTemp + 273.15;
        double kTempToCels = kTemp - 273.15 ;
        double kTempToFah = kTemp * 9/5 - 459.67;



        System.out.println("\nFahrenheit temperature to Celsius -->" + fTempToCels);
        System.out.println("Fahrenheit temperature to Kelvin -->" + fTempToKelv);
        System.out.println("Celsius temperature to Fahrenheit -->" + cTempToFah);
        System.out.println("Celsius temperature to Kelvin -->" + cTempToKelv);
        System.out.println("Kelvin temperature to Celsius -->" + kTempToCels);
        System.out.println("Kelvin temperature to Fahrenheit -->" + kTempToFah);




    }
}
