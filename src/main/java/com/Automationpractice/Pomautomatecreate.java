package com.Automationpractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pomautomatecreate {
	

	

	
		public static WebDriver driver;
		@FindBy(xpath="//a[@class='login']")
		private WebElement sin;
		//@FindBy(xpath="//a[@class='login']")
		//private WebElement sin;
		@FindBy(name="email")
		private WebElement  in;
		@FindBy (name="passwd")
		private WebElement pass;
		@FindBy(id="SubmitLogin")
		private WebElement click;
		@FindBy (xpath="//a[@title='Women']")
		private WebElement wom;
		@FindBy(xpath="(//a[@title='T-shirts'])[1]")
		private WebElement tshirt;
		@FindBy(xpath="//img[@title='Faded Short Sleeve T-shirts']")
		private WebElement pic1;
		@FindBy(xpath="//a[@class='quick-view']")
		private WebElement quickview;
		@FindBy(xpath="//iframe[@class='fancybox-iframe']")
		private WebElement fra;
		@FindBy(xpath="//a[@class='btn btn-default button-plus product_quantity_up']")
		private WebElement quantity;
		@FindBy(name="Submit")
		private WebElement place;
		@FindBy(xpath="//a[@title='Proceed to checkout']")
		private WebElement chek;
		@FindBy(xpath="//a[@title='Proceed to checkout'])[2]")
		private WebElement cout;
		
		@FindBy(xpath="//a[@title='Pay by check.']")
		private WebElement cheq;
		@FindBy(xpath="//button[@type='submit'])[2]")
		private WebElement conf;
		
		@FindBy(name="processAddress")
		private WebElement ccout;
		@FindBy(name="cgv")
		private WebElement term;
		@FindBy(xpath="//button[@type='submit'])[2]")
		private WebElement ccout2;
		
		@FindBy(xpath="//a[@class='button btn btn-default standard-checkout button-medium']")
		private WebElement Checkout1;
		@FindBy(xpath="//button[@class='button btn btn-default standard-checkout button-medium']")
		private WebElement checkout2;
		@FindBy(xpath="//button[@class='button btn btn-default button-medium']")
	   private WebElement forder;
		
		
		
		public Pomautomatecreate(WebDriver driver2) {
			this.driver = driver2;
			PageFactory.initElements(driver2, this);
		}
		public WebElement getForder() {
			return forder;
		}
		public WebElement getCheckout2() {
			return checkout2;
		}
		public void setCheckout2(WebElement checkout2) {
			this.checkout2 = checkout2;
		}
		public WebElement getCheckout1() {
			return Checkout1;
		}
		@FindBy(xpath="//i[@class='icon-plus']")
		private WebElement quantity1;
		
		@FindBy(name="Orange")
		private WebElement color;
		
		
		public WebElement getColor() {
			return color;
		}
		public WebElement getQuantity1() {
			return quantity1;
		}
		public WebElement getSize() {
			return size;
		}
		@FindBy(name="group_1")
		private WebElement size;
		
		public static WebDriver getDriver() {
			return driver;
		}
		public WebElement getCcout() {
			return ccout;
		}
		public WebElement getTerm() {
			return term;
		}
		public WebElement getCcout2() {
			return ccout2;
		}
		
		
		
		
		
		
		
		
		public WebElement getSin() {
			return sin;
		}
		public WebElement getIn() {
			return in;
		}
		public WebElement getPass() {
			return pass;
		}
		public WebElement getClick() {
			return click;
		}
		public WebElement getWom() {
			return wom;
		}
		public WebElement getTshirt() {
			return tshirt;
		}
		public WebElement getPic1() {
			return pic1;
		}
		public WebElement getQuickview() {
			return quickview;
		}
		public WebElement getFra() {
			return fra;
		}
		public WebElement getQuantity() {
			return quantity;
		}
		public WebElement getPlace() {
			return place;
		}
		public WebElement getChek() {
			return chek;
		}
		public WebElement getCout() {
			return cout;
		}
		public WebElement getCheq() {
			return cheq;
		}
		public WebElement getConf() {
			return conf;
		}
		
		
		
		
		
		
		
		
		
		
		

	}



