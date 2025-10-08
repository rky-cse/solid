package me.rkycse.solid.isp.good;



/**
 * GOOD EXAMPLE: This class only needs to print, so it implements the `Printer` interface.
 * It is not forced to implement methods it doesn't need, like scan() or fax().
 */
public class SimplePrinter implements Printer {
    @Override
    public String print(String document) {
        System.out.println("Printing document: " + document);
        return "SimplePrinter is printing.";
    }
}