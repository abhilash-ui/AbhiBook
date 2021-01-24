package TestCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utils.readconfig;



public class Base {


	
WebDriver driver;
String us;
String psw;
String ver;
String nus;
String npsw;
public Base() {
	
	readconfig r=new readconfig();
	us=r.user();
	psw=r.pass();
	ver=r.veri();
	nus=r.Neguss();
	npsw=r.Negpss();

}
@BeforeMethod
public void SetUp() {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.tme.com/in/en/");
	driver.manage().window().maximize();
	
	
}
@AfterMethod
public void TearDown() {
	//driver.quit();
}
public void fail()
{
EventFiringWebDriver e=new EventFiringWebDriver(driver);
File src1 = e.getScreenshotAs(OutputType.FILE);
File dest1=new File(".screenshot/screen.png");
try {
	FileUtils.copyFile(src1, dest1);
} catch (IOException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}
}
}
