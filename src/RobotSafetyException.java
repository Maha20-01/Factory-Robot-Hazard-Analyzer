// UC6: Custom exception for robot safety violations
public class RobotSafetyException extends Exception {

    // Constructor that accepts error message
    public RobotSafetyException(String message) {
        super(message);
    }
}
