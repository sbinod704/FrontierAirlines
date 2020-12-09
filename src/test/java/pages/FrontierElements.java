package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FrontierElements {

	static WebElement element;
	


	public static WebElement chooseTrip(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"rbroundtrip\"]"));
		return element;
		
	}

	public static WebElement tripFrom(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@name='kendoDepartFrom_input']"));
		return element;
	}

	public static WebElement tripTo(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@name='kendoArrivalTo_input']"));
		return element;
	}

	public static WebElement bookFrom(WebDriver driver) {
		element = driver.findElement(By.xpath(
				"/html/body/div[2]/div[2]/div[1]/div/div/div[1]/div[3]/div/fieldset/div[1]/div[1]/span/span/span/span"));
		return element;
	}

	public static WebElement bookFromInput(WebDriver driver) {
		element = driver.findElement(By.xpath(
				"/html/body/div[2]/div[2]/div[1]/div/div/div[1]/div[3]/div/fieldset/div[1]/div[1]/span/span/input"));
		return element;
	}

	public static WebElement bookTo(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"toCityDiv\"]/div[1]/span/span/span/span"));
		return element;
	}

	public static WebElement bookToInput(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"kendoArrivalTo_input\"]"));
		return element;
	}

	public static WebElement bookDateFrom(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"departureDateIcon\"]"));
	}

	public static WebElement bookDateFromCalendar(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"1-4-2021\"]"));
	}

	public static WebElement bookDateTo(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"1-14-2021\"]"));
	}

	public static WebElement clickPassengerDropDown(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"findFlights\"]/div[5]/fieldset/div/div/div[3]"));

	}

	public static WebElement travelers(WebDriver driver) {

		return driver.findElement(
				By.xpath("//*[@id=\"findFlights\"]/div[5]/fieldset/div/div/div[1]/section[1]/div/div[2]/img[2]"));

	}

	public static WebElement searchButtom(WebDriver driver) {

		return driver.findElement(By.xpath("//*[@id=\"btnSearch\"]"));
	}

	public static WebElement travelerDropDown(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"findFlights\"]/div[5]/fieldset/div/div/div[1]/div"));
	}
	
	public static WebElement getRoundTripFaresText(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"ibe-depart-section\"]/div/div[2]/div[1]/div[1]"));
	}
	
	public static WebElement getTripInfo(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"ibe-depart-section\"]/div/div[4]/div/div"));
	}

}
