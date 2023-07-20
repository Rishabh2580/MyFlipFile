package VariousTestPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Negative {

		
		WebDriver driver;
		
		

	public Negative(WebDriver d) {

		driver = d;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//select[@class='form-inline']/option[1]")


	WebElement departurebtn ;


	@FindBy(xpath = "//select[@class='form-inline']/option[1]")

	WebElement destinationbtn ;

	@FindBy(xpath = "/html/body/div[3]/form/div/input")

	WebElement findflightBtnhit;

	@FindBy(xpath = "//input[@class = 'btn btn-small']")

	WebElement Chooseflight ;

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


	@FindBy(xpath = "//h1[contains(text(),'I am Rishabh!')]")

	WebElement element;







	public void departurehit() {

		departurebtn.click();

	}


	public void destinationhit() {

		destinationbtn.click();

	}

	public void findflightbtnhit() {

		findflightBtnhit.click();

	}



	public void Chooseflightbtnhit() {

		Chooseflight.click();

	}



	public void enterName(String uname) {

		Name.sendKeys("Rohit");

	}


	public void enterAddress(String uname) {

		Address.sendKeys("Times Square");

	}


	public void enterCity(String uname) {

		City.sendKeys("London");

	}



	public void enterState(String uname) {

		State.sendKeys("Manchester");

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

		NameonCard.sendKeys("Ramesh");

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
	
