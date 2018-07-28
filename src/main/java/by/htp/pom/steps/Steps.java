package by.htp.pom.steps;

import org.openqa.selenium.WebDriver;

import by.htp.pom.pages.HomePageAfterRegistration;
import by.htp.pom.pages.LoginPage;

public class Steps {
	
//	private static final String LOGIN = "login_HbL";
//	private static final String PASS = "sqltester@tut.by";
	
	private WebDriver driver;

	public Steps(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public void loginQuizful(String login, String pass) {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.openPage();
		loginPage.logIn(login, pass);
	}
	
	public boolean isLoggedIn(String expectedUserName) {
		HomePageAfterRegistration homePage = new HomePageAfterRegistration(driver);
		String actualUserName = homePage.returnUserLogin();
		homePage.pressExit();
		return expectedUserName.equals(actualUserName);
	}

}
