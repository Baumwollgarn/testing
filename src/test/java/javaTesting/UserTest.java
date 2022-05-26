package javaTesting;

import DomainEntities.User;
import org.junit.Test;
import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void constructUserTest() {
        User user = new User();

        assertTrue(user != null);

        assertEquals(user.getName(), "Alex");
        assertEquals(user.getPassword(), "123");

    }
}
