package pack1;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcase2 {
static WebElement at;
@Test

public static void m1() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\prave\\Downloads\\firefoxgeckodriver\\geckodriver.exe");
		//launch firefox browser
		WebDriver driver = new FirefoxDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[26]/a")).click();
		
		Thread.sleep(500);
		
		Actions act=new Actions(driver);
		act.sendKeys(Keys.END).build().perform();
		Thread.sleep(500);
		
		act.sendKeys(Keys.END).build().perform();
		Thread.sleep(500);
		act.sendKeys(Keys.HOME).build().perform();
		at=driver.findElement(By.xpath("/html/body/div[2]/div/div/h3"));
		System.out.println("TEST PASSED3");
		Assert.assertTrue(at.isDisplayed());
		System.out.println("TEST PASSED4");
		
	

	}

}



