package dip1.model;

import dip1.model.util.Reportable;

import java.util.List;

public class ConsoleReporter implements Reportable {
    @Override
    public void output(List<ReportItem> items) {
        System.err.println("Output to console");
        for (ReportItem item : items) {
            System.err.format("console %s - %f \n\r", item.getDescription(), item.getAmount());
        }
    }
}
