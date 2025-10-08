package me.rkycse.solid.ocp.good;



/**
 * GOOD EXAMPLE: This class adheres to the Open/Closed Principle (OCP).
 * It is "closed for modification" because we don't need to change its source code
 * to add new functionality.
 * It is "open for extension" because we can easily add new notification types by creating
 * new classes that implement the NotificationProvider interface.
 */
public class NotificationService {
    public String sendNotification(String message, NotificationProvider provider) {
        return provider.send(message);
    }
}

