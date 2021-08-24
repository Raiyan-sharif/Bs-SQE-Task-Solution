package bs23problem1;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project1 {
	static String paySeraLink = "https://www.paysera.ee/v2/en-EE/fees/currency-conversion-calculator#/";
	static String googlePage = "https:www.google.com";
	private static DecimalFormat df = new DecimalFormat("0.00");
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","//Users//raiyansharif//Documents//Automation//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get(paySeraLink);
	
		driver.findElement(By.cssSelector("[class='js-localization-popover']")).click();
		driver.findElement(By.cssSelector("[id='countries-dropdown']")).click();
		driver.findElement(By.xpath("//*[@aria-labelledby='countries-dropdown']/li[1]")).click();;
		
		driver.close();
	}

}
