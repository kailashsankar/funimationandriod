package Models;

import java.util.concurrent.TimeUnit;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;



public class Splash {
	
	//constructor to initialize the AndroidDriver
	 public Splash(AndroidDriver<AndroidElement> driver){
	    	PageFactory.initElements(new AppiumFieldDecorator(driver,10,TimeUnit.SECONDS), this);
     }
	 
	 
  //Define the Web elements of Splash screen
	@AndroidFindBy(id="com.Funimation.FunimationNow:id/welcomeLoginButton")
    private  AndroidElement loginbutton;

    @AndroidFindBy(id="com.Funimation.FunimationNow:id/startTrialButton")
    private AndroidElement Start_your_Free_Trail;  
    
    
   
    
   //method to verify the Login button and return the boolean value
    public boolean verifyLoginButton()
    {
    	if (loginbutton.getText().equals("Log In"))
			return true;
		else
			return false;
    	
    }
    
    //method to click the Login button on Splash screen
    public void clickLoginButton()
    {
    	loginbutton.click();
    }
    }
	

