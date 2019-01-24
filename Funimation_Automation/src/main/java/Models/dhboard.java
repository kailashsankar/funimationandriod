package Models;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

public class dhboard {

	//constructor to initialize the AndroidDriver
	 public dhboard(AndroidDriver<AndroidElement> driver){
	    	PageFactory.initElements(new AppiumFieldDecorator(driver,10,TimeUnit.SECONDS), this);
    }
	 
	 
 //Define the Web elements of dashboard screen
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Settings']")
   public static  AndroidElement fun_settings;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Log Out']")
	   public static  AndroidElement Log_Out;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Home']")
	   public static  AndroidElement Home;
	
	@AndroidFindBy(id="android:id/button1")
	   public static  AndroidElement popup_yes_button;
	
	@AndroidFindBy(id="com.Funimation.FunimationNow:id/settingsEmailTextView")
	   public static  AndroidElement yourmail_value;
	

  
}
