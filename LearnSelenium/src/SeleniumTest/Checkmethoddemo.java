package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkmethoddemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\jar files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		boolean checkpresence =driver.findElement(By.id("Email")).isDisplayed();
		System.out.println(checkpresence);
		boolean checkenable = driver.findElement(By.id("Email")).isEnabled();
		System.out.println(checkenable);
		if(checkpresence==true && checkenable==true)
		{
			driver.findElement(By.id("Email")).sendKeys("pmadhu9985@gmail.com");
			
		}
		driver.close();
		
	}

}
