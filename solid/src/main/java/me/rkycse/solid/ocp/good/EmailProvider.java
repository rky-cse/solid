package me.rkycse.solid.ocp.good;

/**
 * GOOD EXAMPLE: A concrete implementation of the NotificationProvider interface.
 */
public class EmailProvider implements NotificationProvider {
    @Override
    public String send(String message) {
        System.out.println("Sending Email: " + message);
        return "Email Sent";
    }
}

