package me.rkycse.solid.dip.good;

import org.springframework.stereotype.Component;

/**
 * GOOD EXAMPLE: A low-level module that depends on the abstraction (by implementing it).
 * The @Component annotation makes it a Spring bean, allowing it to be injected.
 */
@Component("emailSender") // Give it a name to distinguish from other senders
public class EmailSender implements MessageSender {
    @Override
    public String send(String message) {
        System.out.println("Sending email with good DIP: " + message);
        return "Email sent via good DIP.";
    }
}
