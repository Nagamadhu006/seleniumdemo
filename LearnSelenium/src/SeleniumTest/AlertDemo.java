package SeleniumTest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\jar files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		Alert alert1 = driver.switchTo().alert();
		String alertmessage =driver.switchTo().alert().getText();
		System.out.println(alertmessage);
		Thread.sleep(4000);
		alert1.accept();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Alert alert2 = driver.switchTo().alert();
		String alertmessage2 = driver.switchTo().alert().getText();
		System.out.println(alertmessage2);
		Thread.sleep(4000);
		alert2.dismiss();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Alert alert3 = driver.switchTo().alert();
		Thread.sleep(4000);
		
		alert3.sendKeys("madhu royal");
		alert3.accept();
		
		
		
	
	}

}
