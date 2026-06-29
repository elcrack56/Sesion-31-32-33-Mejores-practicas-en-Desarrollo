package ocp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NotificationServiceTest {
    NotificationService service = new NotificationService();

    @Test
    void testEmailNotification() {
        assertTrue(new EmailNotification().send("Test Email"));
    }

    @Test
    void testSMSNotification() {
        assertTrue(new SMSNotification().send("Test SMS"));
    }

    @Test
    void testPushNotification() {
        assertTrue(new PushNotification().send("Test Push"));
    }

    @Test
    void testNewNotificationTypeWithoutModifyingService() {
        Notification whatsapp = msg -> {
            System.out.println("WhatsApp: " + msg);
            return true;
        };
        assertTrue(whatsapp.send("Test WhatsApp"));
    }
}