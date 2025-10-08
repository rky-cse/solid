package me.rkycse.solid.isp.bad;

/**
 * BAD EXAMPLE: This interface violates the Interface Segregation Principle (ISP).
 * It's a "fat" interface because it forces implementing classes to define methods
 * they may not support.
 *
 * For example, a very simple, cheap printer might only be able to print. It would
 * be forced to provide implementations for scan() and fax(), which would likely
 * just throw an exception. This is a sign of a poor interface design.
 */
public interface MultiFunctionPrinter {
    void print(String document);
    void scan(String document);
    void fax(String document);
}

