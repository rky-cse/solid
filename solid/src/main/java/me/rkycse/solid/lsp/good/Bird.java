package me.rkycse.solid.lsp.good;


/**
 * GOOD EXAMPLE: This base class adheres to the Liskov Substitution Principle (LSP).
 * It only contains behavior common to ALL birds, such as eating.
 * It does not make assumptions about abilities that only some birds have (like flying).
 */
public class Bird {
    public String eat() {
        return "This bird is eating.";
    }
}

