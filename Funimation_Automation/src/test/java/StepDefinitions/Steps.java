package StepDefinitions;


import org.junit.Assert;
import org.openqa.selenium.By;

import Models.dhboard;
import Models.Login;
import Models.MainScreen;
import Models.Splash;
import Utils.AppDriver;
import Utils.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import cucumber.api.java.en.*;

public class Steps{

	
	
	AndroidDriver driver;
	AppDriver ad;
	Splash sp;
	Login lg;
	dhboard dh;
	MainScreen ms;
	TouchAction a2;
	
	
	@Given("^I launch the \"([^\"]*)\"$")
	public void i_launch_the(String arg1) throws Throwable {
	    ad=new AppDriver();
	    ad.launch();
	    driver=ad.getAndDriver();
	    BasePage.delay(3);
	    
	}

	@Given("^I should see \"([^\"]*)\" button$")
	public void i_should_see_button(String arg1) throws Throwable {
	  sp=new Splash(driver);
	  boolean s=sp.verifyLoginButton();
	  Assert.assertTrue(s);
	}

	@Then("^I should click \"([^\"]*)\" button\"$")
	public void i_should_click_button(String arg1) throws Throwable {
		sp.clickLoginButton();
	}
	
	@Then("^I should enter \"([^\"]*)\"$")
	public void i_should_enter(String value) throws Throwable {
		switch (value)
		{
		case "Username":lg=new Login(driver); Login.emailAddress.sendKeys("uatfuni+1548242372367@gmail.com");BasePage.delay(3); BasePage.goBack(driver); break;
		case "Password":lg=new Login(driver); Login.password.sendKeys("Testing@123");BasePage.delay(2);BasePage.goBack(driver); break;
		default: 
		}
	}
	
	@Then("^I click on \"([^\"]*)\" button on \"([^\"]*)\"$")
	public void i_click_on_button_on(String value, String value1) throws Throwable {
		switch (value)
		{
		case "Login":lg=new Login(driver); Login.loginButton.click(); BasePage.delay(3);break;
		case "Menu":ms=new MainScreen(driver); MainScreen.MainMenuButton.click(); break;
		case "Home":dhboard.Home.click();break;
		default: 
		}
	}
	
	@Then("^I click on \"([^\"]*)\" link on Menu list$")
	public void i_click_on_link_on_Menu_list(String value) throws Throwable {
	    switch(value)
	    {
	    case "settings":dh=new dhboard(driver); dhboard.fun_settings.click(); BasePage.delay(3);break;
	    }
	}

	@Then("^I should verify \"([^\"]*)\" as \"([^\"]*)\"$")
	public void i_should_verify_as(String value1, String value2) throws Throwable {
	   switch (value1)
	   {
		   case "Your Mail": dh=new dhboard(driver);
		                      Assert.assertEquals(value2, dhboard.yourmail_value.getText());
		                      BasePage.delay(3);
			                  break;
		  default:
			     }
	   }
	@Then("^I should \"([^\"]*)\" a show$")
	public void i_should_a_show(String value) throws Throwable {
		 a2 = new TouchAction(driver);
			a2.tap (601, 288).perform();
	}

	
	
	@Then("^I should logout the \"([^\"]*)\"$")
	public void i_should_logout_the(String value) throws Throwable {
		ms=new MainScreen(driver);
		MainScreen.MainMenuButton.click();
		dh=new dhboard(driver);
		BasePage.delay(3);
		 a2 = new TouchAction(driver);
		a2.tap (50, 1163).perform();
		//dhboard.Log_Out.click();
		dhboard.popup_yes_button.click();
	}
	}

	

