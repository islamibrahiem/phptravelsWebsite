package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HotelReservationDetails extends PageBase{

	public HotelReservationDetails(WebDriver driver) {
		super(driver);
		jse = (JavascriptExecutor) driver;

		// TODO Auto-generated constructor stub
	}

	@FindBy(linkText = "FACILITIES")
	WebElement facilities;
	@FindBy (xpath = "//*[@id=\"detail-content-sticky-nav-02\"]/form/div/div[2]/div/div[2]/div/div[2]/h5/div/label")
	WebElement executiveSuite;
	@FindBy( xpath = "//*[@id=\"detail-content-sticky-nav-02\"]/form/div/div[2]/div/div[2]/div/div[2]/div[3]/div/select")
	WebElement roomCount;
	@FindBy(css = "button.book_button.btn.btn-success.btn-block.btn-lg.chk")
	WebElement bookNow;
	@FindBy(name = "logged")
	WebElement confirmThisBooking;
	@FindBy(css = "button.btn.btn-default.arrivalpay")
	WebElement payOnArrival;
	@FindBy(linkText = "OK")
	WebElement Ok;

	public void reserveHotelWithMoreDetails() throws InterruptedException
	{
		clickButton(facilities);
		Thread.sleep(10000);
		clickButton(executiveSuite);
		selectOptions = new Select(roomCount);
		selectOptions.selectByVisibleText("2");
		scrollToBottom();
		clickButton(bookNow);
		scrollToBottom();
		clickButton(confirmThisBooking);
		clickButton(payOnArrival);
<<<<<<< HEAD
		//	Thread.sleep(10000);
		//
		//		WebDriverWait wait = new WebDriverWait(driver, 5);
		//		wait.until(ExpectedConditions.alertIsPresent());
		//		
		//		//clickButton(Ok);
		//		
		//		driver.switchTo().alert().accept();

=======
		driver.switchTo().alert().accept();
>>>>>>> 8e74f382316c5f3cd0a1f0698fecc0018005c317

	}

}
