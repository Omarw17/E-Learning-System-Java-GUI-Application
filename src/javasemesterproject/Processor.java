package javasemesterproject;

public class Processor {
    private SecureLogger logger;

    public Processor() {
        this.logger = SecureLoggerFactory.getInstance().getLogger();
    }

    public void processLogin(String username, String role) {
        logger.log("User login: Username=" + username +
                ", Role=" + role +
                ", Time=" + System.currentTimeMillis());

        System.out.println("Login processing logic executed...");
        System.out.println("Access granted for " + username + "\n");
    }

    public void processEnrollment(String studentId, String courseId) {
        logger.log("Course enrollment: Student=" + studentId +
                ", Course=" + courseId +
                ", Time=" + System.currentTimeMillis());

        System.out.println("Enrollment processing logic executed...");
        System.out.println("Enrollment successful!\n");
    }

    public void processUserCreation(String username, String userType) {
        logger.log("User created: Username=" + username +
                ", Type=" + userType +
                ", Time=" + System.currentTimeMillis());

        System.out.println("User creation logic executed...");
        System.out.println("User created successfully!\n");
    }
}
