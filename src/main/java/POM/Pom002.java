package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Pom002 {
	WebDriver driver;
	public Pom002(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
@FindBy(xpath = "(//*[@class='c-main-page-button o-button o-button--medium o-button-empty--red'])[1]")
WebElement product;
@FindBy(xpath = "(//*[@class='c-catalogue__index-box'])[1]")
WebElement semiconductor;
@FindBy(xpath = "//*[text()='Diodes']")
WebElement diode; 
@FindBy(xpath = "//*[text()='Universal diodes']")
WebElement unidiode;
@FindBy(xpath = "//*[text()='SMD universal diodes']")
WebElement smddiode;

public void Product() {
	product.click();
}
public void Semi() {
	semiconductor.click();
}
public void Diode() {
	diode.click();
}
public void universal() {
	unidiode.click();
}
public void smd() {
	smddiode.click();
}
public void report() {
	ExtentHtmlReporter reporter=new ExtentHtmlReporter("./reports/test2.html");
	ExtentReports event=new ExtentReports();
	event.attachReporter(reporter);
	ExtentTest logger = event.createTest("TestProduct");
	logger.pass("Click the product link");
	logger.pass("verify the semiconductor link");
	logger.pass("verify the diode link");
	logger.pass("verify the universal link");
	logger.pass("verify the smddiode link");
	event.flush();
}
}
