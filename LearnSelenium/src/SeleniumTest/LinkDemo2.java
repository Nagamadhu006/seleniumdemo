package SeleniumTest;


	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	public class LinkDemo2 {
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "D:\\jar files\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.navigate().to("https://www.flipkart.com");
			driver.manage().window().maximize();
			List<WebElement>links=driver.findElements(By.tagName("a"));
			System.out.println("No of Links is available that is :"+links.size());
			for(int i=0;i<links.size();i++){
				System.out.println("Links names are shown:"+links.get(i).getText());
			}
			driver.close();
			
		}

	}


