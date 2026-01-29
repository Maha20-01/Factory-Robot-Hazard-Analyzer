
import java.util.Scanner;

public class FactoryRobotHazardAnalyzer {

    public static void main(String[] args) {

        // UC1: Display system name
        System.out.println("Factory Robot Hazard Analyzer");

        // Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // UC2: Accept inputs
        System.out.print("Enter Arm Precision: ");
        double armPrecision = scanner.nextDouble();

        System.out.print("Enter Worker Density: ");
        int workerDensity = scanner.nextInt();

        scanner.nextLine(); // clear buffer

        System.out.print("Enter Machinery State: ");
        String machineryState = scanner.nextLine();

        // UC3: Simple machinery risk factor (assume valid)
        double machineryRiskFactor = 1.0;

        if (machineryState.equals("Worn")) {
            machineryRiskFactor = 1.3;
        } else if (machineryState.equals("Faulty")) {
            machineryRiskFactor = 2.0;
        } else if (machineryState.equals("Critical")) {
            machineryRiskFactor = 3.0;
        }

        // UC3: Hazard Risk Calculation (no validation)
        double hazardRiskScore =
                ((1.0 - armPrecision) * 15.0) +
                        (workerDensity * machineryRiskFactor);

        System.out.println("Robot Hazard Risk Score: " + hazardRiskScore);

        scanner.close();
    }
}
