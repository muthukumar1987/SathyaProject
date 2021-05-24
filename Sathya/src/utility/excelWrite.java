package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import base.baseClass;







public class excelWrite extends baseClass {
	//	static WebElement feature;
	public void writeAllDetails() throws Exception
	{

		//Opening 24 AC and writing their Features in Excel Sheet


		String Before_Xpath = "(//article[@class='art'])[";
		String After_Xpath="]";

		// WebDriverWait wait=new WebDriverWait(driver,2);

		File file = new File("D:\\Testing Class\\TestNG\\Sathya\\Sathya_ACFeatures.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);

		List <String> AllTitle = new ArrayList();
		int count1=1;
		int count2=0;

		
		
		for(int i=1;i<5;i++){
			try {

				
				
				driver.findElement(By.xpath(Before_Xpath+i+After_Xpath)).click();


				// Name of Split AC
//				String heading = driver.findElement(By.xpath("//div[@class='page-title']")).getText();

				// Feature Heading
//				WebDriverWait wait2 = new WebDriverWait(driver, 10);
//				wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("(//a[@class='nav-link'])[2]")));
//				
				driver.findElement(By.xpath("(//a[@class='nav-link'])[2]")).click();
								
//				List <String> FeatureHeading = new ArrayList<String>();

				WebElement table = driver.findElement(By.xpath("//table[@class='table pd-specs-table']"));
				
				
				List<WebElement> rowList = table.findElements(By.tagName("tr"));
				
			String head = driver.getTitle();
				sheet.createRow(i);
				sheet.getRow(i).createCell(0).setCellValue(head);

				for (int r = 1; r < rowList.size(); r++) 
				{
					List<WebElement> colList = rowList.get(r).findElements(By.tagName("td"));
					
					for (int c = 0; c < colList.size(); c++) 
					{
						String text1 = colList.get(c).getText();
						sheet.getRow(i).createCell(r);
						sheet.getRow(i).getCell(r).setCellValue(text1);
					}
				}

				sheet.createRow(0);
				sheet.getRow(0).createCell(0).setCellValue("Product Name");
				List<WebElement> rowList1 = table.findElements(By.tagName("tr"));

				for (int r1 = 1; r1 < rowList1.size(); r1++) 
				{
					List<WebElement> colList1 = rowList1.get(r1).findElements(By.tagName("td"));
					String text2 = colList1.get(0).getText();

					sheet.getRow(0).createCell(r1);
					sheet.getRow(0).getCell(r1).setCellValue(text2);

					System.out.println(text2);

					
				}

				
				driver.findElement(By.xpath("//li[@class='breadcrumb-item'][4]")).click();
				

			}
			catch (Exception e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}





		}

		FileOutputStream fos=new FileOutputStream(file);
		wb.write(fos);
		fos.close();


	}
}
