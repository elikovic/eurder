package be.cm.security;

public class DecodedCredentials {
    private final String username;
    private final String password;

    public DecodedCredentials(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }
}