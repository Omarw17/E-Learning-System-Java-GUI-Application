package javasemesterproject;

public class ConcreteSecureFactory extends AbstractSecureFactory {
    @Override
    public UserObject getObject(SecurityCredentials credentials) {
        if (credentials.getUsername().equals("admin")) {
            return new AdministratorUser();
        } else if (credentials.getUsername().equals("instructor")) {
            return new InstructorUser();
        } else {
            return new StudentUser();
        }
    }
}
