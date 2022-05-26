package DomainEntities;

import javaTesting.Resources.PasswordUtils;

public class User {
    private String name;
    private String password;
    private String salt;
    // Password = Hash(password + salt)
    private String passwordHash;

    public User () {
        this("Alex", "123");
    }
    public User(String name, String password) {
        this.name = name;
        this.password = password;
        this.salt = PasswordUtils.generateRandomString(10);
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isValidUser(String name, String password) {
        return this.name.equals(name) && this.password.equals(password);
    }
}
