package TestCases;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POM.Pom001;
import POM.Pom002;

@Listeners(ContentListener.class)
public class Test002 extends Base {
	@Test
public void Testproduct() throws InterruptedException {
	Pom001 pp=new Pom001(driver);
	pp.Popup();
	Thread.sleep(1000);
	pp.login();
	Thread.sleep(1000);
	pp.user(us);
	Thread.sleep(1000);
	pp.pas(psw);
	Thread.sleep(1000);
	pp.Submit();
	
	Pom002 p1=new Pom002(driver);
	p1.Product();
	Thread.sleep(1000);
	p1.Semi();
	Thread.sleep(1000);
	p1.Diode();
	Thread.sleep(1000);
	p1.universal();
	Thread.sleep(1000);
	p1.smd();
	p1.report();
	
}
}
