package org.Util;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBloginPojo extends BaseClass {
	
	public FBloginPojo() {
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(id="email")
	private WebElement txtUser;
	
	@FindBy(id="pass")
	private WebElement txtPass;
	
	@FindBy(xpath="//button[@name='login']")
	private WebElement btnLogin;
	
	@FindBy(xpath="//a[contains(text(),'Forgotten password?')]")
	private WebElement click;
	
	@FindBy(id="identify_email")
	private WebElement enterEmail;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement search;




	public WebElement getEnterEmail() {
		return enterEmail;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getClick() {
		return click;
	}

	public WebElement getTxtUser() {
		return txtUser;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
		

	

	

}
