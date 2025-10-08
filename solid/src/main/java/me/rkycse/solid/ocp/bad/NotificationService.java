package me.rkycse.solid.ocp.bad;

/**
 * BAD EXAMPLE: This class violates the Open/Closed Principle (OCP).
 * It is not "open for extension" and "closed for modification".
 * If we want to add a new notification type, like a push notification or a Slack message,
 * we have to MODIFY this class by adding another "if" or "case" statement.
 * This increases the risk of introducing bugs into existing, working code.
 */
public class NotificationService {
    public void sendNotification(String message, String type) {
        if ("email".equals(type)) {
            System.out.println("Sending Email: " + message);
        } else if ("sms".equals(type)) {
            System.out.println("Sending SMS: " + message);
        }
        // What if we want to add Push notifications? We have to modify this method!
    }
}

