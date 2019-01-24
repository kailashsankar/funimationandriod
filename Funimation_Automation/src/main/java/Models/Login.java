package Models;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

public class Login {
	
	//constructor to initialize the AndroidDriver
		 public Login(AndroidDriver<AndroidElement> driver){
		    	PageFactory.initElements(new AppiumFieldDecorator(driver,10,TimeUnit.SECONDS), this);
	     }
		 
		 
	  //Define the Web elements of Login screen
		@AndroidFindBy(id="com.Funimation.FunimationNow:id/editTextEmail")
	    public static  AndroidElement emailAddress;

	    @AndroidFindBy(id="com.Funimation.FunimationNow:id/editTextPassword")
	    public static AndroidElement password;  
	    
	    @AndroidFindBy(id="com.Funimation.FunimationNow:id/loginButton")
	    public static AndroidElement loginButton; 
	    
	    
	   

}
