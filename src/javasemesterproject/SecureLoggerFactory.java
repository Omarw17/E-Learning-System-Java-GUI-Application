package javasemesterproject;

abstract class SecureLoggerFactory {
    private static SecureLoggerFactory instance;

    public abstract SecureLogger getLogger();

    public static SecureLoggerFactory getInstance() {
        if (instance == null) {
            instance = new ProductionLoggerFactory();
        }
        return instance;
    }

    public static void setInstance(SecureLoggerFactory instance) {
        SecureLoggerFactory.instance = instance;
    }
}
