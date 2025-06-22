import java.util.Scanner;

public class UnitConverter {
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit-32)*5/9;
    }
    
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius*9/5)+32;
    }
    
    public static double convertPoundsToKilograms(double pounds) {
        return pounds*0.453592;
    }
    
    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms*2.20462;
    }
    
    public static double convertGallonsToLiters(double gallons) {
        return gallons*3.78541;
    }
    
    public static double convertLitersToGallons(double liters) {
        return liters*0.264172;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unit Converter");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("3. Pounds to Kilograms");
        System.out.println("4. Kilograms to Pounds");
        System.out.println("5. Gallons to Liters");
        System.out.println("6. Liters to Gallons");
        System.out.print("Choose option: ");
        int choice = sc.nextInt();
        
        System.out.print("Enter value: ");
        double value = sc.nextDouble();
        double result = 0;
        
        if(choice==1) {
            result = convertFahrenheitToCelsius(value);
            System.out.println(value + " F = " + result + " C");
        } else if(choice==2) {
            result = convertCelsiusToFahrenheit(value);
            System.out.println(value + " C = " + result + " F");
        } else if(choice==3) {
            result = convertPoundsToKilograms(value);
            System.out.println(value + " lbs = " + result + " kg");
        } else if(choice==4) {
            result = convertKilogramsToPounds(value);
            System.out.println(value + " kg = " + result + " lbs");
        } else if(choice==5) {
            result = convertGallonsToLiters(value);
            System.out.println(value + " gallons = " + result + " liters");
        } else if(choice==6) {
            result = convertLitersToGallons(value);
            System.out.println(value + " liters = " + result + " gallons");
        }
    }
}