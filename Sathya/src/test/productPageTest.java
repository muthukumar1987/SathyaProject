package test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.baseClass;
import pages.productPage;
import utility.excelWrite;


public class productPageTest extends baseClass{
	
	excelWrite ex;
//	productPage prod;
	
	@BeforeMethod
	public void initialise()
	{
//		initializer();
//		prod=new productPage();
		ex=new excelWrite();
	}
	@Test
	public void home() throws Exception
	{
		ex.writeAllDetails();
	}
	
	

}
