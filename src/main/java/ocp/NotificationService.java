package ocp;

interface Notification {
    boolean send(String message);
}

class EmailNotification implements Notification {
    @Override
    public boolean send(String message) {
        System.out.println("Sending Email: " + message);
        return true;
    }
}

class SMSNotification implements Notification {
    @Override
    public boolean send(String message) {
        System.out.println("Sending SMS: " + message);
        return true;
    }
}

class PushNotification implements Notification {
    @Override
    public boolean send(String message) {
        System.out.println("Sending Push Notification: " + message);
        return true;
    }
}

public class NotificationService {
    public void sendNotification(Notification notification, String message) {
        notification.send(message);
    }

    public static void main(String[] args) {
        NotificationService service = new NotificationService();

        System.out.println("--- Ejecutando Notificaciones Base ---");
        service.sendNotification(new EmailNotification(), "Hello via Email!");
        service.sendNotification(new SMSNotification(), "Hello via SMS!");
        service.sendNotification(new PushNotification(), "Hello via Push Notification!");

        System.out.println("\n--- Demostrando OCP (Extensión sin modificar código) ---");

        Notification fax = new Notification() {
            @Override
            public boolean send(String message) {
                System.out.println("Sending Fax: " + message);
                return true;
            }
        };
        service.sendNotification(fax, "Hello via Fax!");
    }
}