// UC6 + UC7: Business logic with custom exception handling
public class RobotHazardAuditor {

    public static double calculateHazardRisk(
            double armPrecision,
            int workerDensity,
            String machineryState
    ) throws RobotSafetyException {

        // Validate arm precision
        if (armPrecision < 0.0 || armPrecision > 1.0) {
            throw new RobotSafetyException(
                    "Error: Arm precision must be 0.0-1.0"
            );
        }

        // Validate worker density
        if (workerDensity < 1 || workerDensity > 20) {
            throw new RobotSafetyException(
                    "Error: Worker density must be 1-20"
            );
        }

        // Validate machinery state
        if (!machineryState.equals("Worn")
                && !machineryState.equals("Faulty")
                && !machineryState.equals("Critical")) {
            throw new RobotSafetyException(
                    "Error: Unsupported machinery state"
            );
        }

        // UC7: Machinery state risk mapping
        double machineryRiskFactor;

        switch (machineryState) {
            case "Worn":
                machineryRiskFactor = 1.3;
                break;
            case "Faulty":
                machineryRiskFactor = 2.0;
                break;
            case "Critical":
                machineryRiskFactor = 3.0;
                break;
            default:
                // Safety net
                throw new RobotSafetyException(
                        "Error: Unsupported machinery state"
                );
        }

        //  FINAL: Hazard risk calculation
        return ((1.0 - armPrecision) * 15.0)
                + (workerDensity * machineryRiskFactor);
    }
}
