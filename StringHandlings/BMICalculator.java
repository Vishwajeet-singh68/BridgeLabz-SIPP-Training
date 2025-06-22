import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI and status
    public static String[][] calculateBMIStatus(double[][] data) {
        String[][] result = new String[10][4]; // height, weight, BMI, status

        for (int i = 0; i < 10; i++) {
            double weight=data[i][0];
            double heightCm=data[i][1];
            double heightM = heightCm / 100.0;

            double bmi = weight /(heightM * heightM);
            String status;

            if (bmi <18.5) {
                status = "Underweight";
            } else if (bmi < 25) {
                status = "Normal";
            } else if (bmi < 30) {
                status = "Overweight";
            } else {
                status = "Obese";
            }

            result[i][0] = "" + heightCm;
            result[i][1] = "" + weight;
            result[i][2] = "" + bmi;
            result[i][3] = status;
        }

        return result;
    }

    // Method to display the result
    public static void displayTable(String[][] result) {
        System.out.println("\n--- BMI Report ---");
        System.out.println("Height(cm)  Weight(kg)  BMI        Status");
        System.out.println("--------------------------------------------");

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t      " +
                               result[i][1] + "\t       " +
                               result[i][2] + "\t" +
                               result[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] hwData = new double[10][2]; // [][0]=weight, [][1]=height

        System.out.println("Enter height (cm) and weight (kg) for 10 persons:");

        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1) + ":");

            System.out.print("  Enter height in cm: ");
            hwData[i][1] = sc.nextDouble();

            System.out.print("  Enter weight in kg: ");
            hwData[i][0] = sc.nextDouble();
        }

        // Calculate and display BMI
        String[][] result = calculateBMIStatus(hwData);
        displayTable(result);

    }
}
