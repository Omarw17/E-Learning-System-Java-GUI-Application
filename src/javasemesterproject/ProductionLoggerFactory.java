package javasemesterproject;

public class ProductionLoggerFactory extends SecureLoggerFactory {
    private String logFileName = "elearning.production.log";
    private SecureLogger logger;

    @Override
    public SecureLogger getLogger() {
        if (logger == null) {
            logger = new EncryptLogger(logFileName);
        }
        return logger;
    }
}
