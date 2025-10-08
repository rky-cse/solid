package me.rkycse.solid.lsp.bad;

/**
 * BAD EXAMPLE: A Penguin is a Bird, but it cannot fly.
 * This subclass has to throw an exception or provide an empty implementation for fly(),
 * which changes the expected behavior.
 * If a piece of code expects a `Bird` and gets a `Penguin`, calling `fly()` will cause
 * an unexpected error, violating LSP. A substitute (Penguin) should not break the program.
 */
public class Penguin extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Penguins can't fly!");
    }
}
