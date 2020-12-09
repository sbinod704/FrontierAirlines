package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.FrontierElements;

public class FrontierElementsTests {

	static WebDriver driver;
	private static Cookie cookie;

	@Test
	public void frontier() throws InterruptedException {
		invokeBrowserFrontierPage();
		fillForm();
	}

	public static void invokeBrowserFrontierPage() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\libs\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flyfrontier.com");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}

	public static void fillForm() throws InterruptedException {

		FrontierElements.chooseTrip(driver).click();
		Thread.sleep(1000);

		WebElement element = FrontierElements.bookFrom(driver);
		element.click();
		Thread.sleep(1000);

		WebElement input = FrontierElements.bookFromInput(driver);
		input.sendKeys("DFW");
		Thread.sleep(1000);

		WebElement toDropDown = FrontierElements.bookTo(driver);
		toDropDown.click();
		Thread.sleep(1000);

		WebElement toInput = FrontierElements.bookToInput(driver);
		toInput.sendKeys("LAX");
		Thread.sleep(1000);

		toInput.sendKeys(Keys.ENTER);
		Thread.sleep(1000);

		FrontierElements.bookDateFrom(driver).click();
		Thread.sleep(1000);

		FrontierElements.bookDateFromCalendar(driver).click();
		Thread.sleep(1000);

		FrontierElements.bookDateTo(driver).click();
		Thread.sleep(1000);

		FrontierElements.clickPassengerDropDown(driver).click();
		Thread.sleep(1000);

		FrontierElements.travelers(driver).click();
		Thread.sleep(1000);

		FrontierElements.travelerDropDown(driver).click();
		Thread.sleep(1000);

		FrontierElements.searchButtom(driver).click();
		Thread.sleep(1000);

		// Validation
		String roundTripFares = FrontierElements.getRoundTripFaresText(driver).getText().trim();
		Assert.assertEquals("ROUND-TRIP FARES", roundTripFares);

		String tripInfo = FrontierElements.getTripInfo(driver).getText().trim();
		Assert.assertEquals("Dallas/Ft. Worth, TX (DFW) to Los Angeles, CA (LAX)", tripInfo);
	}
}
