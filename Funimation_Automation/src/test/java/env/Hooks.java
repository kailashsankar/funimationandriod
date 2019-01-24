package env;

import io.appium.java_client.service.local.AppiumDriverLocalService;

import java.net.MalformedURLException;

import Utils.AppDriver;
import cucumber.api.Scenario;
import cucumber.api.java.*;


public class Hooks {
	AppDriver ap=new AppDriver();
	AppiumDriverLocalService appiumServ;
	public static int i=0;
	@Before()
	public void beforeScenario(Scenario scenario) throws MalformedURLException
	{
		
			System.out.println("**********started Server****");
			System.out.println("*******************************");
			appiumServ= ap.startServer();
			appiumServ.start();
		 System.out.println("*******");
		
	   
	}
	@After()
	public void afterScenario(Scenario scenario) {
     //ap.stopServer();
     appiumServ.stop();
	}
	
}
