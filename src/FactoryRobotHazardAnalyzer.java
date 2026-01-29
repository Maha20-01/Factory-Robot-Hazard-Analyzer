// UC2: Accept Robot Hazard Inputs
// This class collects input values from the user

import java.util.Scanner;

public class FactoryRobotHazardAnalyzer {

    public static void main(String[] args) {

        // UC1: Display system name
        System.out.println("Factory Robot Hazard Analyzer");

        // Scanner object to read input from console
        Scanner scanner = new Scanner(System.in);

        // UC2: Accept Arm Precision input
        System.out.print("Enter Arm Precision: ");
        double armPrecision = scanner.nextDouble();

        // UC2: Accept Worker Density input
        System.out.print("Enter Worker Density: ");
        int workerDensity = scanner.nextInt();

        scanner.nextLine(); // clear buffer

        // UC2: Accept Machinery State input
        System.out.print("Enter Machinery State: ");
        String machineryState = scanner.nextLine();

        // UC2: Echo the inputs back to the user
        System.out.println("Arm Precision: " + armPrecision);
        System.out.println("Worker Density: " + workerDensity);
        System.out.println("Machinery State: " + machineryState);

        scanner.close();
    }
}
