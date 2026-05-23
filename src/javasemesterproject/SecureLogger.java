package javasemesterproject;

/**
 * This interface defines the contract that all secure loggers must follow.
 * The Secure Logger pattern protects log information from unauthorized access.
 */
public interface SecureLogger {
    void log(String message);
}
