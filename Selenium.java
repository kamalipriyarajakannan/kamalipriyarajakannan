import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\workspace\\Demo\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement a = driver.findElement(By.xpath("//input[@name ='email']"));
		a.sendKeys("kamali@gmail.com");
		
		Thread.sleep(5000);
		
		WebElement b = driver.findElement(By.id("pass"));
		b.sendKeys("priya@143");
		
		WebElement c = driver.findElement(By.name("login"));
		c.sendKeys("Click");
		
		Thread.sleep(6000);
	
		driver.close();				
	}
		
		
	}


