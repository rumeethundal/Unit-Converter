import java.util.Scanner;
public class UnitConverter {
    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {
        int object;
        while (true) {
            System.out.println("\nWelcome to the Unit Converter\n" +
                    "Take your pick!\n" +
                    "Choose 1: To convert from kilometers to miles\n" +
                    "Choose 2: To convert from kilograms to pounds\n" +
                    "Choose 3: To convert from celsius to fahrenheit\n" +
                    "Choose 4: To convert from centimeters to inches\n" +
                    "Choose 5: To convert from meters to yards\n" +
                    "Answer:");

            object = kb.nextInt();


            switch (object) {
                case 1:
                    convertKilometersToMiles();
                    break;

                case 2:
                    convertKilogramsToPounds();
                    break;

                case 3:
                    convertCelsiusToFahrenheit();
                    break;

                case 4:
                    convertCentimetersToInches();
                    break;

                case 5:
                    convertMetersToYards();
                    break;

//                default:
//                    System.out.print("Invalid: ");
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
        System.out.println("Enter celsius to convert to fahrenheit:");
        double celsius = kb.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println(celsius+" celsius is equal to "+fahrenheit +" fahrenheit");
    }

    public static void convertCentimetersToInches() {
        System.out.println("Enter centimeters to convert to inches");
        double centimeters = kb.nextDouble();
        double inches = centimeters * 0.39;
        System.out.println(centimeters + "centimeters is equal to " + inches + "inches");
    }

    public static void convertMetersToYards(){
        System.out.println("Enter meters to convert to yards:");
        double meters = kb.nextDouble();
        double yards = meters * 1.0936;
        System.out.println(meters + " meters is equal to " + yards + " yards");
    }

}
