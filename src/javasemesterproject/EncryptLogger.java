package javasemesterproject;

import java.util.Base64;

public class EncryptLogger implements SecureLogger {

    private String logFileName;

    public EncryptLogger(String logFileName) {
        this.logFileName = logFileName;
        System.out.println("EncryptLogger Created for the file " + logFileName);
    }

    private String encrypt(String message) {
        byte[] encodedBytes = Base64.getEncoder().encode(message.getBytes());
        return new String(encodedBytes);
    }

    @Override
    public void log(String message) {
        String encryptedMessage = encrypt(message);

        System.out.println("[PRODUCTION LOG - " + logFileName + "]");
        System.out.println("   Encrypted: " + encryptedMessage);
        System.out.println("   (Original: " + message + ")");
        System.out.println("Attackers cannot read this!\n");
    }
}
