package me.rkycse.solid.dip.good;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * GOOD EXAMPLE: This high-level module adheres to the Dependency Inversion Principle (DIP).
 * It depends on an abstraction (MessageSender) instead of a concrete implementation.
 * The actual implementation is "injected" by the Spring Framework (Inversion of Control),
 * so this class doesn't need to know how to create its dependencies.
 *
 * This makes the system flexible, loosely coupled, and easy to test.
 */
@Service
public class NotificationService {

    private final MessageSender messageSender;

    // The dependency is provided through the constructor.
    @Autowired
    public NotificationService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public String send(String message) {
        return messageSender.send(message);
    }
}

