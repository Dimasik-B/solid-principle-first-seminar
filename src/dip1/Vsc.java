package dip1;

import dip1.model.ConsoleReporter;
import dip1.model.Report;
import dip1.model.ReportManager;
import logger.Log;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Vsc {
    private static final Logger log = Log.log(Vsc.class.getName());
    public static void main(String[] args) {
        log.log(Level.INFO, "Method main in model package started");
        Report report = new Report();
        report.calculate();
        ReportManager rm = new ReportManager(new ConsoleReporter());
        rm.output(report.getItems());
    }
}
