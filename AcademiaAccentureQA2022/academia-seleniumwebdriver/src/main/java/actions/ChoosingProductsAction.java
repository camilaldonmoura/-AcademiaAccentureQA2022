package actions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.ChoosingProductsPage;
import pages.CreatAccountPage;
import pages.LoggingAccountPage;
import utils.DriveContext;



public class ChoosingProductsAction extends ChoosingProductsPage  {
	protected WebDriverWait wait; 
	
	public ChoosingProductsAction() {
		wait = new WebDriverWait(DriveContext.getDriver(),20);	
		}
	
	public void clickbtnWomen() {
		wait.until(ExpectedConditions.elementToBeClickable(btnWomen)).click();
	}
	public void clickradioMoreTops() {
		wait.until(ExpectedConditions.elementToBeClickable(radioMoreTops)).click();
	
	}
	public void clickcategoryBlouses() {
		wait.until(ExpectedConditions.elementToBeClickable(categoryBlouses)).click();

	}
	public void clickselectSale() {
		wait.until(ExpectedConditions.elementToBeClickable(selectSale)).click();

	}
	public void clickbtnHome() {
		wait.until(ExpectedConditions.elementToBeClickable(btnHome)).click();

	}
	
	public void clickselectDress() {
		wait.until(ExpectedConditions.elementToBeClickable(selectDress)).click();

	}
	public void clickbtnAddToCart() {
		wait.until(ExpectedConditions.elementToBeClickable(btnAddToCart)).click();

	}
	public void clickbtnCheckout() {
		wait.until(ExpectedConditions.elementToBeClickable(btnCheckout)).click();

	}
	public void clickbtnQuantityUp() {
		wait.until(ExpectedConditions.elementToBeClickable(btnQuantityUp)).click();
	
	}
	public void clickbtnProceedCheckout() {
		wait.until(ExpectedConditions.elementToBeClickable(btnProceedCheckout)).click();	

	}
	public void writetxtLeiaEsseCampoPlease(String leiaPlease) {
		wait.until(ExpectedConditions.visibilityOf(txtLeiaEsseCampoPlease)).sendKeys(leiaPlease);
	
	}
	public void clickbtnProceedCheckout2() {
		wait.until(ExpectedConditions.elementToBeClickable(btnProceedCheckout2)).click();	

	}
	public void checkboxTerms() {
		wait.until(ExpectedConditions.elementToBeClickable(checkboxTerms)).click();	
				
	}
	public void clickbtnProceedCheckout3() {
		wait.until(ExpectedConditions.elementToBeClickable(btnProceedCheckout3)).click();	
				
	}
	public void clicklinkPayByBank() {
		wait.until(ExpectedConditions.elementToBeClickable(linkPayByBank)).click();
	}
	public void clickbtnConfirmMyOrder() {
		wait.until(ExpectedConditions.elementToBeClickable(btnConfirmMyOrder)).click();
	
	}
	public void clicklinkPayByCheck() {
		wait.until(ExpectedConditions.elementToBeClickable(linkPayByCheck)).click();
				
	}
}
