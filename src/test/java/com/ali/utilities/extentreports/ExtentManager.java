//package com.ali.utilities.extentreports;
//
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.reporter.ExtentSparkReporter;
//
//public class ExtentManager {
//    public static final ExtentReports extentReports = new ExtentReports();
//    public synchronized static ExtentReports createExtentReports() {
//        ExtentSparkReporter reporter = new ExtentSparkReporter("./extentreports/extent-report.html");
//        reporter.config().setReportName("Sample Extent Report");
//        extentReports.attachReporter(reporter);
//        extentReports.setSystemInfo("Blog Name", "SW Test Academy");
//        extentReports.setSystemInfo("Author", "Ali Zengin");
//        return extentReports;
//    }
//}