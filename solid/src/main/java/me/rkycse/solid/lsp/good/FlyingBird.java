package me.rkycse.solid.lsp.good;


/**
 * GOOD EXAMPLE: We create a more specific base class for birds that can fly.
 * Any object of type FlyingBird can be substituted for a Bird without issues.
 * Code that requires flying behavior can now safely expect a `FlyingBird` object.
 */
public class FlyingBird extends Bird {
    public String fly() {
        return "This bird is flying.";
    }
}

