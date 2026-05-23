package javasemesterproject;

public class SecurityCredentials {
    private final String username;
    private final String password;

    public SecurityCredentials(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
