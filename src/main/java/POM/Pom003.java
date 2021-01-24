package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pom003 {
@FindBy(xpath = "//*[text()='Login and/or password is incorrect. ']")
WebElement error;
WebDriver driver;
public Pom003(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);

}
public void error() {
	String s = error.getText();
	
	System.out.println(s);
	
}
}
