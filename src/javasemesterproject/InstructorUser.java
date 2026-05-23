package javasemesterproject;

public class InstructorUser implements UserObject {
    @Override
    public void doSomething() {
        System.out.println("Instructor access granted: Can create and manage courses.");
    }
}
