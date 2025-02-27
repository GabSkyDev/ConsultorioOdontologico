package consultorio_gabriel_sousa;

public class Usuario {
    private String userEmail;
    private String password;
    private String role;

    public String getUsername() {
        return userEmail;
    }

    public void setUsername(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
