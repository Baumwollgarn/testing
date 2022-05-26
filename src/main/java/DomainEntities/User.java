package DomainEntities;

import javaTesting.Resources.PasswordUtils;

import java.security.NoSuchAlgorithmException;

public class User {
    private String name;
    private String password;
    private String salt;
    // Password = Hash(password + salt)

    public User () {
        this("Alex", "123");
    }
    public User(String name, String password) {
        this.name = name;
        this.salt = PasswordUtils.generateRandomString(8);
        this.password = PasswordUtils.genSecurePassword(password, salt);
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
    public boolean verifyPassword(String passwordEntered) {
        return PasswordUtils.verifyUserPassword(passwordEntered, salt, password);
    }

}
