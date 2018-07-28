package by.htp.pom.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import by.htp.pom.pages.HomePageAfterRegistration;
import by.htp.pom.pages.LoginPage;
import by.htp.pom.steps.Steps;

public class LoginPageTest {
	
	private static final String LOGIN = "login_HbL";
	private static final String PASS = "sqltester@tut.by";
	private static final String EXPECTED_USER_LOGIN = "login_HbL";
	private WebDriver driver;

	@BeforeTest
	public void driverInit() {
		driver = new FirefoxDriver();
	}

/*	Without Steps
	@Test
	public void oneCanLogin() {	
		LoginPage loginPage = new LoginPage(driver);
		loginPage.openPage();
		loginPage.logIn(LOGIN, PASS);
		HomePageAfterRegistration homePage = new HomePageAfterRegistration(driver);
		String actualUserLogin = homePage.returnUserLogin();
		Assert.assertEquals(EXPECTED_USER_LOGIN, actualUserLogin);
		homePage.pressExit();
	}
*/
	
// With Steps
	@Test
	public void oneCanLogin() {
		Steps steps = new Steps(driver);
		steps.loginQuizful(LOGIN, PASS);
		Assert.assertTrue(steps.isLoggedIn(EXPECTED_USER_LOGIN));
	}
	
	
	
	@AfterTest
	public void driverClose() {
		driver.close();
	}
}