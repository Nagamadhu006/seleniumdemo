package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionnsDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\jar files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("selenium");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
		driver.close();
	}

}
