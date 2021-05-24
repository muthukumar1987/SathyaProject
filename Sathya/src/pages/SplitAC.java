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


public class SplitAC extends baseClass
{
	
	@FindBy(xpath="(//article[@class='art'][1]//a[@title='Split AC'])")
	static WebElement splitac;
	

	public SplitAC() {
		PageFactory.initElements(driver, this);
	}

	
	public void splitAC() {
		splitac.click();
	}

}



