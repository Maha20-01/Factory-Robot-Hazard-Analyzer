// UC6 + UC7 + UC8: Fully modular business logic
public class RobotHazardAuditor {

    public static double calculateHazardRisk(
            double armPrecision,
            int workerDensity,
            String machineryState
    ) throws RobotSafetyException {

        if (armPrecision < 0.0 || armPrecision > 1.0) {
            throw new RobotSafetyException(
                    "Error: Arm precision must be 0.0-1.0"
            );
        }

        if (workerDensity < 1 || workerDensity > 20) {
            throw new RobotSafetyException(
                    "Error: Worker density must be 1-20"
            );
        }

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
                throw new RobotSafetyException(
                        "Error: Unsupported machinery state"
                );
        }

        return ((1.0 - armPrecision) * 15.0)
                + (workerDensity * machineryRiskFactor);
    }
}
