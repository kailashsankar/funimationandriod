package Models;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

public class MainScreen {
	//constructor to initialize the AndroidDriver
		 public MainScreen(AndroidDriver<AndroidElement> driver){
		    	PageFactory.initElements(new AppiumFieldDecorator(driver,10,TimeUnit.SECONDS), this);
	    }
		 
		 
	 //Define the Web elements of Login screen
		@AndroidFindBy(id="com.Funimation.FunimationNow:id/toolbarMenuButton")
	   public static  AndroidElement MainMenuButton;
		
		@AndroidFindBy(xpath="//android.widget.RelativeLayout[@index='1']/ android.widget.ImageButton[@index='1']")
		   public static  AndroidElement addShow;
		
}
