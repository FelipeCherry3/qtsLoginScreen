import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginTest {

    @Test
    public void testSucessfulLogin(){
        LoginScreen loginScreen = new LoginScreen();
        assertTrue(loginScreen.login("felipe","senha123"));
    }

    @Test
    public void testFailedLogin(){
        LoginScreen loginScreen = new LoginScreen();
        assertFalse(loginScreen.login("haha","jaj"));
    }

}
