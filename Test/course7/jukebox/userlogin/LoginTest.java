package course7.jukebox.userlogin;


import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class LoginTest {
    Login login;
    @Before
    @BeforeEach
    public void setUp() {
        login = new Login();
    }
    

    @Test
    public void testValidateUserName(){
        assertTrue(login.validateUserName("Shweta"));
        assertTrue(login.validateUserName("Shekhar"));
        assertFalse(login.validateUserName("abc"));
    }

    @Test
    public void testValidatePassword() {
        assertTrue(login.validatePassword("Shweta@123"));
        assertFalse(login.validatePassword("2Shweta"));
    }

    @Test
    public void testValidateEmail() {
        assertTrue(login.validateEmail("Shweta123@gmail.com"));
        assertFalse(login.validateEmail("abc@gmail.com"));
    }

    @Test
    public void testValidateMobile() {
        assertTrue(login.validateMobile("9087654321"));
        assertFalse(login.validateMobile("189023456"));
    }
}