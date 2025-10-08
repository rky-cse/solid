package me.rkycse.solid.dip.good;



/**
 * GOOD EXAMPLE: This interface is the abstraction that both high-level and low-level
 * modules will depend on, adhering to the Dependency Inversion Principle (DIP).
 */
public interface MessageSender {
    String send(String message);
}

