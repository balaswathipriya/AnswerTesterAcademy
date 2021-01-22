package pack1;


	import javax.print.DocFlavor.STRING;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.Assert;
	import org.testng.annotations.Test;

	public class Testcase3 {
		static String ar;
		static String er;
		static String arr;
		static String err;
	@Test
		public static <actualresult> void m1() {
			// TODO Auto-generated method stub
		     System.setProperty("webdriver.gecko.driver","C:\\Users\\prave\\Downloads\\firefoxgeckodriver\\geckodriver.exe");
			//launch firefox browser
			WebDriver driver = new FirefoxDriver();
			driver.get("https://the-internet.herokuapp.com/");
			driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[31]/a")).click();
			//key1
			driver.findElement(By.id("target")).sendKeys("b");
			 er=driver.findElement(By.id("result")).getText();
			 ar="b";
			 arr=ar.toUpperCase();
			 err=er.substring(13);
			 Assert.assertEquals(arr, err);
		     System.out.println("TEST PASSED3a");
		   //key2
				driver.findElement(By.id("target")).sendKeys("c");
				 er=driver.findElement(By.id("result")).getText();
				 ar="c";
				 arr=ar.toUpperCase();
				 err=er.substring(13);
				 Assert.assertEquals(arr, err);
			     System.out.println("TEST PASSED3b");
			     //key3
					driver.findElement(By.id("target")).sendKeys("d");
					 er=driver.findElement(By.id("result")).getText();
					 ar="d";
					 arr=ar.toUpperCase();
					 err=er.substring(13);
					 Assert.assertEquals(arr, err);
				     System.out.println("TEST PASSED3c");
				     //key4
						driver.findElement(By.id("target")).sendKeys("e");
						 er=driver.findElement(By.id("result")).getText();
						 ar="e";
						 arr=ar.toUpperCase();
						 err=er.substring(13);
						 Assert.assertEquals(arr, err);
					     System.out.println("TEST PASSED3d");
				     
			     
		     

		}

	}



