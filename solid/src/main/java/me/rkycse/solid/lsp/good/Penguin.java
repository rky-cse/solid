package me.rkycse.solid.lsp.good;



/**
 * GOOD EXAMPLE: A Penguin is still a Bird and can be substituted for one.
 * Since the base `Bird` class has no `fly` method, there is no contract to break.
 * The substitution is valid and safe.
 */
public class Penguin extends Bird {
    // Penguins can have their own specific behaviors, like swimming.
    public String swim() {
        return "This penguin is swimming.";
    }
}

