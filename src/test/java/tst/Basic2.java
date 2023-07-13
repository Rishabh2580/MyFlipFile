package tst;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import VariousTestPage.HomePage;
import VariousTestPage.Negative;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.BasePage;

public class Basic2 extends BasePage {

	@Test

	public void Test2() throws InterruptedException {

		Negative p = new Negative(driver);

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

}
