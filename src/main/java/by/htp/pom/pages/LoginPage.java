package by.htp.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends AbstractPage {
	public static final String URL_LOGIN_PAGE 
	="http://www.quizful.net/LoginAction.loginForm";
//	/html/body/div[1]/ul[2]/li[1]/b/a
	private By login_field = By.name("loginForm.login");
	private By pass_field = By.name("loginForm.password");
	private By rememberMe = By.name("loginForm.rememberMe");
	private By okButton = By.name("ok");

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@Override
	public void openPage() {
		driver.get(URL_LOGIN_PAGE);
	}
	
	public void logIn(String login, String pass) {
		driver.findElement(login_field).sendKeys(login);
		driver.findElement(pass_field).sendKeys(pass);
		driver.findElement(rememberMe).click();
		driver.findElement(okButton).click();
	}
	

}
