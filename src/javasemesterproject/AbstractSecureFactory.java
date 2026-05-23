package javasemesterproject;

public abstract class AbstractSecureFactory {
    private static AbstractSecureFactory instance;

    public static AbstractSecureFactory getInstance() {
        if (instance == null) {
            instance = new ConcreteSecureFactory();
        }
        return instance;
    }

    public static void setInstance(AbstractSecureFactory newInstance) {
        instance = newInstance;
    }

    public abstract UserObject getObject(SecurityCredentials credentials);
}
