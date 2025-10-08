package me.rkycse.solid.ocp.good;



/**
 * GOOD EXAMPLE: Another concrete implementation.
 * We can create as many providers as we need without ever touching the NotificationService class.
 */
public class SmsProvider implements NotificationProvider {
    @Override
    public String send(String message) {
        System.out.println("Sending SMS: " + message);
        return "SMS Sent";
    }
}

