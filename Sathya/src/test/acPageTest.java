package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import base.baseClass;
import pages.SplitAC;
import pages.acPage;
import utility.excelWrite;

public class acPageTest extends baseClass {

	acPage acpage;
	SplitAC splitAC;
	excelWrite ex;
	@BeforeSuite
	public void initialise() {
		initializer();

		acpage = new acPage();
		splitAC = new SplitAC();
		ex=new excelWrite();
	}

	@Test // (priority = 1)
	public void home() throws Exception {


		acpage.acClick();
		Thread.sleep(10000);
		splitAC.splitAC();
		Thread.sleep(10000);
		ex.writeAllDetails();
	}

	@AfterSuite
	public void tearDown() {
		System.out.println(driver.getTitle());
		driver.quit();

	}
}