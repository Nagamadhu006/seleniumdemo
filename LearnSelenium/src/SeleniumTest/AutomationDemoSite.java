package SeleniumTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationDemoSite {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\jar files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Naga");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Bunny");
		 driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']")).sendKeys("H.No: 8-98/A, Royal's street, Marathalli villagae, Bangaluru,Karnataka");
		 driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-valid-email ng-invalid ng-invalid-required']")).sendKeys("madhurudravaram46@gmail.com");
		 driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-invalid ng-invalid-required ng-valid-pattern']")).sendKeys("9985754459");
		 driver.findElement(By.xpath("//label[1]//input[1]")).click();
		 driver.findElement(By.xpath("//input[@name='radiooptions' and @ value='FeMale']")).click();
		 
		List<WebElement>cb=driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(int i=1;i<cb.size();i++)
		{
			cb.get(i).click();
			
				}
		// driver.findElement(By.id("checkbox2")).click();
		 //driver.findElement(By.id("))
		 //driver.findElement(By.id("msdd")).click();
		 //driver.findElement(By.xpath("//a[contains(text(),'Bulgarian')]")).click();

		 
		 Select dropdown = new Select(driver.findElement(By.id("Skills")));  
		 dropdown.selectByVisibleText("C");  
		 Select dropdown1 = new Select(driver.findElement(By.id("countries")));  
		 dropdown1.selectByVisibleText("India"); 
		// Select dropdown1 = new select(driver.findElement(By.id("")
		// Select drpCountry = new Select(driver.findElement(By.name("Country")));
		 //findElement(By.xpath("//option[contains(text(),'1998')]")).click();
		 
		 WebElement year= driver.findElement(By.xpath("//select[@id='yearbox']"));
		 Select sel2 = new Select(year);
		 sel2.selectByValue("2001");
		 
		 List<WebElement>yearcount=sel2.getOptions();
		 System.out.println(yearcount.size());
		 for(int i=0;i<yearcount.size();i++){
			 System.out.println(yearcount.get(i).getText());
			 
		 }
		 WebElement month= driver.findElement(By.xpath("//select[@placeholder='Month']"));
		 Select sel3 = new Select(month);
		 sel2.selectByIndex(3);
		 List<WebElement>monthcount=sel3.getOptions();
		 {
		 System.out.println(yearcount.size());
		 for(int i=0;i<monthcount.size();i++){
			 System.out.println(yearcount.get(i).getText());
		 }
		 //driver.close();
		 WebElement date= driver.findElement(By.xpath("//select[@id='daybox']"));
		 Select sel4 = new Select(date);
		 sel4.selectByIndex(21);
		 List<WebElement>datecount=sel3.getOptions();
		 {
		 System.out.println(datecount.size());
		 for(int i=0;i<monthcount.size();i++){
			 System.out.println(datecount.get(i).getText());
		 }
		 
		 
		 //driver.findElement(By.xpath("//select[@id='County))
		 driver.findElement(By.xpath("//option[contains(text(),'June')]")).click();
		 driver.findElement(By.xpath("//select[@id='daybox']//option[contains(text(),'21')]")).click();
		 
		 driver.findElement(By.id("firstpassword")).sendKeys("Madhu@006");
		 driver.findElement(By.id("secondpassword")).sendKeys("Madhu@006");
		 driver.findElement(By.id("submitbtn")).click();
	}

	
	
	

}
}
}