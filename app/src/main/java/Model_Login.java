
public class Model_Login {
    private String username,Email,password,isactive;

    public Model_Login() {
    }

    public Model_Login(String username, String email, String password, String isactive) {
        this.username = username;
        this.Email = email;
        this.password = password;
        this.isactive = isactive;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIsactive() {
        return isactive;
    }

    public void setIsactive(String isactive) {
        this.isactive = isactive;
    }
}
