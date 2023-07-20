package VariousTestPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver d) {

		driver = d;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//select[@class='form-inline']")

	WebElement departurebtn;

	@FindBy(xpath = "//select[@name='toPort']")

	WebElement destinationbtn;

	@FindBy(xpath = "/html/body/div[3]/form/div/input")

	WebElement findflightBtnhit;

	@FindBy(xpath = "//input[@class = 'btn btn-small']")

	WebElement Chooseflight;

	@FindBy(xpath = "//input[@name = 'inputName']")

	WebElement Name;

	@FindBy(xpath = "//input[@name = 'address']")

	WebElement Address;

	@FindBy(xpath = "//input[@name = 'city']")

	WebElement City;

	@FindBy(xpath = "//input[@name = 'state']")

	WebElement State;

	@FindBy(xpath = "//input[@name = 'zipCode']")

	WebElement Zipcode;

	@FindBy(xpath = "//select[@id='cardType']")

	WebElement CardType;

	@FindBy(xpath = "//input[@name = 'creditCardNumber']")

	WebElement CreditCard;

	@FindBy(xpath = "//input[@name = 'creditCardMonth']")

	WebElement Month;

	@FindBy(xpath = "//input[@name ='creditCardYear']")

	WebElement Year;

	@FindBy(xpath = "//input[@name ='nameOnCard']")

	WebElement NameonCard;

	@FindBy(xpath = "//input[@class = 'btn btn-primary']")

	WebElement Purchaseflight;

	@FindBy(xpath = "//h1[contains(text(),'Thank you for your purchase today!')]")

	WebElement element;

	public void departurehit() throws InterruptedException {

		Select S1 = new Select(departurebtn);
		Thread.sleep(2000);
		S1.selectByValue("Boston");
		Thread.sleep(2000);

	}

	public void destinationhit() throws InterruptedException {

		Select S2 = new Select(destinationbtn);
		Thread.sleep(4000);
		S2.selectByValue("London");
	
		Thread.sleep(4000);

	}

	public void findflightbtnhit() {

		findflightBtnhit.click();

	}

	public void Chooseflightbtnhit() {

		Chooseflight.click();

	}

	public void enterName(String uname) {

		Name.sendKeys(uname);

	}

	public void enterAddress(String uname) {

		Address.sendKeys(uname);

	}

	public void enterCity(String uname) {

		City.sendKeys(uname);

	}

	public void enterState(String uname) {

		State.sendKeys(uname);

	}

	public void enterZipcode(int zip) {
		Zipcode.sendKeys(Integer.toString(121));
	}

	public void enterCardType() {

		CardType.click();
	}

	public void enterCreditCard(int zip) {
		Zipcode.sendKeys(Integer.toString(453525));
	}

	public void enterMonth(int zip) {
		Zipcode.sendKeys(Integer.toString(4));
	}

	public void enterYear(int zip) {
		Zipcode.sendKeys(Integer.toString(2004));
	}

	public void enterNameonCard(String uname) {

		NameonCard.sendKeys(uname);

	}

	public void ChoosePurchaseflight() {

		Purchaseflight.click();

	}

	public void Textvisible() {

		if (element.isDisplayed()) {
			System.out.println("Text found!");
		} else {
			System.out.println("Text not found.");
		}

	}

}