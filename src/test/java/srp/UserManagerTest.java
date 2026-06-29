package srp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserManagerTest {
    UserValidator validator = new UserValidator();
    UserRepository repository = new UserRepository();
    NotificationService notification = new NotificationService();
    UserManager userManager = new UserManager(validator, repository, notification);

    @Test
    void testAddValidUser() {
        assertTrue(userManager.addUser("alex@domain.com", "securePass123"));
    }

    @Test
    void testAddInvalidEmail() {
        assertFalse(userManager.addUser("invalid-email", "securePass123"));
    }

    @Test
    void testAddShortPassword() {
        assertFalse(userManager.addUser("alex@domain.com", "123"));
    }
}