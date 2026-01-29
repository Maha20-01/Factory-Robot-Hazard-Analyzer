// UC5: Business logic moved to separate class
public class RobotHazardAuditor {

    public static double calculateHazardRisk(
            double armPrecision,
            int workerDensity,
            String machineryState
    ) {

        if (armPrecision < 0.0 || armPrecision > 1.0) {
            System.out.println("Error: Arm precision must be 0.0-1.0");
            return -1;
        }

        if (workerDensity < 1 || workerDensity > 20) {
            System.out.println("Error: Worker density must be 1-20");
            return -1;
        }

        if (!machineryState.equals("Worn")
                && !machineryState.equals("Faulty")
                && !machineryState.equals("Critical")) {
            System.out.println("Error: Unsupported machinery state");
            return -1;
        }

        double machineryRiskFactor;

        if (machineryState.equals("Worn")) {
            machineryRiskFactor = 1.3;
        } else if (machineryState.equals("Faulty")) {
            machineryRiskFactor = 2.0;
        } else {
            machineryRiskFactor = 3.0;
        }

        return ((1.0 - armPrecision) * 15.0)
                + (workerDensity * machineryRiskFactor);
    }
}
