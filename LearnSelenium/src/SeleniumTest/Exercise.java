package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\jar files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("Email")).sendKeys("pmadhu9985@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("pmadhu");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		String expectedresult = "Demo Web Shop";
		String actuvalresult=driver.getTitle();
		if(expectedresult.equals(actuvalresult))
		{
			System.out.println("sucess");
			
		}
		else
		{
			System.out.println("fail");
		}
		
		String title = driver.getTitle();
		int pagelen= title.length();
		System.out.println(pagelen);
		System.out.println(title);
		String ExecptedResult="http://demowebshop.tricentis.com/login";
		String ActuvalResult=driver.getCurrentUrl();
		System.out.println(ActuvalResult);
		if(ExecptedResult.equals(ActuvalResult))
		{
			System.out.println("sucess url");
		}
		else
		{
			System.out.println("fail url");
		}	
	   String source =driver.getPageSource();
	   System.out.println(source.length());
	   
		
}}
