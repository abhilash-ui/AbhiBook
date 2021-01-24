package TestCases;

import org.testng.annotations.Test;

import POM.Pom001;
import POM.Pom003;

public class Test003 extends Base {
@Test
public void TestError() throws InterruptedException
{
	Pom001 p2=new Pom001(driver);
	p2.Popup();
	Thread.sleep(1000);
	p2.login();
	Thread.sleep(1000);
	p2.user(nus);
	Thread.sleep(1000);
	p2.pas(npsw);
	Thread.sleep(1000);
	p2.Submit();
	Pom003 p3=new Pom003(driver);
	p3.error();
}
}
