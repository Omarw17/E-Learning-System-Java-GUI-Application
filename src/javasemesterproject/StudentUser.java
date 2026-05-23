package javasemesterproject;

public class StudentUser implements UserObject {
    @Override
    public void doSomething() {
        System.out.println("Student access granted: Can view and enroll in courses.");
    }
}
