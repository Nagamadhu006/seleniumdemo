package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigationDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\jar files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://demowebshop.tricentis.com");
		// another type :driver.findElement(By.xpath("//a[@class='ico-register']")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.navigate().back();
		Thread.sleep(4000);
		driver.navigate().forward();
		Thread.sleep(4000);
		driver.navigate().to("http://demowebshop.tricentis.com");
		Thread.sleep(4000);
		driver.navigate().refresh();
		driver.close();
		
		
	}

}
