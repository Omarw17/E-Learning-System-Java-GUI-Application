package javasemesterproject;

public class AdministratorUser implements UserObject {
    @Override
    public void doSomething() {
        System.out.println("Administrator access granted: Full system access, manage users and settings.");
    }
}
