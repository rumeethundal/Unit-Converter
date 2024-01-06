import java.util.Scanner;
public class UnitConverter {
    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args){
        int object;
        while(true) {
            System.out.println("\nWelcome to the Unit Converter\n" +
                    "Take your pick!\n" +
                    "Choose 1: To convert from kilometers to miles\n" +
                    "Choose 2: To convert from kilograms to pounds\n" +
                    "Choose 3: To convert from celsius to fahrenheit\n" +
                    "Choose 4: To convert from centimeters to inches\n" +
                    "Choose 5: To convert from meters to yards\n" +
                    "Answer:");

            object = kb.nextInt();

            switch(object) {
                case 1:
                    convertKilometersToMiles();
                    break;

                case 2:
                    convertKilogramsToPounds();
                    break;
            }
        }
    }
     public static void convertKilometersToMiles() {
        System.out.println("Enters kilometers to convert to miles:");
        double kilometers = kb.nextDouble();
        //System.out.println("Enters kilometers to convert to miles:");
        double miles = kilometers * 0.62;
        System.out.println(kilometers + " kilometers is equal to " + miles + " miles");
    }
    public static void convertKilogramsToPounds() {
        System.out.println("Enter kilograms to convert to pounds:");
        double kilograms = kb.nextDouble();
        double pounds = kilograms * 2.2;
        System.out.print(kilograms + " kilograms is equal to " + pounds + " pounds");
    }
    public static void convertCelsiusToFahrenheit() {
    }

}
