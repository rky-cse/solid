package me.rkycse.solid.isp.good;


/**
 * GOOD EXAMPLE: This interface adheres to the Interface Segregation Principle (ISP).
 * It is small, cohesive, and focused on a single capability: printing.
 */
public interface Printer {
    String print(String document);
}
