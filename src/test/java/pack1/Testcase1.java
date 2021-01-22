package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcase1 {
	
		static  WebDriver driver ;
		static String aem;
		static String eem;
		static String Aem;
		static String Eem;

				@Test
				public static void senario1() {
					System.setProperty("webdriver.gecko.driver","C:\\Users\\prave\\Downloads\\firefoxgeckodriver\\geckodriver.exe");
					//launch firefox browser
					WebDriver driver = new FirefoxDriver();
					driver.get("https://the-internet.herokuapp.com/");
					driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[21]/a")).click();
				//senario1
				
				driver.findElement(By.id("username")).sendKeys("tomsmith");
				driver.findElement(By.id("password")).sendKeys("superpassword");
				driver.findElement(By.xpath("/html/body/div[2]/div/div/form/button/i")).click();
				aem=driver.findElement(By.id("flash")).getText();
				String eem="Your password is invalid!";
				
				Assert.assertTrue(aem.contains(eem));
				System.out.println("TEST PASSED1");
						
				}
				@Test
				public static void senario2() {
								
						System.setProperty("webdriver.gecko.driver","C:\\Users\\prave\\Downloads\\firefoxgeckodriver\\geckodriver.exe");
						//launch firefox browser
						WebDriver driver = new FirefoxDriver();
						driver.get("https://the-internet.herokuapp.com/");
						driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[21]/a")).click();
				
			//senario2
				driver.findElement(By.id("username")).sendKeys("tomsmit");
				driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
				driver.findElement(By.xpath("/html/body/div[2]/div/div/form/button/i")).click();
				Aem=driver.findElement(By.id("flash")).getText();
				String Eem="Your username is invalid!";
				Assert.assertTrue(Aem.contains(Eem));
				System.out.println("TEST PASSED2");
				}
				@Test
				
				public static void senario3() {
				

					System.setProperty("webdriver.gecko.driver","C:\\Users\\prave\\Downloads\\firefoxgeckodriver\\geckodriver.exe");
					//launch firefox browser
					WebDriver driver = new FirefoxDriver();
					driver.get("https://the-internet.herokuapp.com/");
					driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[21]/a")).click();
						
				//senario3
				driver.findElement(By.id("username")).sendKeys("tomsmith");
			    driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
				driver.findElement(By.xpath("/html/body/div[2]/div/div/form/button/i")).click();
				driver.findElement(By.xpath("/html/body/div[2]/div/div/a/i")).click();
				
				}
		}





