package Utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;



public class AppDriver {
	
	AndroidDriver driver;
	public AppDriver()
	{
		
	}
	 
	  DesiredCapabilities capabilities = new DesiredCapabilities();  
	  public void launch() throws MalformedURLException
	  {
		        
	       capabilities.setCapability("appium-version", "10.1");
	       capabilities.setCapability("platformName", "Android");
	        capabilities.setCapability("udid", "420038a5d34e3387");
	       capabilities.setCapability("platformVersion", "6.0.1");
	       capabilities.setCapability("deviceName", "Galaxy On5");
//	       capabilities.setCapability("deviceName", "Galaxy J7");
//	       capabilities.setCapability("udid", "3300109bd6f8a28d");
	        capabilities.setCapability("browserName", "");
	        capabilities.setCapability("autoGrantPermissions","true");
	        capabilities.setCapability("noReset","true");
	        capabilities.setCapability("app", "E:\\automation Frameworks\\cucumber-java-selenium\\Funimation_Automation\\src\\main\\java\\App\\FunimationNow.apk");
	        capabilities.setCapability("appPackage", "com.Funimation.FunimationNow");
	        capabilities.setCapability("appActivity", "com.funimation.ui.splash.SplashActivity");
	        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	  }
	  
	  public  AndroidDriver getAndDriver() throws MalformedURLException
	  {
		  return new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	  }
	  
	  public AppiumDriverLocalService startServer()
	  {
		  AppiumDriverLocalService service = AppiumDriverLocalService
				  .buildService(new AppiumServiceBuilder().usingDriverExecutable(new File("C:\\Program Files\\nodejs\\node.exe"))
				  .withAppiumJS(new File("C:\\Users\\windows\\AppData\\Local\\Programs\\Appium\\resources\\app\\node_modules\\appium\\build\\lib\\main.js"))
				  );
				  //service.start();
				  return service;
	  }
	
		public void stopServer() {
		Runtime runtime = Runtime.getRuntime();
		try {
		   // runtime.exec("taskkill /F /IM node.exe");
		    driver=getAndDriver();
		    driver.quit();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		}
		
		public void RemoveApp()
		{
			driver.removeApp("com.Funimation.FunimationNow");
		}
		
}
