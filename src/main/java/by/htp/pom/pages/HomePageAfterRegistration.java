package by.htp.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageAfterRegistration extends AbstractPage {
	
	private static final By USER_PANEL_LOGIN = By.xpath("/html/body/div[1]/ul[2]/li[1]/b/a");
	private static final By USER_PANEL_EXIT = By.xpath("/html/body/div[1]/ul[2]/li[7]/a");

	public HomePageAfterRegistration(WebDriver driver) {
		super(driver);
	}

	@Override
	public void openPage() {
		// TODO Auto-generated method stub
		
	}
	
	public String returnUserLogin() {
		String actualUserLogin = driver.findElement(USER_PANEL_LOGIN).getText().trim();
//		System.out.println("actualUserLogin: "+actualUserLogin);
	return actualUserLogin;
	}
	
	public void pressExit() {
		driver.findElement(USER_PANEL_EXIT).click();
	}
}
