package me.rkycse.solid.lsp.bad;

/**
 * BAD EXAMPLE: This design violates the Liskov Substitution Principle (LSP).
 * The base class `Bird` assumes that all birds can fly.
 */
public class Bird {
    public void fly() {
        System.out.println("Bird is flying");
    }
}

