package javasemesterproject;

import java.util.Base64;

public class MainDemo {
    public static void main(String[] args) {
        System.out.println("================================================");
        System.out.println("  E-LEARNING SYSTEM - SECURE LOGGER & FACTORY DEMO");
        System.out.println("================================================\n");

        System.out.println("STEP 1: Setup Security");
        System.out.println("-----------------------------------");

        SecureLoggerFactory.setInstance(new ProductionLoggerFactory());

        System.out.println("Factory set to Production Mode");
        System.out.println("All logs will be encrypted automatically\n");

        System.out.println("STEP 2: Create Processor");
        System.out.println("-----------------------------------");

        Processor processor = new Processor();

        System.out.println("Processor ready\n");

        System.out.println("STEP 3: Process E-Learning Transactions");
        System.out.println("-----------------------------------\n");

        processor.processLogin("john.student@elearning.com", "Student");
        processor.processLogin("jane.instructor@elearning.com", "Instructor");
        processor.processEnrollment("STD-101", "CSE4408-SecurityInSE");
        processor.processUserCreation("new.admin@elearning.com", "Administrator");

        System.out.println("STEP 4: Demonstrate Secure Factory Pattern");
        System.out.println("-----------------------------------\n");

        SecurityCredentials adminCreds = new SecurityCredentials("admin", "adminpass");
        AbstractSecureFactory factory = AbstractSecureFactory.getInstance();
        UserObject adminUser = factory.getObject(adminCreds);
        adminUser.doSomething();

        SecurityCredentials instructorCreds = new SecurityCredentials("instructor", "instrpass");
        UserObject instructorUser = factory.getObject(instructorCreds);
        instructorUser.doSomething();

        SecurityCredentials studentCreds = new SecurityCredentials("student1", "stdpass");
        UserObject studentUser = factory.getObject(studentCreds);
        studentUser.doSomething();

        System.out.println("\nSTEP 5: Understanding Base64 Encoding");
        System.out.println("-----------------------------------\n");

        String originalText = "Password: mySecretPass123";
        String encodedText = Base64.getEncoder().encodeToString(originalText.getBytes());

        System.out.println("Original Text: " + originalText);
        System.out.println("Encoded Text : " + encodedText);
        System.out.println("\nAttackers cannot read the encoded version!\n");

        System.out.println("================================================");
        System.out.println("  KEY TAKEAWAYS");
        System.out.println("================================================");
        System.out.println("1. SECURE LOGGER: Encrypts sensitive data");
        System.out.println("2. SECURE FACTORY: Provides the right logger");
        System.out.println("3. BASE64: Simple encoding to protect data");
        System.out.println("4. AUTOMATIC: Encryption happens automatically");
        System.out.println("5. SECURE: Protects user data from attackers");
        System.out.println("================================================\n");
    }
}
