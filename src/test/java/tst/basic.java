package tst;

import java.time.Duration;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import VariousTestPage.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.BasePage;

public class basic extends BasePage {

	@Test(priority = 2)
	public void Test1() throws InterruptedException {

		HomePage p = new HomePage(driver);

		p.departurehit();

		p.destinationhit();

		p.findflightbtnhit();

		p.Chooseflightbtnhit();

		p.enterName("Rohit");

		p.enterAddress("Times Square");

		p.enterCity("London");

		p.enterState("Manchester");

		p.enterZipcode(121);

		p.enterCardType();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3)); // Set implicit wait to 3 seconds

		p.enterCreditCard(453525);

		p.enterMonth(4);

		p.enterYear(2004);

		p.enterNameonCard("Ramesh");

		p.ChoosePurchaseflight();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // Set implicit wait to 5 seconds

		p.Textvisible();

	}

	@Test(priority = 1)

	public void Test3() {

		String actualTitle = driver.getTitle();

		String expectedTitle = "BlazeDemo";

		Assert.assertEquals(actualTitle, expectedTitle);

	}
	
	
	
	
	

}
