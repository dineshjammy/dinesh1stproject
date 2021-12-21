package org.stepdefinition;




import org.Util.BaseClass;
import org.Util.FBloginPojo;
import org.junit.Assert;

import io.cucumber.java.en.*;


public class FBLoginDefinition extends BaseClass {
	
	@Given("User should  launch the browser and load the facebook page")
	public void user_should_launch_the_browser_and_load_the_facebook_page() {
	   launchChrome();
	   loadUrl("https://wwww.facebook.com");
	   winMax();
	   
	}

	@When("User should type the username in the facebook page")
	public void user_should_type_the_username_in_the_facebook_page() {
	   FBloginPojo f = new FBloginPojo();
	   fill(f.getTxtUser(), "Dinesh");
	}

	@When("User should type the password in the facebook page")
	public void user_should_type_the_password_in_the_facebook_page() {
	    FBloginPojo f = new FBloginPojo();
	    fill(f.getTxtPass(), "dinesh@");
	}

	@When("User should click the login button")
	public void user_should_click_the_login_button() throws InterruptedException {
	   FBloginPojo f = new FBloginPojo();
	   btnClick(f.getBtnLogin());
	   Thread.sleep(2000);
	}

	@Then("User should navigate to incorrect credential page")
	public void user_should_navigate_to_incorrect_credential_page() {
	    String currentUrl = driver.getCurrentUrl();
	    Assert.assertTrue("Verify the url",currentUrl.contains("privacy"));
	    System.out.println("Passed");
	}


	

}



