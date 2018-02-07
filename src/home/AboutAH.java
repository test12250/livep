package home;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AboutAH extends JUnitTestReporter {

	WebDriver driver;
	
	WebElement more,aboutah,whoarewe,whatwedo,Ourservice,complaints,cookiespolicy,privacypolicy,ahbreadcrumb;

	
	@Before
	
	public void openbrowser() throws InterruptedException{
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\srujan.garisekurthi\\Desktop\\geckodriver-v0.16.1-win64\\geckodriver.exe");
		
		driver= new FirefoxDriver();
	}
		
		@Test

		public void testexecution() throws InterruptedException{
			
			driver.get("http://10.66.67.17:5000/");
			
						
			WebDriver webDriver = driver;
			WebDriverWait wait = new WebDriverWait(webDriver, 10);
			more = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='more_tab']")));
			more.click();
			Thread.sleep(5000);
			
			new WebDriverWait(webDriver, 10);
			aboutah = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='more_subnav']/li[1]/a")));
			aboutah.click();
			Thread.sleep(5000);
			
			new WebDriverWait(webDriver, 10);
			whoarewe = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='copy']/div/div[2]/div[2]/ul/li[1]/a")));
			whoarewe.click();
			Thread.sleep(5000);
			
			new WebDriverWait(webDriver, 10);
			ahbreadcrumb = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='text_crumb']/a[2]")));
			ahbreadcrumb.click();
			Thread.sleep(5000);
			
			new WebDriverWait(webDriver, 10);
			whatwedo = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='copy']/div/div[2]/div[2]/ul/li[2]/a")));
			whatwedo.click();
			Thread.sleep(5000);
			
			new WebDriverWait(webDriver, 10);
			ahbreadcrumb = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='text_crumb']/a[2]")));
			ahbreadcrumb.click();
			Thread.sleep(5000);
			
			new WebDriverWait(webDriver, 10);
			Ourservice = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='copy']/div/div[2]/div[2]/ul/li[3]/a")));
			Ourservice.click();
			Thread.sleep(5000);
			
			new WebDriverWait(webDriver, 10);
			ahbreadcrumb = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='text_crumb']/a[2]")));
			ahbreadcrumb.click();
			Thread.sleep(5000);
			
			new WebDriverWait(webDriver, 10);
			complaints = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='copy']/div/div[2]/div[2]/ul/li[4]/a")));
			complaints.click();
			Thread.sleep(5000);
			
			new WebDriverWait(webDriver, 10);
			ahbreadcrumb = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='text_crumb']/a[2]")));
			ahbreadcrumb.click();
			Thread.sleep(5000);
			
			new WebDriverWait(webDriver, 10);
			cookiespolicy = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='copy']/div/div[2]/div[2]/ul/li[5]/a")));
			cookiespolicy.click();
			Thread.sleep(5000);
			
			new WebDriverWait(webDriver, 10);
			ahbreadcrumb = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='text_crumb']/a[2]")));
			ahbreadcrumb.click();
			Thread.sleep(5000);
			
			new WebDriverWait(webDriver, 10);
			privacypolicy = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='copy']/div/div[2]/div[2]/ul/li[6]/a")));
			privacypolicy.click();
			Thread.sleep(5000);
			
			new WebDriverWait(webDriver, 10);
			ahbreadcrumb = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='text_crumb']/a[2]")));
			ahbreadcrumb.click();
			Thread.sleep(5000);
			
			
		}
}