package me.rkycse.solid.ocp.good;

/**
 * GOOD EXAMPLE: This is the abstraction that enables the Open/Closed Principle (OCP).
 * We define a contract that all notification providers must follow.
 */
public interface NotificationProvider {
    String send(String message);
}

