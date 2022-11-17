package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utils.DriveContext;

public class ChoosingProductsPage {
	public ChoosingProductsPage() {
		PageFactory.initElements(DriveContext.getDriver(), this);
	}
	
	@FindBy(how=How.XPATH, using="//*[@id=\"block_top_menu\"]/ul/li[1]/a")	
	protected WebElement btnWomen;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"categories_block_left\"]/div/ul/li[1]/span")	
	protected WebElement radioMoreTops;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"categories_block_left\"]/div/ul/li[1]/ul/li[2]/a")	
	protected WebElement categoryBlouses;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"special_block_right\"]/div/ul/li/a")	
	protected WebElement selectSale;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"center_column\"]/ul/li/a")	
	protected WebElement btnHome;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"homefeatured\"]/li[4]/div/div[1]/div/a[1]")	
	protected WebElement selectDress;
	
		@FindBy(how=How.ID, using="add_to_cart")	
	protected WebElement btnAddToCart;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")	
	protected WebElement btnCheckout;
	
	@FindBy(how=How.ID, using="cart_quantity_up_7_34_0_677837")	
	protected WebElement btnQuantityUp;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"center_column\"]/p[2]/a[1]")	
	protected WebElement btnProceedCheckout;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"ordermsg\"]/textarea")	
	protected WebElement txtLeiaEsseCampoPlease;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"center_column\"]/form/p/button")	
	protected WebElement btnProceedCheckout2;
	
	@FindBy(how=How.ID, using="uniform-cgv")	
	protected WebElement checkboxTerms;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"form\"]/p/button")	
	protected WebElement btnProceedCheckout3;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")	
	protected WebElement linkPayByBank;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"cart_navigation\"]/button")	
	protected WebElement btnConfirmMyOrder;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a")	
	protected WebElement linkPayByCheck;
	
	
}
