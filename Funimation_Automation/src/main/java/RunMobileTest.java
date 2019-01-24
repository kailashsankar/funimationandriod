import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import Utils.AppDriver;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import com.cucumber.listener.Reporter;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		plugin = {
			 "com.cucumber.listener.ExtentCucumberFormatter:Funimation_Report/Detailed-reports/report.html",
			 "pretty", "html:Funimation_Report/HtmlReport",
			 "json:Funimation_Report/cucumber.json" ,  // for json result
		     "junit:Funimation_Report/cucumber.xml",
		     "rerun:Funimation_Report/rerun.txt"
		},
		features = "src/test/resources/features",
		monochrome = true,
		
		tags ="@funimation,@funimation1"
)
public class RunMobileTest {
	@AfterClass
	 public static void writeExtentReport() {
	 Reporter.loadXMLConfig("E:/automation Frameworks/Funimation_Automation/src/main/resources/config/extent-config.xml");
	  AppDriver d=new AppDriver();
	  //d.RemoveApp();
	}
}
