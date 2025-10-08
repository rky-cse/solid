package me.rkycse.solid.dip.good;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * GOOD EXAMPLE: Another low-level module implementation.
 * We can create many different senders without ever changing the high-level NotificationService.
 * The @Primary annotation tells Spring to use this bean by default when injecting a MessageSender.
 */
@Component("smsSender")
@Primary
public class SmsSender implements MessageSender {
    @Override
    public String send(String message) {
        System.out.println("Sending SMS with good DIP: " + message);
        return "SMS sent via good DIP.";
    }
}

