package TestCases;


import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



import POM.Pom001;
@Listeners(ContentListener.class)
public class Test001 extends Base {
	@Test
public void TestBook() throws InterruptedException {
	Pom001 p=new Pom001(driver);
	Thread.sleep(1000);
	p.Popup();
	Thread.sleep(2000);
	p.login();
	Thread.sleep(1000);
	p.user(us);
	Thread.sleep(1000);
	p.pas(psw);
	Thread.sleep(1000);
	p.Submit();
	Thread.sleep(1000);
	p.Verify(ver);
	//p.To(Too);
	//p.Date();
	//p.Audlt();
	//p.Submit();
	p.report();

	
}
}
