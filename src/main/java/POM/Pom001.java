package POM;

import java.awt.Desktop.Action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentReporter;

public class Pom001 {
@FindBy(xpath = "//*[@class='js-modal-login c-header__login']")
WebElement login;
@FindBy(xpath = "//*[@class='o-button o-button--medium o-button-empty--blue c-rodo-modal__footer-button js-modal-close-btn']")
WebElement pop;
@FindBy(xpath = "(//*[@name='f_login'])[2]")
WebElement un;
@FindBy(xpath = "(//*[@name='f_password'])[2]")
WebElement pw;
@FindBy(xpath = "(//*[@type='submit'])[5]")
WebElement submit;
@FindBy(xpath = "(//*[@class=\"c-header__user-info\"])[1]")
WebElement act;
WebDriver driver;
public Pom001(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public void Popup() {
	pop.click();
	//WebDriverWait w=new WebDriverWait(idriver, 30);
	//w.until(ExpectedConditions.visibilityOf(login));
	//w.until(ExpectedConditions.elementToBeClickable(login));
}
public void login() {
	login.click();
}
public void user(String us) {
	un.sendKeys(us);
}
public void pas(String psw) {
	pw.sendKeys(psw);
}
public void Submit() {
	submit.click();
}
public void Verify(String ver) {
	String s = act.getText();
	System.out.println(s);
	SoftAssert ss=new SoftAssert();
	ss.assertEquals(s, ver);
	ss.assertAll();

}
public void report() {
	ExtentHtmlReporter reporter=new ExtentHtmlReporter("./reports/test1.html");
	ExtentReports event=new ExtentReports();
	event.attachReporter(reporter);
	ExtentTest logger = event.createTest("TestBook");
	logger.pass("open the browser");
	logger.pass("verify the username");
	logger.pass("verify the password");
	logger.pass("click on login");
	logger.pass("verify the custumer home page");
	event.flush();
	
	
	
	
	
}

}
