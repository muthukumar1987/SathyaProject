package pages;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.baseClass;


public class acPage extends baseClass
{
	
	@FindBy(xpath="//div[@class='art-genericname']//a[contains(@title, 'Air Conditioner')]")
	 static WebElement ac;


	public acPage() {
		PageFactory.initElements(driver, this);
	}


	
	public SplitAC acClick() {
		ac.click();
		return new SplitAC();
	}


	}
