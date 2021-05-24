package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.baseClass;

public class productPage extends baseClass {

	public acPage navigateToac() throws InterruptedException {
		// Navigate HomePage to Desktop page
//		Actions action = new Actions(driver);
//		WebDriverWait wait = new WebDriverWait(driver,2);
//		wait.until(ExpectedConditions.elementToBeClickable(ac));
//		action.moveToElement(ac).build().perform();
		Thread.sleep(3000);
//		ac.click();
//		wait.until(ExpectedConditions.elementToBeClickable(splitac));
		Thread.sleep(10000);
//		splitac.click();
		return new acPage();
	}

}
