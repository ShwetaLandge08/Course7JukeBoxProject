package course7.jukebox.userlogin;

import course7.jukebox.connection.ConnectionClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class UserTest {
    User user;
    ConnectionClass connectionClass = new ConnectionClass();
    @Before
    @BeforeEach
    public void setUp() {
        user = new User();
    }

    @Test
    public void testCheckForExistingUser() {
        Assert.assertEquals(1, user.checkForExistingUser("Shweta", "Shweta@123"));
        Assert.assertEquals(3, user.checkForExistingUser("Divya", "Divya@123"));
        Assert.assertEquals(0, user.checkForExistingUser("Ramesh", ("ramesh@12")));
    }
}