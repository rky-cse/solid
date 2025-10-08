package me.rkycse.solid.dip.bad;


/**
 * BAD EXAMPLE: This class violates the Dependency Inversion Principle (DIP).
 *
 * The high-level module (NotificationService) directly depends on a concrete
 * low-level module (EmailSender).
 *
 * This tight coupling makes the system rigid. If we want to switch from sending
 * emails to sending SMS messages, we have to change the NotificationService code.
 * It also makes testing difficult, as we can't easily swap out the real EmailSender
 * for a mock object.
 */
public class NotificationService {

    private final EmailSender emailSender;

    public NotificationService() {
        // The high-level class is responsible for creating its own dependency.
        this.emailSender = new EmailSender();
    }

    public void sendNotification(String message) {
        emailSender.send(message);
    }
}


