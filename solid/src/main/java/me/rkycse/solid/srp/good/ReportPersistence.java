package me.rkycse.solid.srp.good;

/**
 * GOOD EXAMPLE: This class adheres to the Single Responsibility Principle (SRP).
 * Its only responsibility is to handle the persistence of the report.
 * If we need to change how reports are saved (e.g., to a database, cloud storage),
 * this is the only class we need to modify.
 */
public class ReportPersistence {

    public void saveToFile(String filename, String reportContent) {
        System.out.println("Saving report content to file: " + filename);
        // File saving logic would go here.
    }
}
