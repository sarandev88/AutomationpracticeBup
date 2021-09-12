package com.Automationpractice;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Automationpractice.Baseclass;
import com.Automationpractice.Pomautomatecreate;


public class Miniproject extends Baseclass {

	
	



	
	
		
		public static WebDriver driver;
		
		public static void main(String[] args) throws InterruptedException, IOException {
			 
		
			//System.getProperty("webdriver.chrome.driver",
				//	"D:\\saranya\\Selenium_Project\\src\\newselenium\\Minipro3.java");
			//WebDriver driver = new ChromeDriver();
			Thread.sleep(3000);
			 	driver =  browserLaunch("chrome");
		getUrl("http://automationpractice.com/index.php");
		Pomautomatecreate ac = new Pomautomatecreate(driver);	
		
				//driver.get("http://automationpractice.com/index.php");
			
			//driver.manage().window().maximize();
			//Thread.sleep(2000);
			//WebElement sin = driver.findElement(By.xpath("//a[@class='login']"));
		   //clickOnElement(ac.getSin());
			//sin.click();
			//clickOnElement(sin);
			//Thread.sleep(3000);
			
			
			clickOnElement(ac.getSin());
		
			//WebElement in = driver.findElement(By.name("email"));
						//WebDriverWait wait1 = new WebDriverWait(driver, 20);
			//wait1.until(ExpectedConditions.visibilityOf(in));
			//in.sendKeys("sarandev586@gmail.com");
			//sendValues(in, "sarandev586@gmail.com");
			waitimpli(200);
			sendValues(ac.getIn(), "sarandev586@gmail.com");
			
			
			//WebElement pass = driver.findElement(By.name("passwd"));
			
			//pass.sendKeys("Theepikaa88$");
			//sendValues(pass, "Theepikaa88$");
			
			sendValues(ac.getPass(), "Theepikaa88$");
			
			
			//WebElement click = driver.findElement(By.id("SubmitLogin"));
			//click.click();
			//clickOnElement(click);
			
			clickOnElement(ac.getClick());
			
			
		//	Actions as = new Actions(driver);
			//WebElement wom = driver.findElement(By.xpath("//a[@title='Women']"));
			//as.moveToElement(wom).build().perform();
		//	mouseOver(wom, driver);
			//waitimpli(200);
			
			mouseOver(ac.getWom(), driver);
			
			
			//WebElement tshirt = driver.findElement(By.xpath("(//a[@title='T-shirts'])[1]"));
		//	as.click(tshirt).build().perform();
			waitimpli(200);
			Clickmouseover(ac.getTshirt(), driver);
		    
			//JavascriptExecutor js = (JavascriptExecutor) driver;
			//js.executeScript("window.scrollBy(0,500)");
			//WebElement pic1 = driver.findElement(By.xpath("//img[@title='Faded Short Sleeve T-shirts']"));
			//pic1.click();
			//as.moveToElement(pic1).build().perform();
			waitimpli(200);
			
			
			mouseOver(ac.getPic1(), driver);
			
		//	WebElement quickview = driver.findElement(By.xpath("//a[@class='quick-view']"));
			//WebDriverWait wait = new WebDriverWait(driver, 20);
			//wait.until(ExpectedConditions.visibilityOf(quickview));		
			//quickview.click();
			waitimpli(200);
			clickOnElement(ac.getQuickview());
			
		//Thread.sleep(2000);
			//driver.switchTo().frame(0);
			//WebElement fra = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
			//driver.switchTo().frame(fra);
			
			Frameweb(ac.getFra());
			
			
			//WebElement quantity1 = driver.findElement(By.xpath("//i[@class='icon-plus']"));
		    // quantity1.click();
			waitimpli(200);
		clickOnElement(ac.getQuantity1());
			
			
		
			//WebElement size = driver.findElement(By.name("group_1"));
			//Select s = new Select(size);
			//s.selectByValue("2");
			//DropDown(size, "2");
			DropDown(ac.getSize(), "2");
			
			
		//WebElement color = driver.findElement(By.name("Orange"));
		//color.click();
		//clickOnElement(color);
		clickOnElement(ac.getColor());
		
			
			
			
			//WebElement place = driver.findElement(By.name("Submit"));
			//place.click();
			//Thread.sleep(3000);
			
			clickOnElement(ac.getPlace());
			
			driver.switchTo().defaultContent();
			
			//WebElement chek = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
			//chek.click();
			waitimpli(400);
			clickOnElement(ac.getChek());
		
			
			
			//JavascriptExecutor js1 = (JavascriptExecutor) driver;
			//js1.executeScript("window.scrollBy(0,700)");
			//WebElement cout = driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']"));
			//cout.click();
		
		Thread.sleep(3000);
			clickOnElement(ac.getCheckout1());
			
			//JavascriptExecutor js2 = (JavascriptExecutor) driver;
			//js2.executeScript("window.scrollBy(0,700)");
			
			//WebElement ccout = driver.findElement(By.name("processAddress"));
			//ccout.click();
			waitimpli(200);
			clickOnElement(ac.getCcout());
			
			
			//WebElement term = driver.findElement(By.name("cgv"));
			//term.click();
			waitimpli(200);
			clickOnElement(ac.getTerm());
			
			
			//WebElement ccout2 = driver.findElement(By.xpath("//button[@class='button btn btn-default standard-checkout button-medium']"));
			//ccout2.click();
			
			
			clickOnElement(ac.getCheckout2());
			
			
			//JavascriptExecutor js3 = (JavascriptExecutor) driver;
			//js3.executeScript("window.scrollBy(0,700)");
			
			
			//WebElement cheq = driver.findElement(By.xpath("//a[@title='Pay by check.']"));
			//cheq.click();
			
			
			clickOnElement(ac.getCheq());
			
			
			//WebElement conf = driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']");
			//conf.click();
			
			clickOnElement(ac.getForder());
			
			
			screenShot("Imageproject");
			//TaScreenshot ts = (TakesScreenshot) driver;
			//File source = ts.getScreenshotAs(OutputType.FILE);
			//File destination = new File("D:\\saranya\\Automationpractice\\screenshot//mini3.png");
		    //FileUtils.copyFile(source, destination);
		
			
			

		}

	}




