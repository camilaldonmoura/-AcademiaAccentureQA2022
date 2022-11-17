import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.Constants;
import utils.DriveContext;
import actions.ChoosingProductsAction;
import actions.CreatAccountAction;
import actions.LoggingAccountAction;
import pages.LoggingAccountPage;


class TestChoosingProducts {
	WebDriver driver;
	ChoosingProductsAction account;

	@BeforeEach
	void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", Constants.PATH_CHROMEDRIVER);
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage() .window() .maximize();
		System.out.println(driver.getTitle());
		Assert.assertEquals("My Store", driver.getTitle());
		WebElement linkSingIn = driver.findElement(By.linkText("Sign in"));
		linkSingIn.click();
		WebElement txtEmailLoggin = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		txtEmailLoggin.sendKeys("moura.camilaluiza@gmail.com");
		WebElement txtPasswd = driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
		txtPasswd.sendKeys("Teste@123");
		WebElement btnSubmitLogin = driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]"));
		btnSubmitLogin.click();
		
		
		DriveContext.setDriver(driver);
		account = new ChoosingProductsAction();
		
	}

	@AfterEach
	void tearDown() throws Exception {
		//driver.quit();
	}
	

	
	@Test
	void test () {
		
		account.clickbtnWomen();
		account.clickselectSale();
		account.clickbtnAddToCart();
		account.clickbtnCheckout();
		account.clickbtnQuantityUp();
		account.clickbtnProceedCheckout();
		account.writetxtLeiaEsseCampoPlease("Thanks, ladies and gentlemen, you've been great.");
		account.clickbtnProceedCheckout2();
		account.checkboxTerms();
		account.clickbtnProceedCheckout3();
		//account.clicklinkPayByBank();
		account.clicklinkPayByCheck();
		account.clickbtnConfirmMyOrder();
	
		
	}
}