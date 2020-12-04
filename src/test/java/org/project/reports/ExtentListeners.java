package org.project.reports;

import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;


public class ExtentListeners implements ITestListener {
	
	static Date d = new Date();
	static String filename = "Extent_"+d.toString().replace(":", "_").replace(",", "_")+".html";
	private static ExtentReports extent = ExtentManager.CreateInstance("./src/test/resources/reports/"+filename);
	public ExtentTest test;
	
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		test=extent.createTest(result.getMethod().getMethodName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		String methodname = result.getMethod().getMethodName();
		Markup m = MarkupHelper.createLabel(methodname, ExtentColor.LIME);
		test.pass(m);
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		String methodname = result.getMethod().getMethodName();
		Markup m = MarkupHelper.createLabel(methodname, ExtentColor.RED);
		test.fail(m);
		
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	
	

}
