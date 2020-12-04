package org.project.reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {
	
private static ExtentReports extent;
	
	public static ExtentReports CreateInstance(String filename) {
		
		ExtentHtmlReporter htmlreporter = new ExtentHtmlReporter(filename);
		htmlreporter.config().setTheme(Theme.DARK);
		htmlreporter.config().setEncoding("utf-8");
		htmlreporter.config().setReportName("Project Report");
		
		extent = new ExtentReports();
		extent.attachReporter(htmlreporter);
        extent.setSystemInfo("window", "version 10");
        extent.setSystemInfo("Project Name", "My Project");
        
        return extent;
	}

}
