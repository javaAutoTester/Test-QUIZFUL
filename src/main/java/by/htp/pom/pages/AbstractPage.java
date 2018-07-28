package by.htp.pom.pages;

import org.openqa.selenium.WebDriver;

public abstract class AbstractPage {
	
	protected WebDriver driver;

	public AbstractPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public abstract void openPage();
	
}