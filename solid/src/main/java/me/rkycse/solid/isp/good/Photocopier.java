package me.rkycse.solid.isp.good;


/**
 * GOOD EXAMPLE: A photocopier can print and scan.
 * It can implement multiple small interfaces to compose the functionality it needs.
 * This is much more flexible and clean than implementing one large interface.
 */
public class Photocopier implements Printer, Scanner {
    @Override
    public String print(String document) {
        System.out.println("Photocopier is printing: " + document);
        return "Photocopier is printing.";
    }

    @Override
    public String scan(String document) {
        System.out.println("Photocopier is scanning: " + document);
        return "Photocopier is scanning.";
    }
}

