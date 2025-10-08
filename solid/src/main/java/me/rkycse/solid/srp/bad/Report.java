package me.rkycse.solid.srp.bad;

/**
 * BAD EXAMPLE: This class violates the Single Responsibility Principle (SRP).
 * It has two responsibilities:
 * 1. Generating the report content.
 * 2. Saving the report to a file.
 *
 * This means there are two reasons for this class to change. If the report format changes,
 * we must change this class. If the persistence logic changes (e.g., save to a database instead of a file),
 * we must also change this class.
 */
public class Report {

    public String generateReport(String data) {
        System.out.println("Generating report with data: " + data);
        return "Report Content: " + data;
    }

    public void saveToFile(String filename, String reportContent) {
        System.out.println("Saving report content to file: " + filename);
        // File saving logic would go here.
    }
}
