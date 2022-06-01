package javaTesting;

import DomainEntities.User;
import javaTesting.Resources.PasswordUtils;
import org.junit.Test;

import java.security.NoSuchAlgorithmException;

import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void constructUserTest() {
        User user = new User("Alex","123");

        assertTrue(true);

        assertEquals(user.getName(), "Alex");

        assertTrue(user.verifyPassword("123"));
    }
}
