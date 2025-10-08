package me.rkycse.solid.srp.good;



/**
 * GOOD EXAMPLE: This class adheres to the Single Responsibility Principle (SRP).
 * Its only responsibility is to generate report content.
 * If the report format needs to change, this is the only class we need to modify.
 */
public class ReportGenerator {
    public String generateReport(String data) {
        System.out.println("Generating report with data: " + data);
        return "Report Content: " + data;
    }
}

